package com.iesam.carnejoven.features.promotions.domain;

public class Promotions {
    private final String id;
    private final String title;
    private final String description;
    private final String discount;

    public Promotions(String id, String title, String description, String discount) {
        this.id = id;
        this.title = title;
        this.description = description;
        this.discount = discount;
    }

    public String getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public String getDescription() {
        return description;
    }

    public String getDiscount() {
        return discount;
    }
}
