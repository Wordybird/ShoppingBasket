package com.example.user.shoppingbasket;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class BasketTest {

    Basket basket;
    Item item;

    @Before
    public void before() {
        basket = new Basket(0.00, 0.00);
    }

    @Test
    public void basketIsEmpty () {
        assertEquals(0, basket.getItemCount());
    }

    @Test
    public void canAddToBasket () {
        basket.addItem(item);
        assertEquals(1, basket.getItemCount());
    }

    @Test
    public void canTakeFromBasket () {
        basket.addItem(item);
        basket.takeItem(item);
        assertEquals(0, basket.getItemCount());
    }

    @Test
    public void canEmptyBasket() {
        basket.addItem(item);
        basket.emptyBasket();
        assertEquals(0, basket.getItemCount());
    }

//    @Test
//    public void priceIsZeroAtStart () {
//        assertEquals(0.00, basket.getPrice(), 0.01);
//    }

    @Test
    public void totalPriceMatchesItemPrice () {
        assertEquals(0.00, basket.getTotalCost(), 0.01);
    }

}
