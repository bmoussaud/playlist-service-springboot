package com.example.springboot;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PlaylistController {

    @Autowired
    PlaylistRepository repository;

    @Autowired
    SpotifyLoader loader;

    @GetMapping("/playlist")
    public Iterable<MusicStorePlaylist> all() {
        Iterable<MusicStorePlaylist> playlists = repository.findAll();
        playlists.forEach(t -> t.setTracks(null));
        return playlists;
    }

    @GetMapping("/playlist/{id}")
    public Optional<MusicStorePlaylist> get(@PathVariable Long id) {
        return repository.findById(id);
    }

    @GetMapping("/playlist/load")
    public Integer load() {
        List<MusicStorePlaylist> searchPlaylist = loader.searchPlaylist("rock", 4, 10);
        Iterable<MusicStorePlaylist> saveAll = this.repository.saveAll(searchPlaylist);
        for (MusicStorePlaylist musicStorePlaylist : saveAll) {
            System.out.println(musicStorePlaylist.index);
        }
        return searchPlaylist.size();
    }
}
