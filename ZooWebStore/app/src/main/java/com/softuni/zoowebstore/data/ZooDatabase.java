package com.softuni.zoowebstore.data;

import com.softuni.zoowebstore.data.Accessory;

import java.util.Arrays;
import java.util.List;

public class ZooDatabase {

    private static List<BaseModel> database;

    public static List<BaseModel> getDatabase() {
        if (database == null){
            database = generateData();
        }
        return database;
    }

    private static List<BaseModel> generateData() {
        return Arrays.asList(
                new Accessory(
                        "Toothbrush",
                        "Super soft cat toothbrush!",
                        "https://i2.wp.com/best1x.com/wp-content/uploads/2017/05/Best-Cat-Toothbrush-Toothpaste.jpg?resize=539%2C359&ssl=1"),
                new Accessory(
                        "Shampoo",
                        "Best feather-fluffing shampoo for penguines",
                        "https://78.media.tumblr.com/61a73343131b873f1e26734e3dafd2c6/tumblr_mo5jyk66ZW1qzya49o1_540.jpg"),
                new Accessory(
                        "Toothbrush",
                        "Super soft cat toothbrush!",
                        "https://i2.wp.com/best1x.com/wp-content/uploads/2017/05/Best-Cat-Toothbrush-Toothpaste.jpg?resize=539%2C359&ssl=1"),
                new Accessory(
                        "Shampoo",
                        "Best feather-fluffing shampoo for penguines",
                        "https://78.media.tumblr.com/61a73343131b873f1e26734e3dafd2c6/tumblr_mo5jyk66ZW1qzya49o1_540.jpg"),
                new Promotion("https://media.mnn.com/assets/images/2013/10/Corgeek.jpg"),
                new Accessory(
                        "Toothbrush",
                        "Super soft cat toothbrush!",
                        "https://i2.wp.com/best1x.com/wp-content/uploads/2017/05/Best-Cat-Toothbrush-Toothpaste.jpg?resize=539%2C359&ssl=1"),
                new Accessory(
                        "Shampoo",
                        "Best feather-fluffing shampoo for penguines",
                        "https://78.media.tumblr.com/61a73343131b873f1e26734e3dafd2c6/tumblr_mo5jyk66ZW1qzya49o1_540.jpg")
        );
    }
}
