package com.example.user.shoppingbasket;

import java.util.ArrayList;
import java.util.List;

public class Basket {

    private List<Itemable> itemList = new ArrayList<>();
    private double totalCost;
    public boolean loyaltyCard;

    public Basket(double totalCost) {
        this.totalCost = totalCost;
        this.itemList = new ArrayList<>();
        this.loyaltyCard = false;
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
            if (i > 1)
                continue;
            else if (sum == itemList.get(i).price() * 2) {
                sum = sum / 2;
            }
        }
        totalCost = sum;
        return totalCost;
    }

    public double getDiscount() {
        if (totalCost >=20) {
            totalCost = totalCost - (totalCost/10);
        }
        return totalCost;
    }

    public double loyaltyDiscount() {
        if (loyaltyCard) {
            totalCost = totalCost - (totalCost * 0.02);
        }
        return totalCost;
    }

}
