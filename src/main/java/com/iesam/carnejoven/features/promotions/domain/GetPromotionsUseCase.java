package com.iesam.carnejoven.features.promotions.domain;

import com.iesam.carnejoven.features.promotions.data.PromotionDataRepository;

import java.util.ArrayList;

public class GetPromotionsUseCase {
    private final PromotionDataRepository promotionDataRepository;

    public GetPromotionsUseCase(PromotionDataRepository promotionDataRepository) {
        this.promotionDataRepository = promotionDataRepository;
    }

    public ArrayList<Promotions> execute() {
        return promotionDataRepository.obtainPromotions();
    }
}
