package com.iesam.carnejoven.features.buy.domain;

import com.iesam.carnejoven.features.buy.data.Stub1BuyDataRepository;
import com.iesam.carnejoven.features.buy.data.Stub2BuyDataRepository;
import com.iesam.carnejoven.features.promotions.domain.Promotions;
import com.iesam.carnejoven.features.user.domain.User;
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
        String id = "1";
        //When
        Buy buy = getBuyUseCase.execute(id);

        //Then
        Assertions.assertNull(buy);
    }

    @Test
    public void CuandoBuyNoSeaNuloMuestreElObjeto() {
        //Given
        getBuyUseCase = new GetBuyUseCase(
                new Stub2BuyDataRepository()
        );
        String id = "1";
        //When
        Buy buyNotNull = getBuyUseCase.execute(id);

        //Then
        Assertions.assertNotNull(buyNotNull);
    }

    @Test
    public void CuandoBuyNoSeaNuloVerifiqueSiElObjetoEstaBien() {
        //Given
        getBuyUseCase = new GetBuyUseCase(
                new Stub2BuyDataRepository()
        );
        String id = "1";
        Buy buyExpected = new Buy("1", "a", new Promotions("1", "a", "a", "15"), new User("1", "a", "a", "a"));

        //When
        Buy result = getBuyUseCase.execute(id);

        //then
        Assertions.assertEquals(buyExpected.getId(), result.getId());
        Assertions.assertEquals(buyExpected.getDateBuy(), result.getDateBuy());
        Assertions.assertEquals(buyExpected.getPromotions(), result.getPromotions());
        Assertions.assertEquals(buyExpected.getUser(),result.getUser());


    }

}