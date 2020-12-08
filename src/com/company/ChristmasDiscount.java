package com.company;

import products.Product;

public class ChristmasDiscount implements DiscountStrategy {

    @Override
    public double getDiscount(Product product, int index, Customer customer) {
        double discount = 0.0;

        boolean isFirstProduct = index == 0;

        if(isFirstProduct) {
            discount = .20;
        } else {
            discount = .125;
        }

        return 1 - discount;
    }
}
