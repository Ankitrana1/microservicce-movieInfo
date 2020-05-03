package com.ankit.movieinfoservice.service.impl;

import com.ankit.movieinfoservice.model.Movie;
import com.ankit.movieinfoservice.service.IMovieInfoService;
import org.springframework.stereotype.Service;

@Service
public class MovieInfoService implements IMovieInfoService {

    @Override
    public Movie getMovieInfo(String movieId){
        return new Movie("987", "Anabelle","A horror story about a doll");
    }
}
