package com.PodstawyProgramowania.Lista1;
/**
 * Presentation of MyMath methods
 *
 * @author Marcin Kokoszka
 * @version 31-10-2016
 */
public class List1
{
    public static void main(String[] args) {
        //Zad. 1
        int zad1a = 85;
        int zad1b = 1173;
        System.out.println("Zad. 1\n" + "Największy wspólny dzielnik " 
        + zad1a + " i " + zad1b + " wynosi " + MyMath.greatestCommonDivisor(zad1a, zad1b));
        System.out.println("");
        
        //Zad. 2
        double zad2a = 7.13;
        int zad2b = 5;
        System.out.println("Zad. 2\n" + zad2a + " do potęgi " 
        + zad2b + " wynosi " + MyMath.exponentiate(zad2a, zad2b));
        System.out.println(zad2a + " do potęgi " 
        + zad2b + "(używając rekurencji) wynosi " + MyMath.exponentiateRecursively(zad2a, zad2b));
        System.out.println("");
        
        //Zad. 4
        System.out.println("Zad. 4");
        //Approach 1
        int zad4a = 3;
        int zad4b = 5;
        Calculator calculator = new Calculator(zad4a, zad4b);
        System.out.println(zad4a + " + " + zad4b + " = " + calculator.add());
        System.out.println(zad4a + " - " + zad4b + " = " + calculator.subtract());
        System.out.println(zad4a + " * " + zad4b + " = " + calculator.multiply());
        System.out.println(zad4a + " / " + zad4b + " = " + calculator.divide());
        System.out.println("");
        
        /*
        //Approach 2
        MyInteger x = new MyInteger(3);
        MyInteger y = new MyInteger(5);
        System.out.println(x.getValue() + " + " + y. getValue() + " = " + MyInteger.add(x, y));
        System.out.println(x.getValue() + " - " + y. getValue() + " = " + MyInteger.subtract(x, y));
        System.out.println(x.getValue() + " * " + y. getValue() + " = " + MyInteger.multiply(x, y));
        System.out.println(x.getValue() + " / " + y. getValue() + " = " + MyInteger.divide(x, y));
        
        //Approach 3
        Calculator calculator3 = new Calculator();
        System.out.println(zad4a + " + " + zad4b + " = " + calculator3.add(zad4a, zad4b));
        System.out.println(zad4a + " - " + zad4b + " = " + calculator3.subtract(zad4a, zad4b));
        System.out.println(zad4a + " * " + zad4b + " = " + calculator3.multiply(zad4a, zad4b));
        System.out.println(zad4a + " / " + zad4b + " = " + calculator3.divide(zad4a, zad4b));
        System.out.println("");
        */
       
        //Zad. 5
        System.out.println("Zad. 5");
        int zad5a = 3;
        if (MyMath.isPrime(zad5a)) System.out.println(zad5a + " jest liczbą pierwszą");
        else if (!(MyMath.isPrime(zad5a))) System.out.println(zad5a + " nie jest liczbą pierwszą");
    }
}
