package com.m6code;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        List<Employee> employeeList = new ArrayList<>();
        employeeList.add(new Employee("Jane", "Jones", 110));
        employeeList.add(new Employee("Tom", "Cat", 121));
        employeeList.add(new Employee("Jerry" ,"Mouse", 132));
        employeeList.add(new Employee("Harry", "Jones", 143));

        employeeList.forEach(System.out::println);
        //or
        //employeeList.forEach(employee -> System.out.println(employee));

        System.out.println(employeeList.isEmpty());
        System.out.println(employeeList.size());

        System.out.println(employeeList.contains(new Employee("Tom", "Cat", 121)));
        System.out.println(employeeList.indexOf(new Employee("Jerry", "Mouse", 132)));
    }
}
