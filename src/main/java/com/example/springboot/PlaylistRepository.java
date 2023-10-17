package com.example.springboot;

import org.springframework.data.repository.CrudRepository;

public interface PlaylistRepository extends CrudRepository<MusicStorePlaylist, Long> {
    
}
