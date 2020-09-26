package com.example.cw6;

public class Movie {
    private String title;
    private String  Mainactor;
    private Double movieRate;
    private int pgRate;
    private String genre;

    public Movie(String title, String Mainactor, Double movieRate, int pgRate, String genre) {
        this.title = title;
        this.Mainactor = Mainactor;
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
        return Mainactor;
    }

    public void setMainactor(String mainactor) {
        this.Mainactor = mainactor;
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
