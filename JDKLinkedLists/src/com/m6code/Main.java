package com.m6code;

import java.util.Iterator;
import java.util.LinkedList;

public class Main {

    static LinkedList<Employee> list = new LinkedList<>();

    public static void main(String[] args) {

        Employee janeJones = new Employee("Jane", "Jones", 110);
        Employee jonnyDrille = new Employee("Jonny", "Drill", 121);
        Employee amAcam = new Employee("Ambasador", "Acam", 132);
        Employee mannyPedi = new Employee("Manny", "Pedi", 143);

        list.addFirst(janeJones);
        list.addFirst(jonnyDrille);
        list.addFirst(amAcam);
        list.addFirst(mannyPedi);
        printList();

        Employee billEnd = new Employee("Bill", "End", 78);
        System.out.println("\nAdding to the Back..");
        list.add(billEnd); // or list.addLast(billEnd);
        System.out.println(list.size());
        printList();

        System.out.println("\nRemoving Last...");
        list.removeLast();
        System.out.println(list.size());
        printList();

        System.out.println("\nRemoving first...");
        list.remove(); // or list.removeFirst();
        System.out.println(list.size());
        printList();

    }

    public static void printList() {
        for (Employee employee : list) {
            System.out.println(employee);
        }
//        or
//        Iterator iter = list.iterator();
//        while (iter.hasNext()) {
//            System.out.println(iter.next());
//        }
    }
}
