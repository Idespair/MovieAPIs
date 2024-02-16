package com.br.Idespair.MoviesAPIWithSQL.service;

import com.br.Idespair.MoviesAPIWithSQL.model.Movie;
import com.br.Idespair.MoviesAPIWithSQL.model.Review;
import com.br.Idespair.MoviesAPIWithSQL.repository.IMovieRepository;
import com.br.Idespair.MoviesAPIWithSQL.repository.IReviewRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.time.LocalDateTime;

@Service
public class ReviewService {
        @Autowired
        private IReviewRepository reviewRepository;
        @Autowired
        private IMovieRepository movieRepository;
        private Movie movie;

    public void createReview(Review review) {
        review.setMovie(movie);
        review.setBody(review.getBody());
        review.setCreated(LocalDateTime.now());
        review.setUpdated(LocalDateTime.now());
        reviewRepository.save(review);
    }


}
