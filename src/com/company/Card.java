package com.company;

public abstract class Card {
    public Printer printer;

    public void print() {
        this.printHeader();
        this.printMessage();
        this.printImage();
        this.printFooter();
    }

    abstract void printHeader();
    abstract void printMessage();
    abstract void printImage();
    abstract void printFooter();


}
