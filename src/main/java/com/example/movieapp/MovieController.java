package com.example.movieapp;

import com.example.movieapp.Movielist.MovieModel;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin
public class MovieController {
    MovieModel  model = new MovieModel("John Walker", "Mike", 2015);

    @GetMapping("/model/{getallMovies}")
    public void GetListofMovies(@PathVariable String getallMovies)
    {
    }

}
