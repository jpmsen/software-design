package com.company;

import products.Product;

public class DiscountCalculator {

    private final Customer customer;

    private DiscountStrategy discountStrategy;

    public DiscountCalculator(Customer customer) {
        this.customer = customer;
    }

    public double getDiscount(Product product, int index) {
        return discountStrategy.getDiscount(product, index, this.customer);
    }

    public void setDiscountStrategy(DiscountStrategy strategy) {
        this.discountStrategy = strategy;
    }
}
