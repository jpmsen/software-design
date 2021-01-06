package com.company;

public class GumballMachine {

    final static int SOLD_OUT = 0;
    final static int NO_QUARTER = 1;
    final static int HAS_QUARTER = 2;
    final static int SOLD = 3;

    GumballState state;
    int count = 0;

    public GumballMachine(int count) {
        this.count = count;
        if (count > 0) {
            changeState(new NoQuarterState(this));
        }
    }

    public void changeState(GumballState state) {
        this.state = state;
    }

    public void insertQuarter() {
        this.state.insertQuarter();
    }

    public void ejectQuarter() {
        this.state.ejectQuarter();
    }

    public void turnCrank() {
        this.state.turnCrank();
        dispense();
    }

    private void dispense() {
        this.state.dispense();
    }

    public void refill(int numGumBalls) {
        this.count = numGumBalls;
        changeState(new NoQuarterState(this));
    }

    public String toString() {
        StringBuffer result = new StringBuffer();
        result.append("\nMighty Gumball, Inc.");
        result.append("\nJava-enabled Standing Gumball Model #2004\n");
        result.append("Inventory: " + count + " gumball");
        if (count != 1) {
            result.append("s");
        }
        result.append("\nMachine is ");

        result.append(state.status());

        result.append("\n");
        return result.toString();
    }
}
