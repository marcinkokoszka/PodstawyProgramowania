package com.PodstawyProgramowania.Cwiczenia;

public class Test {

    public static void main(String[] args) {
        Punkt a = new Punkt(1, 2);
        Punkt b = new Punkt(3, 4);
        Punkt c = new Punkt(5, 6);
        Punkt d = new Punkt(7, 8);
        Punkt e = new Punkt(9, 10);
        Punkt f = new Punkt(11, 12);
        Punkt g = new Punkt(13, 14);

        Punkt[] p = {a, b, c, d, e, f, g, null, null};

        System.out.println(Punkt.najodleglejsze(p, 7)[0]);
        System.out.println(Punkt.najodleglejsze(p, 7)[1]);
    }
}