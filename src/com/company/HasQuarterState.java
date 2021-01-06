package com.company;

public class HasQuarterState extends GumballState {

    HasQuarterState(GumballMachine gumballMachine) {
        super(gumballMachine);
    }

    @Override
    public void insertQuarter() {
        System.out.println("You can't insert another quarter");
    }

    @Override
    public void ejectQuarter() {
        System.out.println("Quarter returned");
        gumballMachine.changeState(new NoQuarterState(gumballMachine));
    }

    @Override
    public void turnCrank() {
        System.out.println("You turned...");
        gumballMachine.changeState(new SoldState(gumballMachine));
    }

    @Override
    public void dispense() {
        System.out.println("No gumball dispensed");
    }

    @Override
    public String status() {
        return "waiting for turn of crank";
    }
}
