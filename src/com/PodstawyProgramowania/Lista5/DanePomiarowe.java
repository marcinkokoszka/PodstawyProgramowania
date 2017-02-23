package com.PodstawyProgramowania.Lista5;

import java.io.*;
import java.util.ArrayList;

/**
 * Created by kokoseq on 11.01.2017.
 */
public class DanePomiarowe {

    public static void main(String args[]) {

        DanePomiarowe dp = new DanePomiarowe();

        for (int i = 0; i < 100; i++){
            dp.dopiszChronologicznie(Pomiar.losowyPomiar());
        }

        for (int i = 0; i < 30; i++) {
            dp.dopiszChronologicznie(Pomiar.losowyPomiar(new Czas(2015, 2, (int) (Math.random() * 28), (int) (Math.random() * 24), (int) (Math.random() * 60))));
            dp.dopiszChronologicznie(Pomiar.losowyPomiar());
        }

        System.out.println("Wszystkie pomiary z pliku:");
        System.out.println(dp.wczytajWszystkie());

        System.out.println("\nPomiary z Lutego 2015:");
        dp.wypiszPomiaryMiesiaca(2015, 2);
        System.out.println("\nPomiary w dni Lutego, w których nastąpiło ocieplenie: ");
        dp.wypiszPomiaryMiesiacaOcieplenie(2015, 2);
    }

    public boolean dopisz(Pomiar p){

        File file = new File("DanePomiarowe.dat");

        try (FileOutputStream fos = new FileOutputStream(file, true);
             BufferedOutputStream bos = new BufferedOutputStream(fos);
             DataOutputStream dos = new DataOutputStream(bos)) {

            if (!file.exists()) file.createNewFile();

            dos.writeInt(p.getCzas().getRok());
            dos.writeInt(p.getCzas().getMiesiac());
            dos.writeInt(p.getCzas().getDzien());
            dos.writeInt(p.getCzas().getGodzina());
            dos.writeInt(p.getCzas().getMinuta());
            dos.writeDouble(p.getTemperatura());

            return true;

        } catch (IOException e) {

            e.printStackTrace();

        }
        return false;
    }

    public ArrayList<Pomiar> wczytajWszystkie(){

        File file = new File("DanePomiarowe.dat");

        try (FileInputStream fis = new FileInputStream(file);
             BufferedInputStream bis = new BufferedInputStream(fis);
             DataInputStream dis = new DataInputStream(bis)) {

            ArrayList<Pomiar> pomiary = new ArrayList<>();

            while(true){
                try {
                    pomiary.add(new Pomiar(new Czas(dis.readInt(), dis.readInt(),dis.readInt(),dis.readInt(),dis.readInt()), dis.readDouble()));
                }
                catch(EOFException eof) {
                    break;
                }

            }

            return pomiary;

        } catch (IOException e) {

            e.printStackTrace();

        }
        return null;
    }

    public boolean dopiszChronologicznie(Pomiar p){
        File file = new File("DanePomiarowe.dat");
        ArrayList<Pomiar> pomiary = new ArrayList<>();

        if (file.exists()) {
            pomiary = wczytajWszystkie();
            boolean added = false;
            for (Pomiar pomiar : pomiary) {
                if (p.getCzas().wczesniejszy(pomiar.getCzas())) {
                    pomiary.add(pomiary.indexOf(pomiar), p);
                    added = true;
                    break;
                }
            }
            if (!added) pomiary.add(p);
        } else {
            pomiary.add(p);
        }

        try (FileOutputStream fos = new FileOutputStream(file);
             BufferedOutputStream bos = new BufferedOutputStream(fos);
             DataOutputStream dos = new DataOutputStream(bos)) {

            if (!file.exists()) file.createNewFile();

            for (Pomiar pomiar: pomiary) {
                dos.writeInt(pomiar.getCzas().getRok());
                dos.writeInt(pomiar.getCzas().getMiesiac());
                dos.writeInt(pomiar.getCzas().getDzien());
                dos.writeInt(pomiar.getCzas().getGodzina());
                dos.writeInt(pomiar.getCzas().getMinuta());
                dos.writeDouble(pomiar.getTemperatura());
            }
            return true;

        } catch (IOException e) {

            e.printStackTrace();

        }
        return false;
    }

    public void wypiszPomiaryMiesiaca(int rok, int miesiac){

        ArrayList<Pomiar> pomiary = wczytajWszystkie();
        for (Pomiar pomiar: pomiary){
            if (pomiar.getCzas().getRok() == rok && pomiar.getCzas().getMiesiac() == miesiac) {
                System.out.println(pomiar);
            }
        }
    }

    public void wypiszPomiaryMiesiacaOcieplenie(int rok, int miesiac){

        ArrayList<Pomiar> pomiary = wczytajWszystkie();
        for (int i = 1; i < pomiary.size(); i++){
            if (pomiary.get(i).getCzas().getRok() == rok && pomiary.get(i).getCzas().getMiesiac() == miesiac) {
                if (pomiary.get(i).getTemperatura() > pomiary.get(i-1).getTemperatura())
                System.out.println(pomiary.get(i));
            }
        }
    }



}
