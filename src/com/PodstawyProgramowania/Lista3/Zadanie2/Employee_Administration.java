package com.PodstawyProgramowania.Lista3.Zadanie2;

/**
 * Created by kokoseq on 01.11.2016.
 */
public class Employee_Administration extends Employee {

    private String department;

    public Employee_Administration(String firstName, String surname, String dateOfBirth, String pesel, int salary, String department) {
        super(firstName, surname, dateOfBirth, pesel, salary);
        this.department = department;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public String toString() {
        return super.toString() + ", dział administracyjny: " + getDepartment();
    }
}
