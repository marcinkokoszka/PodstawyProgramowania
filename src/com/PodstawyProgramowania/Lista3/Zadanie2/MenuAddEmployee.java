package com.PodstawyProgramowania.Lista3.Zadanie2;

import java.util.Scanner;

/**
 * Created by kokoseq on 19.11.2016.
 */
public class MenuAddEmployee {

    static void menu() {

        menu:
        while (true) {
            System.out.println("MENU:\n1. Pracownik administracyjny\n2. Pracownik naukowy\n3. Powrót");
            Scanner s = new Scanner(System.in).useDelimiter("\\n");
            int choice = s.nextInt();
            switch (choice) {
                case 1:
                    System.out.println("Podaj: imię, nazwisko, data urodzenia (dd.MM.yyyy), PESEL, wynagrodzenie miesięczne brutto, dział administracyjny");
                    String employeeAData = s.next();
                    try {
                        String[] dataArray = employeeAData.split(", ");
                        MainProgram.employees.add(new Employee_Administration(dataArray[0], dataArray[1], dataArray[2], dataArray[3], Integer.valueOf(dataArray[4]), dataArray[5]));
                        System.out.println("Pracownik dodany\n");
                    } catch (java.lang.ArrayIndexOutOfBoundsException | java.lang.NumberFormatException e) {
                        System.out.println("Niepoprawne dane lub format zapisu\n");
                    }
                    break;
                case 2:
                    System.out.println("Podaj: imię, nazwisko, data urodzenia (dd.MM.yyyy), PESEL, wynagrodzenie miesięczne brutto, zakres badań");
                    String employeeRData = s.next();
                    try {
                        String[] dataRArray = employeeRData.split(", ");
                        MainProgram.employees.add(new Employee_ResearchTeaching(dataRArray[0], dataRArray[1], dataRArray[2], dataRArray[3], Integer.valueOf(dataRArray[4]), dataRArray[5]));
                        System.out.println("Pracownik dodany\n");
                    } catch (java.lang.ArrayIndexOutOfBoundsException | java.lang.NumberFormatException e) {
                        System.out.println("Niepoprawne dane lub format zapisu\n");
                    }
                    break;
                case 3:
                    break menu;
            }
        }
    }
}
