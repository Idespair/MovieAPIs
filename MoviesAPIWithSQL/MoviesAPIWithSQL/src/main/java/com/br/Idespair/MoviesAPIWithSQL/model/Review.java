package com.br.Idespair.MoviesAPIWithSQL.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import java.time.LocalDateTime;
import java.util.List;

@Entity
@Table(name = "reviews")
@Data
public class Review {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "reviewid")
    private Long review_id;
    private String body;
    @Column(name = "datecreation")
    private LocalDateTime created;
    @Column(name = "dateupdate")
    private LocalDateTime updated;
    @ManyToOne
    @JoinColumn(name = "movie")
    private Movie movie;

    public Review(String body, LocalDateTime created, LocalDateTime updated) {
        this.body = body;
        this.created = created;
        this.updated = updated;
    }

    public Review(String body, LocalDateTime created, LocalDateTime updated, Movie movie) {
        this.body = body;
        this.created = created;
        this.updated = updated;
        this.movie = movie;
    }

    public Review(){}

    public Review(String reviewBody, String imdbId, LocalDateTime now, LocalDateTime now1) {
    }

    public Long getReview_id() {
        return review_id;
    }

    public void setReview_id(Long review_id) {
        this.review_id = review_id;
    }

    public String getBody() {
        return body;
    }

    public void setBody(String body) {
        this.body = body;
    }

    public LocalDateTime getCreated() {
        return created;
    }

    public void setCreated(LocalDateTime created) {
        this.created = created;
    }

    public LocalDateTime getUpdated() {
        return updated;
    }

    public void setUpdated(LocalDateTime updated) {
        this.updated = updated;
    }

    public Movie getMovie() {
        return movie;
    }

    public void setMovie(Movie movie) {
        this.movie = movie;
    }
}
