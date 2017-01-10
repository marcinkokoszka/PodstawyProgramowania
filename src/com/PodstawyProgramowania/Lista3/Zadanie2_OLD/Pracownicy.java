package com.PodstawyProgramowania.Lista3.Zadanie2_OLD;

import java.io.IOException;
import java.util.ArrayList;

/**
 * Created by Marcin Kokoszka on 01.11.2016.
 */
public class Pracownicy {

    public static ArrayList<Employee> employees = new ArrayList<Employee>();

    public static void main(String[] args) {

        try {
            Pracownicy.employees = FileSaveLoad.readFromFile();
        } catch (IOException | ClassNotFoundException e) {
            //e.printStackTrace();
            System.out.println("Nieudane wczytanie listy pracowników.\nDodano 2 przykładowych pracowników");
            employees.add(new Employee_Administration("Jan", "Kowalski", "15.11.1966", "66111512345", 3500, "Księgowość"));
            employees.add(new Employee_ResearchTeaching("Mateusz", "Nowak", "30.01.1984", "84013012345", 5000, "Statyka Budowli", "Podstawy Statyki"));
        }

        MenuMain.menu();

    }

}
