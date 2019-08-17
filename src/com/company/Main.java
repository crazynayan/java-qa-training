package com.company;

public class Main {

    public static void main(String[] args) {
        Calculator calc;
        calc = new Calculator();
        System.out.println(calc.getNumber());
        calc.setNumber(123);
        System.out.println(calc.getNumber());
        calc.setNumber(-45);
        System.out.println(calc.getNumber());
    }
}
