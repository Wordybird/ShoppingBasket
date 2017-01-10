package com.example.user.shoppingbasket;

import java.util.ArrayList;
import java.util.List;

public class Basket {

    private List<Itemable> itemList = new ArrayList<>();
    private double totalCost;

    public Basket(double totalCost) {
        this.totalCost = totalCost;
        this.itemList = new ArrayList<>();
    }

    public int getItemCount() {
        return this.itemList.size();
    }

    public void addItem(Itemable item) {
        itemList.add(item);
    }

    public void takeItem(Itemable item) {
        itemList.remove(item);
    }

    public Itemable emptyBasket() {
        if (getItemCount() > 0) {
            return itemList.remove(0);
        }
        return null;
    }

    public double getTotalCost() {
        int i;
        double sum = 0;
        for (i = 0; i < itemList.size(); i++) {
            sum += itemList.get(i).price();
            if (sum == itemList.get(i).price() * 2) {
                sum = sum / 2;
            }
        }
        totalCost = sum;
        return totalCost;
    }

}
