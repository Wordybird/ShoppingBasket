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

    @Test
    public void priceIsZero () {
        assertEquals(0.00, basket.getPrice(), 0.001);
    }

    @Test
    public void totalIsZero () {
        assertEquals(0.00, basket.getTotalCost(), 0.001);
    }



}
