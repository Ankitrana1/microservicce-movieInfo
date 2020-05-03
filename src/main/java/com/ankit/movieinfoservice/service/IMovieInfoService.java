package com.ankit.movieinfoservice.service;

import com.ankit.movieinfoservice.model.Movie;

public interface IMovieInfoService {

    Movie getMovieInfo(String movieId);
}
