package com.example.movieapp;

import com.example.movieapp.Movielist.MovieModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/movies")
public class MovieController {

   @Autowired
   private  MovieService movieService;
   @GetMapping
   public ResponseEntity<List<MovieModel>> getallMovies(){
      return new ResponseEntity<List<MovieModel>>(movieService.allMovies(),HttpStatus.OK);
   }




}
