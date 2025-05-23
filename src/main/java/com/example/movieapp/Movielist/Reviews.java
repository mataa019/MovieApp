package com.example.movieapp.Movielist;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.bson.types.ObjectId;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collation = "reviews")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Reviews {
    private ObjectId id;
    private String reviewBody;

}
