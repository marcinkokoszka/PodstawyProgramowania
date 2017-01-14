package com.PodstawyProgramowania.Lista5;

import java.io.*;
import java.util.ArrayList;

/**
 * Created by kokoseq on 11.01.2017.
 */
public class DanePomiarowe {

    public static void main(String args[]) {

        Pomiar p1 = new Pomiar(new Czas(2017, 1, 9, 22, 5), -6.3);
        Pomiar p2 = new Pomiar(new Czas(2017, 1, 10, 23, 6), -9.3);
        Pomiar p3 = new Pomiar(new Czas(2017, 1, 11, 0, 7), -13.0);

        DanePomiarowe dp = new DanePomiarowe();

        dp.dopisz(p1);
        dp.dopisz(p2);
        dp.dopisz(p3);

        System.out.println(dp.wczytajWszystkie());
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

//    public dopiszChronologicznie(Pomiar p){
//        File file = new File("DanePomiarowe.dat");
//
//        ArrayList<Pomiar> pomiary = wczytajWszystkie();
//        for (Pomiar pomiar: pomiary){
//            if (p.getCzas().earlierThan(pomiar.getCzas())) {
//                pomiary.add(pomiary.indexOf(pomiar), p);
//            }
//        }
//
//        try (FileOutputStream fos = new FileOutputStream(file, true);
//             BufferedOutputStream bos = new BufferedOutputStream(fos);
//             DataOutputStream dos = new DataOutputStream(bos)) {
//
//            if (!file.exists()) file.createNewFile();
//
//            for (Pomiar p: pomiary){
//            dos.writeInt(p.getCzas().getRok());
//            dos.writeInt(p.getCzas().getMiesiac());
//            dos.writeInt(p.getCzas().getDzien());
//            dos.writeInt(p.getCzas().getGodzina());
//            dos.writeInt(p.getCzas().getMinuta());
//            dos.writeDouble(p.getTemperatura());
//
//            return true;
//
//        } catch (IOException e) {
//
//            e.printStackTrace();
//
//        }
//        return false;
//    }



}
