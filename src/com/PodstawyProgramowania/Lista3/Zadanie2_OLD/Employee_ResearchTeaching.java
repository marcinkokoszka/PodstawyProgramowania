package com.PodstawyProgramowania.Lista3.Zadanie2_OLD;

/**
 * Created by kokoseq on 01.11.2016.
 */
public class Employee_ResearchTeaching extends Employee {

    private String researchField;
    private String teachingSubject;

    public Employee_ResearchTeaching(String firstName, String surname, String dateOfBirth, String pesel, int salary, String researchField, String teachingSubject) {
        super(firstName, surname, dateOfBirth, pesel, salary);
        this.researchField = researchField;
        this.teachingSubject = teachingSubject;
    }

    public String getResearchField() {
        return researchField;
    }

    public void setResearchField(String researchField) {
        this.researchField = researchField;
    }

    public String getTeachingSubject() {
        return teachingSubject;
    }

    public void setTeachingSubject(String teachingSubject) {
        this.teachingSubject = teachingSubject;
    }

    public String toString() {
        return getFirstName() + " " + getSurname() + ", urodzony " + getDateOfBirth() + ", PESEL: " + getPesel() + ", wynagrodzenie: " + getSalary() + ", zakres badań: " + getResearchField() + ", zakres nauczania: " + getTeachingSubject();
    }
}

