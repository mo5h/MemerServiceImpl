package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import java.util.ArrayList;
import java.util.List;

@Controller
public class MemeControllerUsingService {
    @Autowired
    MemerServiceInjectionBased memerServiceInjectionBased;

    public List<Meme> getMemes(){
        return memerServiceInjectionBased.processMemes(new ArrayList<>());

    }
}
