package com.company;

import products.Product;

public interface DiscountStrategy {
    public double getDiscount(Product product, int index, Customer customer);
}
