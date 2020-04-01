package academy.learnprogramming.challenge2;

public class IntegerLinkedList {

    private IntegerNode head;
    private int size;

    public void addToFront(Integer value) {
        IntegerNode node = new IntegerNode(value);
        node.setNext(head);
        head = node;
        size++;
    }

    public IntegerNode removeFromFront() {
        if (isEmpty()) {
            return null;
        }

        IntegerNode removedNode = head;
        head = head.getNext();
        size--;
        removedNode.setNext(null);
        return removedNode;
    }

    public void insertSorted(Integer value) {

        if (head == null || head.getValue() >= value){
            addToFront(value);
            return;
        }
        IntegerNode current = head.getNext();
        IntegerNode prev = head;
        while (current != null && value >= current.getValue()){
            prev = current;
            current = current.getNext();
        }

        IntegerNode nuNode = new IntegerNode(value);
        nuNode.setNext(current);
        prev.setNext(nuNode);
        size++;

        // add your code here

    }

    public int getSize() {
        return size;
    }

    public boolean isEmpty() {
        return head == null;
    }

    public void printList() {
        IntegerNode current = head;
        System.out.print("HEAD -> ");
        while (current != null) {
            System.out.print(current);
            System.out.print(" -> ");
            current = current.getNext();
        }
        System.out.println("null");
    }

}
