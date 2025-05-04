package com.example.movieapp;

import com.example.movieapp.Movielist.MovieModel;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1/movies")
public class MovieController {
   @GetMapping
   public ResponseEntity<String> getallMovies(){
      return new ResponseEntity<String>("All Movies", HttpStatus.OK);
   }




}
