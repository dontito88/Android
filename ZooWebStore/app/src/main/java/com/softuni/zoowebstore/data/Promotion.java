package com.softuni.zoowebstore.data;

import com.softuni.zoowebstore.data.BaseModel;

public class Promotion extends BaseModel {

    private String imageUrl;

    public Promotion(String imageUrl) {
        this.imageUrl = imageUrl;
    }

    public String getImageUrl() {
        return imageUrl;
    }
}
