package com.iesam.carnejoven.features.buy.presentation;

import com.iesam.carnejoven.features.buy.data.BuyDataRepository;
import com.iesam.carnejoven.features.buy.domain.Buy;
import com.iesam.carnejoven.features.buy.domain.GetBuyUseCase;
import com.iesam.carnejoven.features.buy.domain.SaveBuyUseCase;

public class BuyPresentation {
    public static void obtainBuy(String id){
        GetBuyUseCase getBuyUseCase= new GetBuyUseCase(BuyDataRepository.newBuyInstance());
        Buy buy= getBuyUseCase.execute(id);
        System.out.println(buy.toString());
    }
    public static void saveBuy(Buy buy){
        SaveBuyUseCase saveBuyUseCase= new SaveBuyUseCase(BuyDataRepository.newBuyInstance());
        saveBuyUseCase.execute(buy);
    }
}
