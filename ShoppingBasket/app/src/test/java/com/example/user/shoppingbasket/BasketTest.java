package com.example.user.shoppingbasket;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class BasketTest {

    Basket basket;

    @Before
    public void before() {
        basket = new Basket(0, 2.75, 0.00);
    }

    @Test
    public void basketIsEmpty () {
        assertEquals(0, basket.getItems());
    }

    @Test
    public void priceIsNotZero () {
        assertEquals(2.75, basket.getPrice(), 0.01);
    }

    @Test
    public void totalIsZero () {
        assertEquals(0.00, basket.getTotalCost(), 0.01);
    }

    @Test
    public void totalIsCalculated() {
        assertEquals(2.75, basket.calculateTotal(), 0.01);
    }

}
