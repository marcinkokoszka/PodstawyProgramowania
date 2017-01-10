package com.PodstawyProgramowania.Cwiczenia;

public class Punkt {
    double x, y;

    Punkt(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public static Punkt[] najodleglejsze(Punkt[] tp, int ip) { //tablica punktow, ilosc punktow
        Punkt[] np = new Punkt[2]; //najodleglejsze punkty
        double maxOdl = 0; //maksymalna odleglosc
        for (int i = 0; i < ip; i++) {
            for (int j = 0; j < ip; j++) {
                if (tp[i].odl(tp[j]) > maxOdl) {
                    np[0] = tp[i];
                    np[1] = tp[j];
                    maxOdl = tp[i].odl(tp[j]);
                }
            }
        }
        return np;
    }

    double odl(Punkt p) {
        return Math.sqrt((x - p.x) * (x - p.x) + (y - p.y) * (y - p.y));
    }

    boolean equals(Punkt p) {
        return x == p.x && y == p.y;
    }

    public String toString() {
        return "(" + x + ", " + y + ")";
    }
}