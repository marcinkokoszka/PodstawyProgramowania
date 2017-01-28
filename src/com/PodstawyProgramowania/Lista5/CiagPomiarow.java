package com.PodstawyProgramowania.Lista5;

import java.io.*;

/**
 * Created by kokoseq on 28.01.2017.
 */
public class CiagPomiarow {
    private Pomiar[] pomiary;

    public static void main(String[] args) {
        CiagPomiarow cp = new CiagPomiarow(new Pomiar[] {Pomiar.losowyPomiar(), Pomiar.losowyPomiar(), Pomiar.losowyPomiar()});
        System.out.println("Przed zapisem do pliku: ");
        cp.wyswietl();
        cp.zapiszDoPliku();
        System.out.println("\nZmiana na losową wartość: ");
        cp.setPomiary(new Pomiar[]{Pomiar.losowyPomiar()});
        cp.wyswietl();
        cp.wczytajZPliku();
        System.out.println("\nPo wczytaniu z pliku: ");
        cp.wyswietl();

    }

    private void wyswietl() {
        for (int i = 0; i < pomiary.length; i++){
            System.out.println(pomiary[i]);
        }
    }

    public CiagPomiarow(Pomiar[] pomiary) {
        this.pomiary = pomiary;
    }

    public Pomiar[] getPomiary() {
        return pomiary;
    }

    public void setPomiary(Pomiar[] pomiary) {
        this.pomiary = pomiary;
    }

    public void zapiszDoPliku() {

        try (FileOutputStream fos = new FileOutputStream("CiagPomiarow.tmp");
             ObjectOutputStream oos = new ObjectOutputStream(fos)) {
            oos.writeObject(pomiary);
        } catch (IOException e) {
            System.out.println("Nie udało się zapisać pomiarów do pliku: " + e.getMessage());
        }
    }

    public void wczytajZPliku() {

        try (FileInputStream fis = new FileInputStream("CiagPomiarow.tmp");
             ObjectInputStream ois = new ObjectInputStream(fis)) {
            pomiary = (Pomiar[]) ois.readObject();
        } catch (IOException | ClassNotFoundException e) {
            System.out.println("Nie udało się wczytać pomiarów z pliku: " + e.getMessage());
        }
    }
}
