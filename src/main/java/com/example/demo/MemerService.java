package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Component;

import java.util.List;

import static java.util.List.copyOf;

@Component
public class MemerService {

    @Autowired
    ApplicationContext applicationContext;

    public List<Meme> processMemes(List<Meme> memes){
        List<Meme> ourMemes = copyOf(memes);
        applicationContext.getBeansOfType(Memer.class).forEach((s, memer) -> memer.memeIt(ourMemes));
        return ourMemes;

    }

}
