package com.PodstawyProgramowania.Lista5;

import java.io.Serializable;

/**
 * Created by kokoseq on 11.01.2017.
 */
public class Pomiar implements Serializable {
    private Czas czas;
    private double temperatura;

    public Pomiar(Czas czas, double temperatura) {
        this.czas = czas;
        this.temperatura = temperatura;
    }

    public Czas getCzas() {
        return czas;
    }

    public double getTemperatura() {
        return temperatura;
    }

    public String toString(){
        return "Temperatura: " + temperatura + " w dniu: " + czas.getRok() + "." + czas.getMiesiac() + "." + czas.getDzien() + ", o godzinie " + czas.getGodzina() + "." + czas.getMinuta() + ";";
    }

    public static Pomiar losowyPomiar() {
        return new Pomiar(Czas.losowyCzas(), (int) (Math.random() * 25));
    }

    public static Pomiar losowyPomiar(Czas czas) {
        return new Pomiar(czas, (int) (Math.random() * 25));
    }
}
