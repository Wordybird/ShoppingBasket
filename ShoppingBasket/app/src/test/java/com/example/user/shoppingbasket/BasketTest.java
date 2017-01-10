package com.example.user.shoppingbasket;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class BasketTest {

    Basket basket;
    Item item;
    Itemable itemable;

    @Before
    public void before() {
        basket = new Basket(0.00);
        item = new Item();;
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

    @Test
    public void totalIsZeroAtStart () {
        assertEquals(0.00, basket.getTotalCost(), 0.01);
    }

    @Test
    public void totalCostCalculatesCorrectly () {
        basket.addItem(item);
        assertEquals(2.75, basket.getTotalCost(), 0.01);
    }

    @Test
    public void costCalculatesBOGOF () {
        basket.addItem(item);
        basket.addItem(item);
        assertEquals(2.75, basket.getTotalCost(), 0.01);
    }

    @Test
    public void costCalculatesDiscount () {
        basket.addItem(item);
        basket.addItem(item);
        basket.addItem(item);
        basket.addItem(item);
        basket.addItem(item);
        basket.addItem(item);
        basket.addItem(item);
        basket.addItem(item);
        basket.addItem(item);
        basket.addItem(item);
        basket.addItem(item);
        basket.addItem(item);
        basket.getTotalCost();
        assertEquals(27.23, basket.getDiscount(), 0.1);
    }

}
