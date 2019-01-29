package com.example.demo;

import java.util.List;

public class DodgeMeme implements Memer {
    @Override
    public void memeIt(List<Meme> memeList) {
        memeList.add(new Meme("dodge this"));
    }
}
