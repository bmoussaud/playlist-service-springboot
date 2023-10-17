package com.example.springboot;

import com.fasterxml.jackson.annotation.JsonIgnore;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

@Entity
public class MusicStoreTrack {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Integer index;

    String title;

    String artist;

    String album;

    Integer duration;

    @ManyToOne
    @JoinColumn(name = "PLAYSLIST_ID", nullable = false)
    @JsonIgnore
    MusicStorePlaylist playlist;

    public MusicStoreTrack() {

    }

    public MusicStoreTrack(String title, Integer duration) {
        this.title = title;
        this.duration = duration;
    }

    public MusicStoreTrack(String title, String artist, String album, Integer duration) {
        this.title = title;
        this.artist = artist;
        this.album = album;
        this.duration = duration;
    }

    @Override
    public String toString() {
        return "MusicStoreTrack [index=" + index + ", title=" + title + ", artist=" + artist + ", album=" + album
                + ", duration=" + duration + "]";
    }

    public void setPlaylist(MusicStorePlaylist playlist) {
        this.playlist = playlist;
    }

    public Integer getIndex() {
        return index;
    }

    public void setIndex(Integer index) {
        this.index = index;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getArtist() {
        return artist;
    }

    public void setArtist(String artist) {
        this.artist = artist;
    }

    public String getAlbum() {
        return album;
    }

    public void setAlbum(String album) {
        this.album = album;
    }

    public Integer getDuration() {
        return duration;
    }

    public void setDuration(Integer duration) {
        this.duration = duration;
    }

    public MusicStorePlaylist getPlaylist() {
        return playlist;
    }

}
