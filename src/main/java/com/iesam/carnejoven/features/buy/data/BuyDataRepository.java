package com.iesam.carnejoven.features.buy.data;

import com.iesam.carnejoven.features.buy.domain.Buy;
import com.iesam.carnejoven.features.buy.domain.BuyRepository;

public class BuyDataRepository implements BuyRepository {
    private static BuyDataRepository instanceBuy=null;
    public static BuyDataRepository newBuyInstance(){
        if(instanceBuy==null){
            instanceBuy = new BuyDataRepository();
        }
        return instanceBuy;
    }
    @Override
    public void saveBuy(Buy buy) {

    }

    @Override
    public Buy obtainBuy(String id) {
        return null;
    }
}
