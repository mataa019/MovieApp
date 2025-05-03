package com.example.movieapp.Movielist;

public class MovieModel {
    public String Name;
    public  String Director;
    public Integer Year;

    public MovieModel(String name, String director, Integer year) {
        Name = name;
        Director = director;
        Year = year;
    }

    public String getName() {
        return Name;
    }

    public String getDirector() {
        return Director;
    }

    public Integer getYear() {
        return Year;
    }

    public void setName(String name) {
        Name = name;
    }

    public void setDirector(String director) {
        Director = director;
    }

    public void setYear(Integer year) {
        Year = year;
    }
}
