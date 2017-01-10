package com.PodstawyProgramowania.Lista3.Zadanie2;

import java.io.IOException;
import java.util.Scanner;

/**
 * Created by kokoseq on 18.11.2016.
 */
public class MenuMain {

    static void menu() {

        menu:
        while (true) {
            System.out.println("MENU:\n1. Wyświetl wszystkich pracowników\n2. Wyszukaj pracowników\n3. Dodaj pracownika\n4. Zapisz listę pracowników\n5. Wczytaj listę pracowników\n6. Wyjście z programu");
            Scanner s = new Scanner(System.in);
            int choice = s.nextInt();
            switch (choice) {
                case 1:
                    int i = 1;
                    for (Employee e : MainProgram.employees.array) {
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
                    try {
                        FileSaveLoad.saveToFile(MainProgram.employees);
                    } catch (IOException e) {
                        System.out.println("Nie można zapisać pliku\n");
                    }
                    System.out.println("Lista pracowników zapisana\n");
                    break;
                case 5:
                    try {
                        MainProgram.employees = FileSaveLoad.readFromFile();
                    } catch (IOException | ClassNotFoundException e) {
                        System.out.println("Nie można wczytać pliku\n");
                    }
                    System.out.println("Lista pracowników wczytana\n");
                    break;
                case 6:
                    break menu;
            }
        }
    }
}
