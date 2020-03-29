package com.m6code;

public class Main {

    public static void main(String[] args) {
        Employee janeJones = new Employee("Jane", "Jones", 110);
        Employee jonnyDrille = new Employee("Jonny", "Drill", 121);
        Employee amAcam = new Employee("Ambasador", "Acam", 132);
        Employee mannyPedi = new Employee("Manny", "Pedi", 143);


        EmployeeLinkedList linkedList = new EmployeeLinkedList();
        System.out.println(linkedList.isEmpty());
        linkedList.addToFront(janeJones);
        linkedList.addToFront(jonnyDrille);
        linkedList.addToFront(amAcam);
        linkedList.addToFront(mannyPedi);

        linkedList.printList();

        System.out.println(linkedList.getSize());
        System.out.println(linkedList.isEmpty());

        linkedList.removeFromFront();
        System.out.println(linkedList.getSize());
        linkedList.printList();
    }
}
