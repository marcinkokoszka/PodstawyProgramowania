package com.PodstawyProgramowania.Lista3.Zadanie1;

/**
 * Created by kokoseq on 10.12.2016.
 */
public class Zadanie1 {
    public static void main(String[] args) {
        int[] a = {1, -2, 3, 4, 5, 6, 7, 8, 9};
        int[] b = {-2, 4, 6, 8, 10};
        MySets s = new MySets(a, b);

        System.out.println(s.toString());

        s.setSet1(new int[]{1, -3, 4, 4, 6, 7, 8, 9});

        System.out.println("\nAfter change:\n" + s.toString());

    }
}


