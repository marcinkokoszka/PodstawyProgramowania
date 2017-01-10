package com.PodstawyProgramowania.Lista3.Zadanie2;

import java.util.Arrays;
import java.util.Scanner;

/**
 * Created by kokoseq on 18.11.2016.
 */
public class MenuSearch {

    static void Menu() {

        menu:
        while (true) {
            System.out.println("MENU:\nWybierz parametr szukania:\n1. Nazwisko\n2. Imię\n3. Wiek\n4. PESEL\n5. Zarobki\n6. Dział administracyjny\n7. Zakres badań\n8. Powrót");
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
                    ageSearchMenu();
                    System.out.println();
                    break;
                case 4:
                    peselSearchMenu();
                    System.out.println();
                    break;
                case 5:
                    salarySearchMenu();
                    System.out.println();
                    break;
                case 6:
                    departmentSearchMenu();
                    System.out.println();
                    break;
                case 7:
                    researchSearchMenu();
                    System.out.println();
                    break;
                case 8:
                    break menu;
            }
        }
    }

    private static void surnameSearchMenu() {
        System.out.println("Podaj nazwisko");
        Scanner s = new Scanner(System.in).useDelimiter("\\n");
        String surname = s.next();
        int foundCounter = 0;
        for (Employee e : MainProgram.employees.array) {
            if (e.getSurname().equals(surname)) {
                System.out.println("" + (Arrays.asList(MainProgram.employees.array).indexOf(e) + 1) + ". " + e.toString());
                foundCounter++;
            }
        }
        if (foundCounter == 0) System.out.println("Nie znaleziono pracowników o nazwisku " + surname);
    }

    private static void nameSearchMenu() {
        System.out.println("Podaj imię");
        Scanner s = new Scanner(System.in).useDelimiter("\\n");
        int foundCounter = 0;
        String name = s.next();
        for (Employee e : MainProgram.employees.array) {
            if (e.getFirstName().equals(name)) {
                System.out.println("" + (Arrays.asList(MainProgram.employees.array).indexOf(e) + 1) + ". " + e.toString());
                foundCounter++;
            }
        }
        if (foundCounter == 0) System.out.println("Nie znaleziono pracowników o imieniu " + name);
    }

    private static void ageSearchMenu() {
        System.out.println("Podaj wiek");
        Scanner s = new Scanner(System.in).useDelimiter("\\n");
        int foundCounter = 0;
        int age = Integer.parseInt(s.next());
        for (Employee e : MainProgram.employees.array) {
            if (e.getAge() == age) {
                System.out.println("" + (Arrays.asList(MainProgram.employees.array).indexOf(e) + 1) + ". " + e.toString());
                foundCounter++;
            }
        }
        if (foundCounter == 0) System.out.println("Nie znaleziono pracowników w wieku " + age + " lat");
    }

    private static void peselSearchMenu() {
        System.out.println("Podaj PESEL");
        Scanner s = new Scanner(System.in).useDelimiter("\\n");
        int foundCounter = 0;
        String pesel = s.next();
        for (Employee e : MainProgram.employees.array) {
            if (e.getPesel().equals(pesel)) {
                System.out.println("" + (Arrays.asList(MainProgram.employees.array).indexOf(e) + 1) + ". " + e.toString());
                foundCounter++;
            }
        }
        if (foundCounter == 0) System.out.println("Nie znaleziono pracowników o peselu " + pesel);
    }

    private static void salarySearchMenu() {
        System.out.println("Podaj zarobki");
        Scanner s = new Scanner(System.in).useDelimiter("\\n");
        int foundCounter = 0;
        int salary = Integer.parseInt(s.next());
        for (Employee e : MainProgram.employees.array) {
            if (e.getSalary() == salary) {
                System.out.println("" + (Arrays.asList(MainProgram.employees.array).indexOf(e) + 1) + ". " + e.toString());
                foundCounter++;
            }
        }
        if (foundCounter == 0) System.out.println("Nie znaleziono pracowników o zarobkach wynoszących " + salary);
    }

    private static void departmentSearchMenu() {
        System.out.println("Podaj dział administracyjny");
        Scanner s = new Scanner(System.in).useDelimiter("\\n");
        int foundCounter = 0;
        String department = s.next();
        for (Employee e : MainProgram.employees.array) {
            if (e instanceof Employee_Administration) {
                Employee_Administration eAdm = (Employee_Administration) e;
                if (eAdm.getDepartment().equals(department)) {
                    System.out.println("" + (Arrays.asList(MainProgram.employees.array).indexOf(e) + 1) + ". " + e.toString());
                    foundCounter++;
                }
            }
        }
        if (foundCounter == 0) System.out.println("Nie znaleziono pracowników w dziale administracyjnym " + department);
    }

    private static void researchSearchMenu() {
        System.out.println("Podaj zakres badań");
        Scanner s = new Scanner(System.in).useDelimiter("\\n");
        int foundCounter = 0;
        String research = s.next();
        for (Employee e : MainProgram.employees.array) {
            if (e instanceof Employee_ResearchTeaching) {
                Employee_ResearchTeaching eRT = (Employee_ResearchTeaching) e;
                if (eRT.getResearchField().equals(research)) {
                    System.out.println("" + (Arrays.asList(MainProgram.employees.array).indexOf(e) + 1) + ". " + e.toString());
                    foundCounter++;
                }
            }
        }
        if (foundCounter == 0) System.out.println("Nie znaleziono pracowników o zakresie badań " + research);
    }
}
