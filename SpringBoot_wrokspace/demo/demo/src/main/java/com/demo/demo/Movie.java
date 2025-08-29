package com.gentech.demo;

public class Movie {
    private String MovieName;
    private String MovieHero;
    private String MovieHeroine;
    private int NOofTheater;

    public Movie(){

    }

    public Movie(String movieName, String movieHero, String movieHeroine, int NOofTheater) {
        MovieName = movieName;
        MovieHero = movieHero;
        MovieHeroine = movieHeroine;
        this.NOofTheater = NOofTheater;
    }

    public String getMovieName() {
        return MovieName;
    }

    public void setMovieName(String movieName) {
        MovieName = movieName;
    }

    public String getMovieHero() {
        return MovieHero;
    }

    public void setMovieHero(String movieHero) {
        MovieHero = movieHero;
    }

    public String getMovieHeroine() {
        return MovieHeroine;
    }

    public void setMovieHeroine(String movieHeroine) {
        MovieHeroine = movieHeroine;
    }

    public int getNOofTheater() {
        return NOofTheater;
    }

    public void setNOofTheater(int NOofTheater) {
        this.NOofTheater = NOofTheater;
    }
}
