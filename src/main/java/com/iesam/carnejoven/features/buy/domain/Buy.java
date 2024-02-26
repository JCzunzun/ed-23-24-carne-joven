package com.iesam.carnejoven.features.buy.domain;

import com.iesam.carnejoven.features.promotions.domain.Promotions;
import com.iesam.carnejoven.features.user.domain.User;

public class Buy {
    private final String id;
    private final String dateBuy;
    private final Promotions promotions;
    private final User user;

    public Buy(String id, String dateBuy, Promotions promotions, User user) {
        this.id = id;
        this.dateBuy = dateBuy;
        this.promotions = promotions;
        this.user = user;
    }

    public String getId() {
        return id;
    }

    public String getDateBuy() {
        return dateBuy;
    }

    public Promotions getPromotions() {
        return promotions;
    }

    public User getUser() {
        return user;
    }
}
