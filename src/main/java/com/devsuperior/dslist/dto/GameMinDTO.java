package com.devsuperior.dslist.dto;

import com.devsuperior.dslist.entities.Game;

public class GameMinDTO {
    public Long id;
    public String title;
    public int year;
    public String img_url;
    public String short_description;

    public GameMinDTO(Game entity) {
        id = entity.getId();
        title = entity.getTitle();
        year = entity.getYear();
        img_url = entity.getImg_url();
        short_description = entity.getShort_description();
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

    public String getImg_url() {
        return img_url;
    }

    public String getShort_description() {
        return short_description;
    }
}
