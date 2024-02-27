package com.iesam.carnejoven.features.buy.domain;

import com.iesam.carnejoven.features.buy.data.BuyDataRepository;

public class GetBuyUseCase {
    private final BuyDataRepository buyDataRepository;

    public GetBuyUseCase(BuyDataRepository buyDataRepository) {
        this.buyDataRepository = buyDataRepository;
    }

    public Buy execute(String id){
        return buyDataRepository.obtainBuy(id);
    }
}
