package com.example.demo;

import java.util.List;

import static java.util.List.copyOf;

public class MemeServiceDirectCallBased {

    public List<Meme> processMemes(List<Meme> memes){
        List<Meme> ourMemes = copyOf(memes);
        new DodgeMeme().memeIt(ourMemes);
        new NotFuckedOnMeme().memeIt(ourMemes);
        return ourMemes;

    }
}
