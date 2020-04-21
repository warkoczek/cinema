package pl.warkocz.cinema.domain;

import java.time.LocalDateTime;

public class Movie {

    private String title;

    private Genre genre;


    public Movie() {
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Genre getGenre() {
        return genre;
    }

    public void setGenre(Genre genre) {
        this.genre = genre;
    }


}
