package com.iesam.carnejoven.features.promotions.domain;

import com.iesam.carnejoven.features.promotions.data.PromotionDataRepository;

public class DeletePromotionUseCase {
    private final PromotionDataRepository promotionDataRepository;

    public DeletePromotionUseCase(PromotionDataRepository promotionDataRepository) {
        this.promotionDataRepository = promotionDataRepository;
    }
    public void execute(String id){
        promotionDataRepository.deletePromotion(id);
    }
}
