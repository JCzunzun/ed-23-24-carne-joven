package com.iesam.carnejoven.features.promotions.domain;

import com.iesam.carnejoven.features.promotions.data.PromotionDataRepository;

public class SavePromotionUseCase {
    private final PromotionDataRepository promotionDataRepository;

    public SavePromotionUseCase(PromotionDataRepository promotionDataRepository) {
        this.promotionDataRepository = promotionDataRepository;
    }

    public void execute(Promotions promotions) {
        promotionDataRepository.savePromotion(promotions);
    }
}
