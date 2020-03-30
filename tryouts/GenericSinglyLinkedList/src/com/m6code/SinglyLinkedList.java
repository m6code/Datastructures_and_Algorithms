package com.m6code;

public class SinglyLinkedList {
    private int count;
    private Node head;
    private Node tail;

    public void prepend(Object o){
        Node node = new Node(o, head);
        if (head == null){
            tail = node;
        }
        //node.setNext(head);
        head = node;
        count++;
    }

    public void append(Object obj){
     Node node = new Node(obj, null);
     if (head == null){
         head = node;
     }else{
         tail.setNext(node);
     }
     tail = node;
    }

    public Node removeFirst(){
        if (isEmpty()){
            return null;
        }
        Node rmObject = head;
        head = head.getNext();
        count--;
        rmObject.setNext(null);
        return rmObject;
    }

    public Node removeLast(){
        Node rmObject = tail;
        if (tail == null){
            return null;
        }
        if(head == tail){
            head = tail = null;
        }else{
            Node prev = head;
            while (prev.getNext() != tail){
                prev = prev.getNext();
            }
            prev.setNext(null);
            tail = prev;
        }
        return rmObject;
    }
    public int getCount(){
        return count;
    }

    public boolean isEmpty(){
        return head == null;
    }

    public void printList(){
        Node current = head;
        System.out.print("Head -> ");
        while(current != null){
            System.out.print(current );
            System.out.print(" -> ");
            current = current.getNext();
        }
        System.out.println("null");
    }
}
