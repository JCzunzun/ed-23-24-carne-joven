package com.iesam.carnejoven.features.promotions.presentation;

import com.iesam.carnejoven.features.promotions.data.PromotionDataRepository;
import com.iesam.carnejoven.features.promotions.domain.*;

import java.util.ArrayList;

public class PromotionPresentation {
    public static void deletePromotion(String id){
        DeletePromotionUseCase deletePromotionUseCase=new DeletePromotionUseCase(PromotionDataRepository.newPromotionInstance());
        deletePromotionUseCase.execute(id);
    }
    public static void savePromotion(Promotions promotions){
        SavePromotionUseCase savePromotionUseCase= new SavePromotionUseCase(PromotionDataRepository.newPromotionInstance());
        savePromotionUseCase.execute(promotions);
    }
    public static void getPromotion(String id){
        GetPromotionUseCase getPromotionUseCase = new GetPromotionUseCase(PromotionDataRepository.newPromotionInstance());
        Promotions promotions= getPromotionUseCase.execute(id);
        System.out.println(promotions.toString());
    }
    public static void getPromotions(){
        GetPromotionsUseCase getPromotionsUseCase=new GetPromotionsUseCase(PromotionDataRepository.newPromotionInstance());
        ArrayList<Promotions> promotions= getPromotionsUseCase.execute();
        System.out.println(promotions.toString());
    }

}
