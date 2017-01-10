package com.PodstawyProgramowania.Lista3.Zadanie2;

import java.io.*;

/**
 * Created by kokoseq on 18.11.2016.
 */
public class FileSaveLoad {

    static void saveToFile(Object toSave) throws IOException {

        FileOutputStream fos = new FileOutputStream("employeesArray.tmp");
        ObjectOutputStream oos = new ObjectOutputStream(fos);
        oos.writeObject(toSave);
        oos.close();
    }

    static EmployeeArray readFromFile() throws IOException, ClassNotFoundException {

        FileInputStream fis = new FileInputStream("employeesArray.tmp");
        ObjectInputStream ois = new ObjectInputStream(fis);
        EmployeeArray employees = (EmployeeArray) ois.readObject();
        ois.close();
        return employees;
    }
}
