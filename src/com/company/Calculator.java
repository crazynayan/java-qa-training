package com.company;

class Calculator {
    private int number;
    private boolean readyToAccept;

    Calculator() {
        number = 0;
        readyToAccept = true;
    }

    int getNumber() {
        return number;
    }

    boolean isReadyToAccept() {
        return readyToAccept;
    }

    void setNumber(int number) {
        if (readyToAccept) {
            this.number = number;
            readyToAccept = false;
        } else {
            throw new ArithmeticException();
        }
    }

    void clear() {
        number = 0;
        readyToAccept = true;
    }
}
