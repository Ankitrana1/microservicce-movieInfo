package com.ankit.movieinfoservice.resources;

import com.ankit.movieinfoservice.model.Movie;
import com.ankit.movieinfoservice.service.IMovieInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("movie")
public class MovieInfoResource {

    @Autowired
    IMovieInfoService movieInfoService;

    @GetMapping(value = "/{id}", produces = "application/json")
    public ResponseEntity<Movie> getMovieInfo(String movieId){
        return ResponseEntity.ok().body(movieInfoService.getMovieInfo(movieId));
    }
}
