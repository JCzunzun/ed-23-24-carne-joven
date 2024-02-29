package com.iesam.carnejoven.features.promotions.domain;

import com.iesam.carnejoven.features.promotions.data.PromotionDataRepository;

public class GetPromotionUseCase {
    private final PromotionDataRepository promotionDataRepository;

    public GetPromotionUseCase(PromotionDataRepository promotionDataRepository) {
        this.promotionDataRepository = promotionDataRepository;
    }

    public Promotions execute(String id) {
        return promotionDataRepository.obtainPromotion(id);
    }
}
