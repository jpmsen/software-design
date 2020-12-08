package com.company;

import products.BlenderWithIntegratedRadio;
import products.CuteTeddyBear;
import products.TVScreen;

public class Main {

    // Main scenario
    public static void main(String[] args) {

        // There is a shop with a checkout
        Checkout kassa5 = new Checkout(SalesAction.BlackFriday);

        // Two customers enter the shop
        Customer piet = new Customer(CustomerType.Regular, "Piet");
        Customer anne = new Customer(CustomerType.New, "Anne");

        // Piet buying stuff: (6.97 + 6.97) * 0.98 = 13.6612
        piet.buys(new CuteTeddyBear());
        piet.buys(new CuteTeddyBear());

        anne.buys(new CuteTeddyBear());

        // and proceed to checkout
        kassa5.nextInLine(piet);
        kassa5.nextInLine(anne);
    }
}
