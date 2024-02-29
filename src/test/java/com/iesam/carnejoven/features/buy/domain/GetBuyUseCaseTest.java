package com.iesam.carnejoven.features.buy.domain;

import com.iesam.carnejoven.features.buy.data.Stub1BuyDataRepository;
import com.iesam.carnejoven.features.buy.data.Stub2BuyDataRepository;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class GetBuyUseCaseTest {
    private GetBuyUseCase getBuyUseCase;
    @BeforeEach
    void setUp() {

    }

    @AfterEach
    void tearDown() {
        getBuyUseCase = null;
    }

    @Test
    void execute() {
    }
    @Test
    public void CuandoBuySeaNuloMostrarNull() {
        //Given
        getBuyUseCase = new GetBuyUseCase(
                new Stub1BuyDataRepository()
        );
        String id="1";
        //When
        Buy buy=getBuyUseCase.execute(id);

        //Then
        Assertions.assertNull(buy);
    }

    public void CuandoBuyNoSeaNuloMuestreElObjeto(){
        //Given
        getBuyUseCase = new GetBuyUseCase(
                new Stub2BuyDataRepository()
        );
        String id="1";
        //When
        Buy buyNotNull=getBuyUseCase.execute(id);

        //Then
        Assertions.assertNotNull(buyNotNull);
    }

}