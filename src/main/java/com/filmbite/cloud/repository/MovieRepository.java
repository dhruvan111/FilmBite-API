package com.filmbite.cloud.repository;

import com.filmbite.cloud.data.Movies;
import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MovieRepository extends MongoRepository<Movies, ObjectId> {
}
