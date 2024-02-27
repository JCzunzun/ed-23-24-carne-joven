package com.iesam.carnejoven.features.buy.domain;

public interface BuyRepository {
    void saveBuy(Buy buy);
    Buy obtainBuy(String id);

}
