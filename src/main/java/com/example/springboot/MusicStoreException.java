package com.example.springboot;

public class MusicStoreException extends RuntimeException {

    public MusicStoreException(String message, Exception e) {
        super(message, e);
    }

}
