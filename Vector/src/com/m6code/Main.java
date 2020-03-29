package com.m6code;

import java.util.List;
import java.util.Vector;

public class Main {

    public static void main(String[] args) {
	    List<Employee> employeeList = new Vector<>();
	    employeeList.add(new Employee("Ada","Java",110));
        employeeList.add(new Employee("James","Adler",121));
        employeeList.add(new Employee("Cameron","Maroon",132));
        employeeList.add(new Employee("Rob","Dial",143));

        employeeList.forEach(System.out::println);
        //employeeList.forEach(employee -> System.out.println(employee));


    }
}
