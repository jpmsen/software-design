package com.company;

public abstract class GumballState {
    GumballMachine gumballMachine;

    GumballState(GumballMachine gumballMachine) {
        this.gumballMachine = gumballMachine;
    }

    public abstract void insertQuarter();
    public abstract void ejectQuarter();
    public abstract void turnCrank();
    public abstract void dispense();

    public abstract String status();
}
