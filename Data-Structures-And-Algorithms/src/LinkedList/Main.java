package LinkedList;

import TAssignment2.LinkedQueue;

public class Main {
    public static void main(String[] args) {
        LinkedQueue linkedQueue = new LinkedQueue();
        linkedQueue.insertAtEnd(5);
        linkedQueue.insertAtEnd(7);
        linkedQueue.insertAtEnd(2);

        System.out.println(linkedQueue.deleteAtStart());
        System.out.println(linkedQueue.deleteAtStart());
        System.out.println(linkedQueue.deleteAtStart());
        System.out.println(linkedQueue.deleteAtStart());
        System.out.println(linkedQueue.deleteAtStart());



    }
}
