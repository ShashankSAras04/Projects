package com.gentech.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;
@RestController
public class FlowerController {
    @GetMapping("/Flower")
    public Flower getFlower(){
        Flower fm=new Flower("Jasmine","White",5);
        return fm;
    }

    @GetMapping("/Flower1")
    public Flower getFlower1(){
        Flower fm=new Flower();
        fm.setFName("Lotus");
        fm.setFColor("Pink");
        fm.setNOofPetals(10);
        return fm;
    }

    @GetMapping("/Flowers")
    public List<Flower> getAllFlowers() {
        List<Flower> Fm = new ArrayList<>();
        Fm.add(new Flower("Habiscus", "Yellow", 5));
        Fm.add(new Flower("Bluebells", "Violet-Blue", 6));
        Fm.add(new Flower("Morning glorry", "Purple", 5));
        return Fm;
    }
}
