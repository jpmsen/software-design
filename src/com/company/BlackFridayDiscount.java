package com.company;

import products.Product;

import java.util.ArrayList;

public class BlackFridayDiscount implements DiscountStrategy {
    @Override
    public double getDiscount(Product product, int index, Customer customer) {
        double discount = 0.0;

        double products = customer.getCart().size();

        discount = products / 100;

        return 1 - discount;
    }
}
