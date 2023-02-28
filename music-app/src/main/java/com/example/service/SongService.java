package com.example.service;

import com.example.model.Song;

import java.util.List;

public interface SongService {
    List<Song> findAll();
    Song findOne(Long id);
    Song save(Song song);
}
