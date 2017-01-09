package com.example.user.shoppingbasket;

import java.util.ArrayList;
import java.util.List;

public class Basket {

    private List<Double> itemList = new ArrayList<>();

    private double price;
    private double totalCost;

    public Basket(double price, double totalCost) {
        this.price = price;
        this.totalCost = totalCost;
    }

    public int getItemCount() {
        return this.itemList.size();
    }

    public double getPrice() {
        int i;
        double sum = 0;
        for (i = 0; i < itemList.size(); i++) {
            sum += itemList.get(i);
        }
        price = sum;
        return price;
    }

    public double getTotalCost() {
        totalCost = price;
        return this.totalCost;
    }

}
