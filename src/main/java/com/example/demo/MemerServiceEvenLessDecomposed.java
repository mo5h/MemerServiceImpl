package com.example.demo;

import java.util.List;

import static java.util.List.copyOf;

public class MemerServiceEvenLessDecomposed {

    public List<Meme> processMemes(List<Meme> memes){
        List<Meme> ourMemes = copyOf(memes);
        dodgeMemeIt(ourMemes);
        notFuckedOnMemeIt(ourMemes);
        return ourMemes;

    }

    public void dodgeMemeIt(List<Meme> memeList) {
        memeList.add(new Meme("dodge this"));
    }

    public void notFuckedOnMemeIt(List<Meme> memeList) {
        memeList.add(new Meme("Not Fucked on"));
    }


}
