package com.iesam.carnejoven.features.buy.data;

import com.iesam.carnejoven.features.buy.data.local.FileLocalDataSourceBuy;
import com.iesam.carnejoven.features.buy.domain.Buy;
import com.iesam.carnejoven.features.buy.domain.BuyRepository;

public class BuyDataRepository implements BuyRepository {
    private FileLocalDataSourceBuy fileLocalDataSourceBuy;
    private static BuyDataRepository instanceBuy=null;
    public static BuyDataRepository newBuyInstance(){
        if(instanceBuy==null){
            instanceBuy = new BuyDataRepository();
        }
        return instanceBuy;
    }
    @Override
    public void saveBuy(Buy buy) {
        fileLocalDataSourceBuy.saveBuy(buy);
    }

    @Override
    public Buy obtainBuy(String id) {
        return fileLocalDataSourceBuy.obtainBuy(id);
    }
}
