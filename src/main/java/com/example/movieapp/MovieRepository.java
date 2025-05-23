package com.example.movieapp;

import com.example.movieapp.Movielist.MovieModel;
import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MovieRepository extends MongoRepository<MovieModel, ObjectId> {

}
