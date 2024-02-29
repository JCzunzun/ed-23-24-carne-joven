package com.iesam.carnejoven.features.promotions.data;

import com.iesam.carnejoven.features.promotions.domain.PromotionRepository;
import com.iesam.carnejoven.features.promotions.domain.Promotions;

import java.util.ArrayList;

public class PromotionDataRepository implements PromotionRepository {
    private static PromotionDataRepository instancePromotion = null;

    public static PromotionDataRepository newPromotionInstance() {
        if (instancePromotion == null) {
            instancePromotion = new PromotionDataRepository();
        }
        return instancePromotion;
    }

    @Override
    public void savePromotion(Promotions promotions) {

    }

    @Override
    public Promotions obtainPromotion(String id) {
        return null;
    }

    @Override
    public ArrayList<Promotions> obtainPromotions() {
        return null;
    }

    @Override
    public void deletePromotion(String id) {

    }
}
