package com.br.Idespair.MoviesAPIWithSQL.service;

import com.br.Idespair.MoviesAPIWithSQL.model.Movie;
import com.br.Idespair.MoviesAPIWithSQL.model.Review;
import com.br.Idespair.MoviesAPIWithSQL.repository.IMovieRepository;
import com.br.Idespair.MoviesAPIWithSQL.repository.IReviewRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.time.LocalDateTime;
import java.util.List;

@Service
public class ReviewService {

        @Autowired
        private IReviewRepository reviewRepository;

        @Autowired
        private IMovieRepository movieRepository;

        @Transactional  // Add this annotation to enable Spring-managed transactions
        public Review createReview(String reviewBody, String imdbId){

            Review review = new Review(reviewBody,imdbId, LocalDateTime.now(), LocalDateTime.now());
            reviewRepository.save(review);

            Movie movie = new Movie();
            movie.setReviews((List<Review>) review);

            return review;
        }
    }
