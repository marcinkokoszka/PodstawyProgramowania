package com.PodstawyProgramowania.Lista3.Zadanie2;

/**
 * Created by kokoseq on 01.11.2016.
 */
public class Employee_ResearchTeaching extends Employee {

    private String researchField;

    public Employee_ResearchTeaching(String firstName, String surname, String dateOfBirth, String pesel, int salary, String researchField) {
        super(firstName, surname, dateOfBirth, pesel, salary);
        this.researchField = researchField;
    }

    public String getResearchField() {
        return researchField;
    }

    public void setResearchField(String researchField) {
        this.researchField = researchField;
    }

    public String toString() {
        return super.toString() + ", zakres badań: " + getResearchField();
    }
}

