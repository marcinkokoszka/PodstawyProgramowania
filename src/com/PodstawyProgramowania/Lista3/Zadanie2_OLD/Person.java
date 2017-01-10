package com.PodstawyProgramowania.Lista3.Zadanie2_OLD;

import java.io.Serializable;
import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;

/**
 * Created by Marcin Kokoszka on 01.11.2016.
 */
class Person implements Serializable {

    private String firstName;
    private String surname;
    private String dateOfBirth;
    private String pesel;


    Person(String firstName, String surname, String dateOfBirth, String pesel) {
        this.firstName = firstName;
        this.surname = surname;
        this.dateOfBirth = dateOfBirth;
        this.pesel = pesel;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(String dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public String getPesel() {
        return pesel;
    }

    public void setPesel(String pesel) {
        this.pesel = pesel;
    }

    private LocalDate getDate() {

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd.MM.yyyy");
        // formatter = formatter.withLocale(Locale.ENGLISH );  // Locale specifies human language for translating, and cultural norms for lowercase/uppercase and abbreviations and such. Example: Locale.US or Locale.CANADA_FRENCH
        return LocalDate.parse(dateOfBirth, formatter);
    }

    int getAge() {
        LocalDate currentDate = LocalDate.now();
        if (dateOfBirth != null) {
            return Period.between(getDate(), currentDate).getYears();
        } else {
            return 0;
        }
    }

    public String toString() {
        return firstName + " " + surname + ", urodzony " + dateOfBirth + ", PESEL: " + pesel;
    }
}
