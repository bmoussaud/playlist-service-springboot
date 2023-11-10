package com.example.springboot;

import java.util.List;
import java.util.Optional;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class PlaylistController {

    static Logger logger = LoggerFactory.getLogger(PlaylistController.class);

    @Autowired
    PlaylistRepository repository;

    @Autowired
    SpotifyLoader loader;

    @GetMapping("/playlist")
    public Iterable<MusicStorePlaylist> all() {
        logger.info("get playlist");
        Iterable<MusicStorePlaylist> playlists = repository.findAll();
        playlists.forEach(t -> t.setTracks(null));
        return playlists;
    }

    @GetMapping("/playlist/{id}")
    public Optional<MusicStorePlaylist> get(@PathVariable Long id) {
        logger.info("get playlist item [" + id + "]");
        return repository.findById(id);
    }

    @GetMapping("/playlist/load/{keyword}")
    public Integer load(@PathVariable String keyword) {
        logger.info("load playlist [" + keyword + "]");
        List<MusicStorePlaylist> searchPlaylist = loader.searchPlaylist(keyword, 10, 10);
        Iterable<MusicStorePlaylist> saveAll = this.repository.saveAll(searchPlaylist);
        for (MusicStorePlaylist musicStorePlaylist : saveAll) {
            System.out.println(musicStorePlaylist.index);
        }
        return searchPlaylist.size();
    }

    @PostMapping("/playlist/postload")
    public Integer postload(@RequestBody String keyword) {
        logger.info("load playlist [" + keyword + "]");
        List<MusicStorePlaylist> searchPlaylist = loader.searchPlaylist(keyword, 10, 10);
        Iterable<MusicStorePlaylist> saveAll = this.repository.saveAll(searchPlaylist);
        for (MusicStorePlaylist musicStorePlaylist : saveAll) {
            System.out.println(musicStorePlaylist.index);
        }
        return searchPlaylist.size();
    }

    @GetMapping("/playlist/clear")
    public void clear() {
        logger.info("clear playlist");
        repository.deleteAll();
    }
}
