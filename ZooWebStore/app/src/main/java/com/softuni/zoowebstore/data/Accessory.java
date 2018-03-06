package com.softuni.zoowebstore.data;


import com.softuni.zoowebstore.data.BaseModel;

public class Accessory extends BaseModel {

    private String name;
    private String description;
    private String imageUrl;
    private boolean isLiked;

    public Accessory(String name, String description, String imageUrl) {
        this.name = name;
        this.description = description;
        this.imageUrl = imageUrl;
        this.isLiked = false;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public boolean isLiked() {
        return isLiked;
    }

    public void setLiked() {
        this.isLiked = true;
    }
}
