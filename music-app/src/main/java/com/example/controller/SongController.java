package com.example.controller;

import com.example.model.Song;
import com.example.service.SongService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@Controller
public class SongController {
    @Autowired
    private SongService songService;
    @GetMapping("/songs")
    public ModelAndView showList(){
        ModelAndView modelAndView = new ModelAndView("list");
        List<Song> songs = songService.findAll();
        modelAndView.addObject("songs",songs);
        return modelAndView;
    }
}
