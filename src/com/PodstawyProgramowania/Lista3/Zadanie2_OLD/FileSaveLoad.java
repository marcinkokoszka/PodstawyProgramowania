package com.PodstawyProgramowania.Lista3.Zadanie2_OLD;

import java.io.*;
import java.util.ArrayList;

/**
 * Created by kokoseq on 18.11.2016.
 */
public class FileSaveLoad {

    static void saveToFile(Object toSave) throws IOException {

        FileOutputStream fos = new FileOutputStream("employees.tmp");
        ObjectOutputStream oos = new ObjectOutputStream(fos);
        oos.writeObject(toSave);
        oos.close();
    }

    static ArrayList<Employee> readFromFile() throws IOException, ClassNotFoundException {

        FileInputStream fis = new FileInputStream("employees.tmp");
        ObjectInputStream ois = new ObjectInputStream(fis);
        ArrayList<Employee> employees = (ArrayList<Employee>) ois.readObject();
        ois.close();
        return employees;
    }
}
