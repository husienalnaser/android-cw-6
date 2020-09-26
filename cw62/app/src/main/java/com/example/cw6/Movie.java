package com.example.cw6;

public class Movie {
    private String title;
    private String mainactor;
    private Double movieRate;
    private int pgRate;
    private String genre;

    public Movie(String title, String mainactor, Double movieRate, int pgRate, String genre) {
        this.title = title;
        this.mainactor = mainactor;
        this.movieRate = movieRate;
        this.pgRate = pgRate;
        this.genre = genre;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getMainactor() {
        return mainactor;
    }

    public void setMainactor(String mainactor) {
        this.mainactor = mainactor;
    }

    public Double getMovieRate() {
        return movieRate;
    }

    public void setMovieRate(Double movieRate) {
        this.movieRate = movieRate;
    }

    public int getPgRate() {
        return pgRate;
    }

    public void setPgRate(int pgRate) {
        this.pgRate = pgRate;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }
}
