package com.Soundsystem;

import org.springframework.stereotype.Component;
import org.springframework.beans.annotation.*;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
/**
 * Created by arvin on 2017/12/14.
 */
@RestController
@RequestMapping


@Component
public class SgtPeppers implements CompactDisc {
    private String title = "Sgt.pepers lonely Hearts Club Brand";
    private String artist = "the Beatles";
    public void play(){
        System.out.println("Playing "+ title+"by"+ artist);
    }
}
