package com.company;

public class SoldState extends GumballState {


    SoldState(GumballMachine gumballMachine) {
        super(gumballMachine);
    }

    @Override
    public void insertQuarter() {
        System.out.println("Please wait, we're already giving you a gumball");
    }

    @Override
    public void ejectQuarter() {
        System.out.println("Sorry, you already turned the crank");
    }

    @Override
    public void turnCrank() {
        System.out.println("Turning twice doesn't get you another gumball!");
    }

    @Override
    public void dispense() {
        System.out.println("A gumball comes rolling out the slot");
        gumballMachine.count = gumballMachine.count - 1;
        if (gumballMachine.count == 0) {
            System.out.println("Oops, out of gumballs!");
            gumballMachine.changeState(new SoldOutState(gumballMachine));
        } else {
            gumballMachine.changeState(new NoQuarterState(gumballMachine));
        }
    }

    @Override
    public String status() {
        return "delivering a gumball";
    }
}
