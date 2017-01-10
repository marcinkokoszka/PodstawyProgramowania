package com.PodstawyProgramowania.Lista3.Zadanie2_OLD;

import java.io.IOException;
import java.util.Scanner;

/**
 * Created by kokoseq on 18.11.2016.
 */
public class MenuMain {

    static void menu() {

        menu:
        while (true) {
            System.out.println("MENU:\n1. Wyświetl wszystkich pracowników\n2. Wyszukaj pracowników\n3. Dodaj pracownika\n4. Usuń pracownika\n5. Zapisz listę pracowników\n6. Wczytaj listę pracowników\n7. Wyjście z programu");
            Scanner s = new Scanner(System.in);
            int choice = s.nextInt();
            switch (choice) {
                case 1:
                    int i = 1;
                    for (Employee e : Pracownicy.employees) {
                        System.out.println("" + i + ". " + e);
                        i++;
                    }
                    System.out.println();
                    break;
                case 2:
                    MenuSearch.Menu();
                    break;
                case 3:
                    MenuAddEmployee.menu();
                    break;
                case 4:
                    MenuDeleteEmployee.menu();
                    break;
                case 5:
                    try {
                        FileSaveLoad.saveToFile(Pracownicy.employees);
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                    System.out.println("Lista pracowników zapisana\n");
                    break;
                case 6:
                    try {
                        Pracownicy.employees = FileSaveLoad.readFromFile();
                    } catch (IOException | ClassNotFoundException e) {
                        e.printStackTrace();
                    }
                    System.out.println("Lista pracowników wczytana\n");
                    break;
                case 7:
                    break menu;
            }
        }
    }
}
