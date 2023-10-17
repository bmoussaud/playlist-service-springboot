package com.example.springboot;

import java.util.ArrayList;
import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;

@Entity
public class MusicStorePlaylist {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Integer index;

    String name;

    String description;

    String image;

    int totalTracks;

    int duration;

    @OneToMany(cascade = CascadeType.ALL, mappedBy = "playlist")
    List<MusicStoreTrack> tracks = new ArrayList<>();

    public MusicStorePlaylist() {

    }

    public MusicStorePlaylist(String name, String description, String image) {
        this.name = name;
        this.description = description;
        this.image = image;
        this.duration = 0;
        this.totalTracks = 0;
    }

    @Override
    public String toString() {
        return "MusicStorePlaylist [index=" + index + ", name=" + name + ", description=" + description + ", image="
                + image + ", totalTracks=" + totalTracks + ", duration=" + duration + ", tracks=" + tracks + "]";
    }

    public void addTrack(String name, String artist, String album, Integer durationMs) {
        MusicStoreTrack e = new MusicStoreTrack(name, artist, album, durationMs);
        e.setPlaylist(this);
        totalTracks = totalTracks + 1;
        duration = duration + durationMs;
        tracks.add(e);
    }

    public Integer getIndex() {
        return index;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public String getImage() {
        return image;
    }

    public List<MusicStoreTrack> getTracks() {

        return tracks;
    }

    public void setIndex(Integer index) {
        this.index = index;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public void setTracks(List<MusicStoreTrack> tracks) {
        this.tracks = tracks;
    }

    public Integer getTotalTracks() {
        return totalTracks;
    }

    public void setTotalTracks(Integer totalTracks) {
        this.totalTracks = totalTracks;
    }

    public Integer getDuration() {
        return duration;
    }

    public void setDuration(Integer duration) {
        this.duration = duration;
    }

}
