package com.company;

import java.util.ArrayList;

public class Shop {
    public ArrayList<Product> arrlist = new ArrayList<>();
    private int sales;
    private String name;


    public Shop (String name) {
        this.name = name;
    }

    public void addProduct(Product iphone) {
        arrlist.add(iphone);
    }

    public void sellProduct(Product iphone) {
        sales += iphone.getPrice();
        arrlist.remove(iphone);
    }

    public int saleProduct(){

        int total = 0;
        for (int i = 0; i < arrlist.size(); i++) {
            total += arrlist.get(i).getPrice();
        }
        return total;
    }
}

