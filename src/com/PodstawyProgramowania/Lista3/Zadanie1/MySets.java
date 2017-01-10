package com.PodstawyProgramowania.Lista3.Zadanie1;

/**
 * Created by kokoseq on 10.12.2016.
 */

import java.util.Arrays;

public class MySets {
    private int[] set1;
    private int[] set2;
    private int[] union;
    private int[] complement;
    private int[] intersection;

    public MySets(int[] s1, int[] s2) {
        set1 = s1.clone();
        set2 = s2.clone();
        union = union();
        complement = complement();
        intersection = intersection();
    }

    public int[] getSet1() {
        return set1;
    }

    public void setSet1(int[] set1) {
        this.set1 = set1;
        union = union();
        complement = complement();
        intersection = intersection();
    }

    public int[] getSet2() {
        return set2;
    }

    public void setSet2(int[] set2) {
        this.set2 = set2;
        union = union();
        complement = complement();
        intersection = intersection();
    }

    public int[] getUnion() {
        return union;
    }

    public int[] getComplement() {
        return complement;
    }

    public int[] getIntersection() {
        return intersection;
    }

    private int[] union() {

        int[] union = new int[set1.length + set2.length];
        int j = 0;
        for (int i = 0; i < set1.length; i++)
            if (!contains(union, set1[i]))
                union[j++] = set1[i];
        for (int i = 0; i < set2.length; i++)
            if (!contains(union, set2[i]))
                union[j++] = set2[i];
        int[] temp = new int[j];
        for (int i = 0; i < temp.length; i++)
            temp[i] = union[i];
        union = temp;
        return union;
    }

    private int[] complement() {

        int[] complement = new int[set1.length];
        int j = 0;
        for (int i = 0; i < set1.length; i++)
            if (!contains(complement, set1[i]) && !contains(set2, set1[i]))
                complement[j++] = set1[i];
        int[] temp = new int[j];
        for (int i = 0; i < temp.length; i++)
            temp[i] = complement[i];
        complement = temp;
        return complement;
    }

    private int[] intersection() {
        int[] intersection = new int[set1.length];
        int j = 0;
        for (int i = 0; i < set1.length; i++)
            if (!contains(intersection, set1[i]) && contains(set2, set1[i]))
                intersection[j++] = set1[i];
        int[] temp = new int[j];
        for (int i = 0; i < temp.length; i++)
            temp[i] = intersection[i];
        intersection = temp;
        return intersection;
    }

    private int[] combineArrays() {

        int[] combinedArray = new int[set1.length + set2.length];

        for (int i = 0; i < set1.length; i++) {
            combinedArray[i] = set1[i];
        }

        for (int j = 0; j < set2.length; j++) {
            combinedArray[j + set1.length] = set2[j];
        }

        return combinedArray;
    }

    private boolean contains(final int[] array, final int key) {
        for (int i : array)
            if (i == key) return true;
        return false;
    }

    public String toString() {
        return "Set 1: " + Arrays.toString(set1) + "\nSet 2: " + Arrays.toString(set2) + "\nUnion: " + Arrays.toString(union) + "\nIntersection: " + Arrays.toString(intersection) + "\nComplement: " + Arrays.toString(complement);
    }
}