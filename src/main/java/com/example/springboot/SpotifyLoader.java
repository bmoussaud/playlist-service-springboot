package com.example.springboot;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import com.neovisionaries.i18n.CountryCode;

import se.michaelthelin.spotify.SpotifyApi;
import se.michaelthelin.spotify.model_objects.credentials.ClientCredentials;
import se.michaelthelin.spotify.model_objects.specification.Paging;
import se.michaelthelin.spotify.model_objects.specification.Playlist;
import se.michaelthelin.spotify.model_objects.specification.PlaylistSimplified;
import se.michaelthelin.spotify.model_objects.specification.Track;
import se.michaelthelin.spotify.requests.authorization.client_credentials.ClientCredentialsRequest;
import se.michaelthelin.spotify.requests.data.search.simplified.SearchPlaylistsRequest;

@Service
public class SpotifyLoader {

    @Value("${spotify.clientId}")
    String clientId;

    @Value("${spotify.clientSecret}")
    String clientSecret;

    @Autowired
    PlaylistRepository repository;

    public List<MusicStorePlaylist> searchPlaylist(String kind, int limits, int tracksbyplaylist) {

        List<MusicStorePlaylist> playlists = new ArrayList<>();                        
        SpotifyApi spotifyApi = new SpotifyApi.Builder()
                .setClientId(clientId).setClientSecret(clientSecret)
                .build();

        final ClientCredentialsRequest clientCredentialsRequest = spotifyApi.clientCredentials().build();

        ClientCredentials clientCredentials;
        try {
            clientCredentials = clientCredentialsRequest.execute();
        } catch (Exception e) {
            throw new MusicStoreException("Spotify Credential Request failed.", e);
        }

        spotifyApi.setAccessToken(clientCredentials.getAccessToken());

        SearchPlaylistsRequest request = spotifyApi.searchPlaylists(kind).market(CountryCode.FR).limit(limits).build();
        try {
            Paging<PlaylistSimplified> results = request.execute();
            System.out.println("Total" + results.getTotal());
            for (PlaylistSimplified pls : results.getItems()) {
                Playlist plfull = spotifyApi.getPlaylist(pls.getId()).build().execute();
                MusicStorePlaylist msplaylist = new MusicStorePlaylist(plfull.getName(), plfull.getDescription(),
                        plfull.getImages()[0].getUrl());
                playlists.add(msplaylist);
                String[] ids = Arrays.asList(plfull.getTracks().getItems()).stream().map(t -> t.getTrack().getId())
                        .limit(tracksbyplaylist)
                        .toArray(String[]::new);
                for (Track track : spotifyApi.getSeveralTracks(ids).build().execute()) {

                    msplaylist.addTrack(track.getName(), track.getArtists()[0].getName(), track.getAlbum().getName(),
                            track.getDurationMs());
                }

            }

        } catch (Exception e) {
            throw new MusicStoreException("Spotify Search Request failed", e);
        }
        System.out.println(playlists);
        return playlists;
    }

}
