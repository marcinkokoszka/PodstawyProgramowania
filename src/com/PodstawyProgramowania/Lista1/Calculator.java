package com.PodstawyProgramowania.Lista1;
/**
 * Calculator does algebraic operations on integers
 * 
 * @author Marcin Kokoszka 
 */
class Calculator
{
    private int a;
    private int b;

    Calculator(int a, int b) {
        this.a = a;
        this.b = b;
    }

    int add() {
        return this.a + this.b;
    }

    int subtract() {
        return this.a - this.b;
    }

    int multiply() {
        return this.a * this.b;
    }

    int divide() {
        return this.a / this.b;
    }
/**
     * Zad. 4
     * Adds two integers
     */
    public int add(int a, int b) {
    return a + b;
}
 /**
     * Zad. 4
     * Subtracts an integer from an integer
     */
    public int subtract(int a, int b) {
    return a - b;
}
 /**
     * Zad. 4
     * Multiplies two integers
     */
    public int multiply(int a, int b) {
    return a * b;
}
 /**
     * Zad. 4
     * Divides an integer by an integer
     */
    public int divide(int a, int b) {
    return a / b;
}
}
