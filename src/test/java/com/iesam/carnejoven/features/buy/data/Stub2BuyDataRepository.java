package com.iesam.carnejoven.features.buy.data;

import com.iesam.carnejoven.features.buy.domain.Buy;
import com.iesam.carnejoven.features.buy.domain.BuyRepository;
import com.iesam.carnejoven.features.promotions.domain.Promotions;
import com.iesam.carnejoven.features.user.domain.User;

public class Stub2BuyDataRepository implements BuyRepository {

    @Override
    public void saveBuy(Buy buy) {

    }

    @Override
    public Buy obtainBuy(String id) {
        return new Buy("1","a",new Promotions("1","a","a","15"),new User("1","a","a","a"));
    }
}
