package com.company;

import java.util.ArrayList;

public class Product {
    private String productname;
    private int price;
    private String description;

    public int getPrice() {
        return price;
    }

    public String getDescription() {
        return description;
    }

    public String getProductname() {
        return productname;
    }

    public Product(String productname, String description, int price) {
        this.productname = productname;
        this.description = description;
        this.price = price;
    }
}
