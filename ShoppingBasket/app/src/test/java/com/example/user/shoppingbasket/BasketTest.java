package com.example.user.shoppingbasket;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class BasketTest {

    Basket basket;

    @Before
    public void before() {
        basket = new Basket(0, 0, 0);
    }

    @Test
    public void basketIsEmpty () {
        assertEquals(0, basket.getItems());
    }

}
