package com.PodstawyProgramowania.Lista3.Zadanie2;

import java.io.Serializable;

/**
 * Created by kokoseq on 10.12.2016.
 */
public class EmployeeArray implements Serializable {

    public Employee[] array;

    public EmployeeArray() {
        array = new Employee[0];
    }

    public void add(Employee e) {
        Employee[] temp = new Employee[array.length + 1];
        for (int i = 0; i < array.length; i++) {
            temp[i] = array[i];
        }
        temp[array.length] = e;
        array = temp;
    }

    private String randomFemaleName() {
        String[] fn = {"Anna", "Joanna", "Izabela", "Katarzyna", "Barbara", "Justyna", "Monika", "Beata", "Ewa", "Małgorzata"};
        return fn[(int) (Math.random() * 10)];
    }

    private String randomFemaleSurname() {
        String[] fs = {"Nowak", "Kowalska", "Wiśniewska", "Dąbrowska", "Lewandowska", "Wójcik", "Kamińska", "Kowalczyk", "Zielińska", "Szymańska"};
        return fs[(int) (Math.random() * 10)];
    }

    private String randomMaleName() {
        String[] mn = {"Alan", "Marcin", "Michał", "Piotr", "Zbigniew", "Dawid", "Kacper", "Konrad", "Kajetan", "Hubert"};
        return mn[(int) (Math.random() * 10)];
    }

    private String randomMaleSurname() {
        String[] ms = {"Nowak", "Kowalski", "Wiśniewski", "Dąbrowski", "Lewandowski", "Wójcik", "Kamiński", "Kowalczyk", "Zieliński", "Szymański"};
        return ms[(int) (Math.random() * 10)];
    }

    private String[] randomDatePesel() {
        String[] s = new String[2];
        s[0] = String.valueOf((int) (10 + Math.random() * 16)) + ".0" + String.valueOf((int) (1 + Math.random() * 9)) + "." + String.valueOf(1950 + (int) (Math.random() * 46));
        s[1] = s[0].split("\\.")[2].substring(2) + s[0].split("\\.")[1] + s[0].split("\\.")[0] + String.valueOf((int) (10000 + Math.random() * 80000));
        return s;
    }

    private int randomSalary() {
        return (int) (Math.random() * 10000);
    }

    private String randomDepartment() {
        String[] d = {"Ewidencja i Zaopatrzenie", "Archiwum", "Poligrafia", "Księgowość", "Rekrutacja", "Marketing", "Biuro Prasowe"};
        return d[(int) (Math.random() * 7)];
    }

    private String randomResearch() {
        String[] d = {"Statyka Budowli", "Wytrzymałość Materiałów", "Konstrukcje Żelbetowe", "Konstrukcje Stalowe", "Metoda Elementów Skończonych", "Matematyka", "Fizyka"};
        return d[(int) (Math.random() * 7)];
    }

    public Employee_Administration randomFemaleAdm() {
        return new Employee_Administration(randomFemaleName(), randomFemaleSurname(), randomDatePesel()[0], randomDatePesel()[1], randomSalary(), randomDepartment());
    }

    public Employee_Administration randomMaleAdm() {
        return new Employee_Administration(randomMaleName(), randomMaleSurname(), randomDatePesel()[0], randomDatePesel()[1], randomSalary(), randomDepartment());
    }

    public Employee_ResearchTeaching randomFemaleRes() {
        return new Employee_ResearchTeaching(randomFemaleName(), randomFemaleSurname(), randomDatePesel()[0], randomDatePesel()[1], randomSalary(), randomResearch());
    }

    public Employee_ResearchTeaching randomMaleRes() {
        return new Employee_ResearchTeaching(randomMaleName(), randomMaleSurname(), randomDatePesel()[0], randomDatePesel()[1], randomSalary(), randomResearch());
    }
}
