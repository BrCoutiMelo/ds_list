package com.devsuperior.dslist.entities;

import jakarta.persistence.*;

@Entity //Configura a Classe para ser uma Tabela do BD
@Table(name = "TB_Game")
public class Game {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public Long id;
    public String title;

    @Column(name = "game_year")
    public int year;
    public String genre;
    public String platforms;
    public Double score;
    public String img_url;

    @Column(columnDefinition = "TEXT")
    public String short_description;

    @Column(columnDefinition = "TEXT")
    public String long_description;

    public Game() {

    }

    public Game(Long id, String title, int year, String genre, String platforms, Double score, String imgUrl, String shortDescription, String logDescription) {
        this.id = id;
        this.title = title;
        this.year = year;
        this.genre = genre;
        this.platforms = platforms;
        this.score = score;
        this.img_url = imgUrl;
        this.short_description = shortDescription;
        this.long_description = logDescription;
    }

    public Long getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public int getYear() {
        return year;
    }

    public String getGenre() {
        return genre;
    }

    public String getPlatforms() {
        return platforms;
    }

    public Double getScore() {
        return score;
    }

    public String getImg_url() {
        return img_url;
    }

    public String getShort_description() {
        return short_description;
    }

    public String getLong_description() {
        return long_description;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public void setPlatforms(String platforms) {
        this.platforms = platforms;
    }

    public void setScore(Double score) {
        this.score = score;
    }

    public void setImg_url(String img_url) {
        this.img_url = img_url;
    }

    public void setShort_description(String short_description) {
        this.short_description = short_description;
    }

    public void setLong_description(String long_description) {
        this.long_description = long_description;
    }
}
