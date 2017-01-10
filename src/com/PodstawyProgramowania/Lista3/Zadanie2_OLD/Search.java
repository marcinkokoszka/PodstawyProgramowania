package com.PodstawyProgramowania.Lista3.Zadanie2_OLD;

import java.util.ArrayList;

/**
 * Created by kokoseq on 18.11.2016.
 */
public class Search {

    static ArrayList<Employee> findByFirstName(ArrayList<Employee> employeeList, String name) {
        ArrayList<Employee> employeesFound = new ArrayList<Employee>();
        for (Employee anEmployeeList : employeeList)
            if (anEmployeeList.getFirstName().equals(name)) employeesFound.add(anEmployeeList);
        return employeesFound;
    }

    static ArrayList<Employee> findBySurname(ArrayList<Employee> employeeList, String surname) {
        ArrayList<Employee> employeesFound = new ArrayList<Employee>();
        for (Employee anEmployeeList : employeeList)
            if (anEmployeeList.getSurname().equals(surname)) employeesFound.add(anEmployeeList);
        return employeesFound;
    }

}
