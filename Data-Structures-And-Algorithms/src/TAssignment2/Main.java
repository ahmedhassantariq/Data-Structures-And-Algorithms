package TAssignment2;

public class Main {
    public static void main(String[] args) {
        LinkedQueue linkedQueue = new LinkedQueue();
        linkedQueue.insertAtEnd(5);
        linkedQueue.insertAtEnd(2);
        linkedQueue.insertAtEnd(1);

        linkedQueue.deleteAtStart();
        linkedQueue.print();

    }

}
