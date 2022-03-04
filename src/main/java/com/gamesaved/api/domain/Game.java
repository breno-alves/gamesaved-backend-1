package com.gamesaved.api.domain;

import java.util.Date;

public class Game {
    private String uuid;
    private Date released;
    private String image;
    private String imageShort;
    private double rating;
    private Integer platform;

    public Game() {

    }

    public Game(String uuid, Date released, String image, String imageShort, double rating, Integer platform) {
        this.uuid = uuid;
        this.released = released;
        this.image = image;
        this.imageShort = imageShort;
        this.rating = rating;
        this.platform = platform;
    }

    public String getUuid() {
        return uuid;
    }

    public void setUuid(String uuid) {
        this.uuid = uuid;
    }

    public Date getReleased() {
        return released;
    }

    public void setReleased(Date released) {
        this.released = released;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public String getImageShort() {
        return imageShort;
    }

    public void setImageShort(String imageShort) {
        this.imageShort = imageShort;
    }

    public double getRating() {
        return rating;
    }

    public void setRating(double rating) {
        this.rating = rating;
    }

    public Integer getPlatform() {
        return platform;
    }

    public void setPlatform(Integer platform) {
        this.platform = platform;
    }
}
