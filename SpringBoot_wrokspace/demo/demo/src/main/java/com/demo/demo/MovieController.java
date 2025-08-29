package com.gentech.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;
@RestController
public class MovieController {
    @GetMapping("/Movie")
    public Movie getMovie(){
        Movie me=new Movie("Appu","Puneeth","Rakshita",45);
        return me;
    }

    @GetMapping("/Movie1")
    public Movie getMovie1(){
        Movie me=new Movie();
        me.setMovieName("Googly");
        me.setMovieHero("Yash");
        me.setMovieHeroine("Kriti Kharbanda");
        me.setNOofTheater(23);
        return me;
    }

    @GetMapping("/Movies")
    public List<Movie> getAllMovie() {
        List<Movie> mv = new ArrayList<>();
        mv.add(new Movie("Hudugaru", "Puneeth", "Radhika Pandit", 32));
        mv.add(new Movie("KempeGouda", "Sudeep", "Ragini Dwivedi", 49));
        mv.add(new Movie("Mugaru Male", "Ganesh", "Pooja Gandhi", 39));
        return mv;
    }
}
