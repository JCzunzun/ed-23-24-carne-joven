package com.iesam.carnejoven.features.buy.domain;

import com.iesam.carnejoven.features.buy.data.BuyDataRepository;

public class SaveBuyUseCase {
    private final BuyDataRepository buyDataRepository;

    public SaveBuyUseCase(BuyDataRepository buyDataRepository) {
        this.buyDataRepository = buyDataRepository;
    }

    public void execute(Buy buy){
        buyDataRepository.saveBuy(buy);
    }
}
