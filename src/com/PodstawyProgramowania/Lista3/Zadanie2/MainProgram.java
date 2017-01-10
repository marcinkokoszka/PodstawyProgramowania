package com.PodstawyProgramowania.Lista3.Zadanie2;

import java.io.IOException;

/**
 * Created by kokoseq on 10.12.2016.
 */
public class MainProgram {

    public static EmployeeArray employees = new EmployeeArray();

    public static void main(String[] args) {

        try {
            employees = FileSaveLoad.readFromFile();
        } catch (IOException | ClassNotFoundException e) {
            //e.printStackTrace();
            System.out.println("Nieudane wczytanie listy pracowników.\nDodano 100 przykładowych pracowników");
            for (int i = 0; i < 100; i++) {
                double r = Math.random();
                if (r < 0.25) employees.add(employees.randomFemaleAdm());
                else if (r < 0.5) employees.add(employees.randomMaleAdm());
                else if (r < 0.75) employees.add(employees.randomFemaleRes());
                else employees.add(employees.randomMaleRes());
            }
        }
        MenuMain.menu();

    }

}
