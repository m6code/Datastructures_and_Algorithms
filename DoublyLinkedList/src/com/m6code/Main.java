package com.m6code;

public class Main {

    public static void main(String[] args) {
        Employee janeJones = new Employee("Jane", "Jones", 110);
        Employee jonnyDrille = new Employee("Jonny", "Drill", 121);
        Employee amAcam = new Employee("Ambasador", "Acam", 132);
        Employee mannyPedi = new Employee("Manny", "Pedi", 143);

        EmployeeDoublyLinkedList list = new EmployeeDoublyLinkedList();

        System.out.println(list.isEmpty());

        list.addToFront(janeJones);
        list.addToFront(jonnyDrille);
        list.addToFront(amAcam);
        list.addToFront(mannyPedi);

        System.out.println(list.isEmpty());


        System.out.println(list.getSize());
        list.printList();

        Employee billEnd = new Employee("Bill", "End", 78);
        list.addToBack(billEnd);
        System.out.println(list.getSize());
        list.printList();

        list.removeFromFront();
        System.out.println(list.getSize());
        list.printList();

        list.removeFromBack();
        System.out.println(list.getSize());
        list.printList();
    }
}
