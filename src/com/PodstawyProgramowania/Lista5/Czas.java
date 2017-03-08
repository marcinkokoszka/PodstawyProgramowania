package com.PodstawyProgramowania.Lista5;

import java.io.Serializable;

/**
 * Created by kokoseq on 11.01.2017.
 */
public class Czas implements Serializable {
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

    public boolean wczesniejszy(Czas czas) {
        if (rok != czas.getRok()) return rok < czas.getRok();
        else if (miesiac != czas.getMiesiac()) return miesiac < czas.getMiesiac();
        else if (dzien != czas.getDzien()) return dzien < czas.getDzien();
        else if (godzina != czas.getGodzina()) return godzina < czas.getGodzina();
        else return minuta < czas.getMinuta();
    }

    public static Czas losowyCzas() {
        return new Czas((int) (Math.random() * 100) + 1916, (int) (Math.random() * 11) + 1, (int) (Math.random() * 28) + 1, (int) (Math.random() * 23), (int) (Math.random() * 59));
    }

    @Override
    public boolean equals(Object obj){
        if (obj == null) return false;
        if (!Czas.class.isAssignableFrom(obj.getClass())) return false;
        if (this.getRok() != ((Czas) obj).getRok()) return false;
        if (this.getMiesiac() != ((Czas) obj).getMiesiac()) return false;
        if (this.getDzien() != ((Czas) obj).getDzien()) return false;
        if (this.getGodzina() != ((Czas) obj).getGodzina()) return false;
        if (this.getMinuta() != ((Czas) obj).getMinuta()) return false;
        return true;
    }
}
