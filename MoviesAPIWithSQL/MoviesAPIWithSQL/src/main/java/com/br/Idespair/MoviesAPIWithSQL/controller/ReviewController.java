package com.br.Idespair.MoviesAPIWithSQL.controller;

import com.br.Idespair.MoviesAPIWithSQL.model.Movie;
import com.br.Idespair.MoviesAPIWithSQL.model.Review;
import com.br.Idespair.MoviesAPIWithSQL.service.ReviewService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDateTime;
import java.util.Map;

@RestController
@RequestMapping("api/reviews/")
public class ReviewController {

    @Autowired
    private ReviewService reviewService;

    @PostMapping
    public ResponseEntity<Void> createReview(@RequestBody Review review){
        reviewService.createReview(review);
        return new ResponseEntity<>(HttpStatus.CREATED);
    }

}
