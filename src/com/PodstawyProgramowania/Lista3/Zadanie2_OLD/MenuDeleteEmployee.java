package com.PodstawyProgramowania.Lista3.Zadanie2_OLD;

import java.util.Scanner;

/**
 * Created by kokoseq on 19.11.2016.
 */
public class MenuDeleteEmployee {

    static void menu() {

        menu:
        while (true) {
            System.out.println("MENU:\n1. Usuń po aktualnym numerze porządkowym na liście pracowników\n2. Usuń po numerze PESEL\n3. Powrót");
            Scanner s = new Scanner(System.in);
            int choice = s.nextInt();
            switch (choice) {
                case 1:
                    System.out.println("Podaj aktualny numer porządkowy:");
                    int employeeNo = s.nextInt() - 1;
                    if (employeeNo > 0 && employeeNo <= Pracownicy.employees.size()) {
                        Pracownicy.employees.remove(employeeNo);
                        System.out.println("Pracownik usunięty\n ");
                    } else System.out.println("Nieprawidłowy numer\n ");
                    break;
                case 2:
                    System.out.println("Podaj numer PESEL:");
                    String employeePesel = s.next();
                    int deleteCheck = Pracownicy.employees.size();
                    Pracownicy.employees.removeIf(p -> p.getPesel().equals(employeePesel));
                    if (deleteCheck > Pracownicy.employees.size()) System.out.println("Pracownik usunięty\n ");
                    else
                        System.out.println("Pracownik o podanym numerze PESEL nie znajduje się na liście pracowników\n ");
                    break;
                case 3:
                    break menu;
            }
        }
    }
}
