package com.PodstawyProgramowania.Lista5;

/**
 * Created by kokoseq on 11.01.2017.
 */
public class Czas {
    private int rok, miesiac, dzien, godzina, minuta;

    public Czas(int rok, int miesiac, int dzien, int godzina, int minuta) {
        this.rok = rok;
        this.miesiac = miesiac;
        this.dzien = dzien;
        this.godzina = godzina;
        this.minuta = minuta;
    }

    public int getRok() {
        return rok;
    }

    public int getMiesiac() {
        return miesiac;
    }

    public int getDzien() {
        return dzien;
    }

    public int getGodzina() {
        return godzina;
    }

    public int getMinuta() {
        return minuta;
    }

//    public boolean pozniejNiz(Czas czas){
//        if (czas.getRok() > rok) return true;
//        else if
//    }
}
