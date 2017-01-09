package com.example.user.shoppingbasket;

import java.util.ArrayList;
import java.util.List;

public class Basket {

    private List<Itemable> itemList = new ArrayList<>();

    private double price;
    private double totalCost;

    public Basket(double price, double totalCost) {
        this.price = price;
        this.totalCost = totalCost;
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

//    public double getPrice() {
//        int i;
//        double sum = 0;
//        for (i = 0; i < itemList.size(); i++) {
//            sum += itemList.get(i);
//        }
//        price = sum;
//        return price;
//    }

    public double getTotalCost() {
        totalCost = price;
        return this.totalCost;
    }

}
