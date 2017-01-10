package com.PodstawyProgramowania.Lista1;
/**
 * Class with methods dealing with tasks from List 2
 * 
 * @author Marcin Kokoszka
 * @version 12/10/2016
 */
import java.lang.Math;

class MyMath
{
    private double x;
    private double p;

public MyMath(double x, double p){
       this.x = x;
       this.p = p;
}
     /**
     * Zad. 1
     * Finds the greatest common divisor of two positive integers
     * uses Euclidean algorithm en.wikipedia.org/wiki/Euclidean_algorithm
      * @return 0 if either of parameters is not a positive integer
     */
     static int greatestCommonDivisor(int a, int b)
{
    if (a <= 0 || b <=0) return 0;
    int c;                   
    while(b != 0)             
    {
        c = a % b;            
        a = b;                
        b = c;     
    }
    return a;
}
     /**
     * Zad. 2
     * Raise base to the power of exponent
     * @param base      number to exponentiate
     * @param exponent  positive integer
     * @return          number^exponent
     */
     static double exponentiate(double base, int exponent) {
    double result = 1;
    while (exponent > 0){
        result *= base;
        exponent--;
    }
    return result;
}
     /**
     * Zad. 2
     * Raise base to the power of exponent using recursion
     * @param base      number to exponentiate
     * @param exponent  positive integer
     * @return          number^exponent
     */
     static double exponentiateRecursively(double base, int exponent) {
    if (exponent == 0) {
        return 1;
    } else {
        return base * exponentiateRecursively(base, exponent -1);
    }
}

     /**
     * Zad. 3
      * Calculates factorial of n
      * @param n   number to get factorial of
      * @return n!
      */
     static double factorial(double n) {
         double nFactorial = 1;
         for (double i = 1; i <= n; i++) {
             nFactorial *= i;
         }
         return nFactorial;
     }

    /**
     * Zad. 3
     * Calculates factorial of n using recursion
     *
     * @param n number to get factorial of
     * @return n!
     */
    static double factorialRecursively(double n) {
        if (n == 0 || n == 1) {
            return 1;
        } else {
            return n * factorialRecursively(n - 1);
        }
    }

    /**
     * Zad. 5
     * Checks if a number is a prime
     *
     * @param n number to be checked
     * @return true if the number is a prime, false otherwise
     */
    static boolean isPrime(int n) {
        //check if n is a multiple of 2
        if (n % 2 == 0 && n != 2 || n == 1) return false;
        //if not, then just check the odds
        for (int i = 3; i * i <= n; i += 2) {
            if (n % i == 0)
                return false;
        }
        return true;
    }

    /**
     * Zad. 3
     * Calculates e^x with precision p
     * @return    e^x
     */
    double seriesEX()
  {
    double ex = 1;
    double xk = 1;
    double kFactorial = 1;
    for (int k = 1; (xk / kFactorial) >= p; k++) {
      xk *= x;
      kFactorial *= k;
      ex += xk / kFactorial;
    }
    return ex;
}

     /**
     * Zad. 3
     * Calculates e^x with precision p using two other methods: exponentiate & factorial
     * @return    e^x
      */
     double seriesEXinf()
  {
    double ex = 1;
    for (int k = 1; exponentiate(x, k) / factorial(k) >= p; k++) {
      ex += exponentiate(x, k) / factorial(k);
    }
    return ex;
  }

     /**
     * Zad. 3
      * Calculates sin(x) with precision p
     * @return    sin(x)
      */
     double sinXinf()
  {
   double sinx = 0;
   x = x % (2 * Math.PI);
    for (int k = 0; (exponentiate(x, (2 * k + 1)) / factorial(2 * k + 1)) >= p; k++) {
      sinx += exponentiate(-1, k) * (exponentiate(x, 2 * k + 1) / factorial(2 * k + 1));
    }
    return sinx;
  }

  /**
     * Zad. 3
   * Calculates sin(x) with precision p
     * @return    sin(x)
   */
  double sinX()
  {
   x = x % (2 * Math.PI);
   double sinx = x;
   double sinxTemp = x;
   int sign;

   for (int k = 1; sinxTemp >= p; k++) {
      sinxTemp *= x * x / ((2 * k) * (2 * k + 1));
      if (k % 2 == 0) {
          sign = 1;
      } else {
          sign = -1;
      }
      sinx += sign * sinxTemp;
      }
      return sinx;
}

 /**
  * Zad. 3
  * Calculates sin(x) with precision p
     * @return sin(x)
  */
 double cosX()
  {
   x = x % (2 * Math.PI);
   double cosx = 1;
   double cosxTemp = 1;
   int sign;

   for (int k = 1; cosxTemp >= p; k++) {
      cosxTemp *= x * x / ((2 * k - 1) * (2 * k));
      if (k % 2 == 0) {
          sign = 1;
      } else {
          sign = -1;
      }
      cosx += sign * cosxTemp;
      }
      return cosx;
}

     /**
      * Zad. 3
      * Calculates cos(x) with precision p
     * @return cos(x)
      */
     double cosXinf()
  {
   double cosx = 0;
   x = x % (2 * Math.PI);
    for (int k = 0; (exponentiate(x, (2 * k)) / factorial(2 * k)) >= p; k++) {
      cosx += exponentiate(-1, k) * (exponentiate(x, 2 * k) / factorial(2 * k));
    }
    return cosx;
  }
}