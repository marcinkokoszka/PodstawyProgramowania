package com.PodstawyProgramowania.Lista3.Zadanie2_OLD;

/**
 * Created by Marcin Kokoszka on 01.11.2016.
 */
public class Employee extends Person {

    private int salary;

    public Employee(String firstName, String surname, String dateOfBirth, String pesel, int salary) {
        super(firstName, surname, dateOfBirth, pesel);
        this.salary = salary;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public String toString() {
        return getFirstName() + " " + getSurname() + ", urodzony " + getDateOfBirth() + ", PESEL: " + getPesel() + ", wynagrodzenie: " + getSalary();
    }
}
