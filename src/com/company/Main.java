package com.company;

public class Main {

    public static void main(String[] args) {
        System.out.println("Hello World!");
        Calculator calc;
        calc = new Calculator();
        calc.setNumber(1);
        System.out.println(calc.getNumber());
        calc.setNumber(2);
        System.out.println(calc.getNumber());
    }
}
