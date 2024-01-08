package com.br.Idespair.MoviesAPIWithSQL.service;

import com.br.Idespair.MoviesAPIWithSQL.model.Review;
import com.br.Idespair.MoviesAPIWithSQL.repository.IReviewRepository;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ReviewService {

    @Autowired
    private IReviewRepository reviewRepository;

    public Review createReview(String reviewBody, String imdbId){
        try (EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("moviesapi")) {
            EntityManager entityManager = entityManagerFactory.createEntityManager();

            entityManager.getTransaction().begin();
            entityManager.persist(createReview(reviewBody, imdbId));
            entityManager.getTransaction().commit();

            entityManager.close();
            entityManagerFactory.close();
        }

        return new Review();

    }
}
