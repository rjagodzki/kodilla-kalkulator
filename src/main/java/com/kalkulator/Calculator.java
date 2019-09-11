package com.kalkulator;

public class Calculator {

    public static void main (String args[]){
        class Robie{
            public void someMethod() {
                System.out.println("Dziala");
            }
        }
        Robie calculator = new Robie();
        calculator.someMethod();
    }
}
