package com.br.Idespair.MoviesAPIWithSQL.model;

import jakarta.persistence.*;
;
import lombok.Data;


import java.util.List;
@Entity
@Data
@Table(name = "movies")
public class Movie {
        @Id
        @GeneratedValue(strategy = GenerationType.AUTO)
        @Column(name = "imdbid")
        private String imdbId;
        private String title;
        @Column(name = "releasedate")
        private String releaseDate;
        private String poster;
        private List<String> genres;
        @OneToMany(mappedBy = "movie")
        private List<Review> reviews;

        public Movie(String imdbId, String title, String releaseDate, String trailerLink, String poster, List<String> genres, List<String> backdrops) {
                this.imdbId = imdbId;
                this.title = title;
                this.releaseDate = releaseDate;
                this.poster = poster;
                this.genres = genres;
        }

        public String getImdbId() {
                return imdbId;
        }

        public void setImdbId(String imdbId) {
                this.imdbId = imdbId;
        }

        public String getTitle() {
                return title;
        }

        public void setTitle(String title) {
                this.title = title;
        }

        public String getReleaseDate() {
                return releaseDate;
        }

        public void setReleaseDate(String releaseDate) {
                this.releaseDate = releaseDate;
        }

        public String getPoster() {
                return poster;
        }

        public void setPoster(String poster) {
                this.poster = poster;
        }

        public List<String> getGenres() {
                return genres;
        }

        public void setGenres(List<String> genres) {
                this.genres = genres;
        }

        public Movie(){}

        public Movie(String imdbId, List<Review> reviews) {
                this.imdbId = imdbId;
        }

        public List<Review> getReviews() {
                return reviews;
        }

        public void setReviews(List<Review> reviews) {
                this.reviews = reviews;
        }
}
