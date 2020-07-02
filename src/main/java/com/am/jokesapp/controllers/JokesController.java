package com.am.jokesapp.controllers;

import com.am.jokesapp.services.JokeService;
import org.springframework.stereotype.Controller;

@Controller
public class JokesController {

    private JokeService jokeService;

    public JokesController(JokeService jokeService) {
        this.jokeService = jokeService;
    }

}
