package com.br.Idespair.MoviesAPIWithSQL;

import com.br.Idespair.MoviesAPIWithSQL.model.Movie;
import com.br.Idespair.MoviesAPIWithSQL.model.Review;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import java.time.Instant;
import java.time.LocalDateTime;
import java.time.LocalTime;

import static org.junit.jupiter.api.Assertions.assertNotNull;

@SpringBootTest
class MoviesApiWithSqlApplicationTests {

	@Test
	void contextLoads() {
	}

	private Movie movie;

	@Test
	void createReview(){

		Review review = new Review();
		review.setReview_id(1L);
		review.setBody("Great movie, whole family love it");
		review.setMovie(movie);

		assertNotNull(review);
		assertNotNull(review.getReview_id());
		assertNotNull(review.getBody());
	}

}
