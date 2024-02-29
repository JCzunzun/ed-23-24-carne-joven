package com.iesam.carnejoven.features.buy.data;

import com.iesam.carnejoven.features.buy.domain.Buy;
import com.iesam.carnejoven.features.buy.domain.BuyRepository;

public class Stub1BuyDataRepository implements BuyRepository {
    @Override
    public void saveBuy(Buy buy) {

    }

    @Override
    public Buy obtainBuy(String id) {
        return null;
    }
}
