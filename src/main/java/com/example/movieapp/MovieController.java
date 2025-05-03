package com.example.movieapp;

import com.example.movieapp.Movielist.MovieModel;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin
public class MovieController {
    MovieModel  model = new MovieModel("John Walker", "Mike", 2015);


}
