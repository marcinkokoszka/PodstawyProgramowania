package com.PodstawyProgramowania.Lista3.Zadanie2_OLD;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * Created by kokoseq on 18.11.2016.
 */
public class MenuSearch {

    static void Menu() {

        menu:
        while (true) {
            System.out.println("MENU:\nWybierz parametr szukania:\n1. Nazwisko\n2. Imię\n3. Wiek\n4. PESEL\n5. Zarobki\n6. Dział administracyjny\n7. Zakres badań\n8. Przedmiot nauczania\n9. Powrót");
            Scanner s = new Scanner(System.in);
            int choice = s.nextInt();
            switch (choice) {
                case 1:
                    surnameSearchMenu();
                    System.out.println();
                    break;
                case 2:
                    nameSearchMenu();
                    System.out.println();
                    break;
                case 3:
                    //ageSearchMenu();
                    break;
                case 4:
                    //peselSearchMenu();
                    break;
                case 5:
                    //salarySearchMenu();
                    break;
                case 6:
                    //departmentSearchMenu();
                    break;
                case 7:
                    //researchSearchMenu();
                    break;
                case 8:
                    //teachingSearchMenu();
                    break;
                case 9:
                    break menu;
            }
        }
    }

    private static void surnameSearchMenu() {
        System.out.println("Podaj nazwisko");
        Scanner s = new Scanner(System.in);
        String surname = s.next();
        ArrayList<Employee> employeesSurnameFound = Search.findBySurname(Pracownicy.employees, surname);
        if (employeesSurnameFound.size() != 0) {
            for (Employee e : employeesSurnameFound) {
                System.out.println("" + (Pracownicy.employees.indexOf(e) + 1) + ". " + e.toString());
            }
        } else System.out.println("Nie znaleziono pracowników o nazwisku " + surname);
    }

    private static void nameSearchMenu() {
        System.out.println("Podaj imię");
        Scanner s = new Scanner(System.in);
        String name = s.next();
        ArrayList<Employee> employeesNameFound = Search.findByFirstName(Pracownicy.employees, name);
        if (employeesNameFound.size() != 0) {
            for (Employee e : employeesNameFound) {
                System.out.println("" + (Pracownicy.employees.indexOf(e) + 1) + ". " + e.toString());
            }
        } else System.out.println("Nie znaleziono pracowników o imieniu " + name);

    }
}
