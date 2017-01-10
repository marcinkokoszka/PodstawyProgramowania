package com.PodstawyProgramowania.Lista3.Zadanie2_OLD;

import java.util.Scanner;

/**
 * Created by kokoseq on 19.11.2016.
 */
public class MenuAddEmployee {

    static void menu() {

        menu:
        while (true) {
            System.out.println("MENU:\n1. Pracownik administracyjny\n2. Pracownik naukowy\n3. Powrót");
            Scanner s = new Scanner(System.in);
            int choice = s.nextInt();
            switch (choice) {
                case 1:
                    System.out.println("Podaj bez spacji: imię,nazwisko,data urodzenia (dd.MM.yyyy),PESEL,wynagrodzenie miesięczne brutto,dział administracyjny");
                    String employeeAData = s.next();
                    String[] dataArray = employeeAData.split(",");
                    Pracownicy.employees.add(new Employee_Administration(dataArray[0], dataArray[1], dataArray[2], dataArray[3], Integer.valueOf(dataArray[4]), dataArray[5]));
                    break;
                case 2:
                    System.out.println("Podaj bez spacji: imię, nazwisko, data urodzenia (dd.MM.yyyy), PESEL, wynagrodzenie miesięczne brutto, zakres badań, zakres nauczania");
                    String employeeRData = s.next();
                    String[] dataRArray = employeeRData.split(",");
                    Pracownicy.employees.add(new Employee_ResearchTeaching(dataRArray[0], dataRArray[1], dataRArray[2], dataRArray[3], Integer.valueOf(dataRArray[4]), dataRArray[5], dataRArray[6]));
                    break;
                case 3:
                    break menu;
            }
        }
    }
}
