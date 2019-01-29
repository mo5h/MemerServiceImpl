package com.example.demo;

import java.util.List;

public class NotFuckedOnMeme implements Memer {
    @Override
    public void memeIt(List<Meme> memeList) {
        memeList.add(new Meme("Not Fucked on"));
    }
}
