package com.filmbite.cloud.service;

import com.filmbite.cloud.data.Movies;
import com.filmbite.cloud.repository.MovieRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MovieService {
    private final MovieRepository movieRepository;

    @Autowired
    public MovieService(MovieRepository movieRepository) {
        this.movieRepository = movieRepository;
    }

    public List<Movies> getAllMovies() {
        return movieRepository.findAll();
    }
}
