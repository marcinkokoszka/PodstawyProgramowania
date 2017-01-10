package com.PodstawyProgramowania.Lista1;

/**
 * Write a description of class MyInteger here.
 * 
 * @author Marcin Kokoszka
 * @version (a version number or a date)
 */
class MyInteger
{
    private int value;

    /**
     * Constructor for objects of class MyInteger
     */
    public MyInteger(int value)
    {
        this.value = value;
    }    

    /**
     * An example of a method - replace this comment with your own
     *
     * @param  y   a sample parameter for a method
     * @return the sum of x and y
     */
    public static int add(MyInteger x, MyInteger y)
    {
        return x.value + y.value;
    }

    /**
     * An example of a method - replace this comment with your own
     *
     * @param  y   a sample parameter for a method
     * @return the sum of x and y
     */
    public static int subtract(MyInteger x, MyInteger y)
    {
        return x.value - y.value;
    }

    /**
     * An example of a method - replace this comment with your own
     *
     * @param  y   a sample parameter for a method
     * @return the sum of x and y
     */
    public static int multiply(MyInteger x, MyInteger y)
    {
        return x.value * y.value;
    }

    /**
     * An example of a method - replace this comment with your own
     *
     * @param  y   a sample parameter for a method
     * @return the sum of x and y
     */
    public static int divide(MyInteger x, MyInteger y)
    {
        return x.value / y.value;
    }

    public int getValue() {
        return this.value;
    }

    public void setValue(int value) {
        this.value = value;
    }
}
