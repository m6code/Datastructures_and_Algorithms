package com.m6code;

public class Main {

    public static void main(String[] args) {
	  Node intNode = new Node(67, null);
	  Node strNode = new Node("Namestey", intNode);
	  Node dblNode = new Node(90.12, strNode);

	  SinglyLinkedList list = new SinglyLinkedList();
	  list.prepend(intNode);
	  list.prepend(strNode);
	  list.prepend(dblNode);

	  list.printList();

	  list.append(new Node("Ngozi", dblNode));
	  list.printList();
	  list.prepend(new Node("Joeboy", strNode));
	  list.printList();
    }
}
