package com.iesam.carnejoven.features.buy.domain;

import com.iesam.carnejoven.features.buy.data.BuyDataRepository;

public class GetBuyUseCase {
    private final BuyRepository buyDataRepository;

    public GetBuyUseCase(BuyRepository buyDataRepository) {
        this.buyDataRepository = buyDataRepository;
    }

    public Buy execute(String id){
        return buyDataRepository.obtainBuy(id);
    }
}
