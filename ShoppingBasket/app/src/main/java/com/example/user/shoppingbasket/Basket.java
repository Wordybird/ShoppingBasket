package com.example.user.shoppingbasket;

import java.util.ArrayList;
import java.util.List;

public class Basket {

    private int items;
    private double price;
    private double totalCost;

    public Basket(int items, double price, double totalCost) {
        this.items = items;
        this.price = price;
        this.totalCost = totalCost;
    }

    private List<Itemable> itemList = new ArrayList<>();

    public double getTotalCost() {
        return this.totalCost;
    }

    public double getPrice() {
        return this.price;
    }

    public int getItems() {
        return this.items;
    }

    public double calculateTotal() {
        totalCost = price;
        return totalCost;
    }

}
