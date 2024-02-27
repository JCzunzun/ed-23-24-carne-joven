package com.iesam.carnejoven.features.promotions.domain;

import java.util.ArrayList;

public interface PromotionRepository {
    void savePromotion(Promotions promotions);
    Promotions obtainPromotion(String id);
    ArrayList<Promotions> obtainPromotions();
    void deletePromotion(String id);
}
