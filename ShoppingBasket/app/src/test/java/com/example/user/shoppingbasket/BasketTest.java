package com.example.user.shoppingbasket;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class BasketTest {

    Basket basket;

    @Before
    public void before() {
        basket = new Basket(0.00, 2.75);
    }

    @Test
    public void basketIsEmpty () {
        assertEquals(0, basket.getItemCount());
    }

    @Test
    public void priceIsZero () {
        assertEquals(0.00, basket.getPrice(), 0.01);
    }

    @Test
    public void totalPriceMatchesItemPrice () {
        assertEquals(0.00, basket.getTotalCost(), 0.01);
    }

}
