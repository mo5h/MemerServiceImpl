package com.example.demo;

import java.util.List;

import static java.util.List.copyOf;

public class MemeControllerDirectCallBased {

    public List<Meme> processMemes(List<Meme> memes){
        List<Meme> ourMemes = copyOf(memes);
        new DodgeMeme().memeIt(memes);
        new NotFuckedOnMeme().memeIt(memes);
        return ourMemes;

    }
}
