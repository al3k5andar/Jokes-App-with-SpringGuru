package com.am.jokesapp.services;

import com.am.jokesapp.model.Joke;
import guru.springframework.norris.chuck.ChuckNorrisQuotes;
import org.springframework.stereotype.Service;

@Service
public class JokeServiceImpl implements JokeService
{
    @Override
    public Joke getJoke() {
        ChuckNorrisQuotes quotes= new ChuckNorrisQuotes();
        return new Joke(quotes.getRandomQuote());
    }
}
