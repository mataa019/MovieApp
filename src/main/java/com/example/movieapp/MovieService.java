package com.example.movieapp;

import com.example.movieapp.Movielist.MovieModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MovieService {
    @Autowired
    private MovieRepository movieRepository;
   public List<MovieModel> allMovies(){
   return movieRepository.findAll();
}
}
