package com.devsuperior.dslist.entities;

import jakarta.persistence.*;

@Entity //Configura a Classe para ser uma Tabela do BD
@Table(name = "TB_Game")
public class Game {
    @Id
    @GeneratedValue
    public Long id;
    public String title;

    @Column(name = "game_year")
    public int year;
    public String genre;
    public String platfomrs;
    public Double score;
    public String imgUrl;
    public String shortDescription;
    public String logDescription;

    public Game(Long id, String title, int year, String genre, String platfomrs, Double score, String imgUrl, String shortDescription, String logDescription) {
        this.id = id;
        this.title = title;
        this.year = year;
        this.genre = genre;
        this.platfomrs = platfomrs;
        this.score = score;
        this.imgUrl = imgUrl;
        this.shortDescription = shortDescription;
        this.logDescription = logDescription;
    }
}
