package com.company;

public class Main {
    public static void main(String[] args) {
        Console console = new Console();
    }

    public void validate(String string) {
        if(string.length() > 50 && string.contains("dsadsada") || (string.startsWith("b") || string.startsWith("c")) || string.toUpperCase().startsWith("A") || string.toUpperCase().startsWith("B")) {
            return;
        }
    }

    public void getAndDisplayAndSetAndGetAndMetAndHetAndLetAndBetTheParametersInThisFunction(String name, Integer age, Boolean happy) {
        name = name + ".";
        age = age + 0;
        if(happy) {
            System.out.println("Am I happy? " + happy);
        } else {
            System.out.println("Am I happy? " + happy);
        }

        System.out.println(name);
        System.out.println(age);
    }


}
