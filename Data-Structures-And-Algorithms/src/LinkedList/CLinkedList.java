package LinkedList;
//Singly Circular Linked Linked List
public class CLinkedList {

    public Node head;
    public int size;


    public void insertAtStart(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            head.next = head;
        } else {
            newNode.next = head.next;
            head.next = newNode;
        }
        size++;
    }

    public void insertAtEnd(int data) {
        insertAtStart(data);
        head = head.next;
    }

    public void insertAtMiddle(int data) {
        if (head == null) {
            head = new Node(data);
            head.next = head;
        } else {
            Node newNode = new Node(data);
            Node behindNode = head.next;
            Node aheadNode = head.next;
            while (aheadNode != head && aheadNode.next != head) {
                aheadNode = aheadNode.next.next;
                 behindNode =  behindNode.next;
            }
            newNode.next =  behindNode.next;
             behindNode.next = newNode;
        }
        size++;
    }

    public void delete(int data) {
        if (head == null) return;
        Node currentNode = head.next;
        Node previousNode = head;
        while (currentNode != head) {
            if (currentNode.data == data) {
                previousNode.next = currentNode.next;
                size--;
                return;
            }
            previousNode = currentNode;
            currentNode = currentNode.next;
        }
        if (currentNode.data == data) {
            previousNode.next = currentNode.next;
            head = previousNode;
            size--;
        }
    }

    public boolean search(int data) {
        if (head == null) return false;
        Node currentNode = head.next;
        while (currentNode != head) {
            if (currentNode.data == data) return true;
            currentNode = currentNode.next;
        }
        return currentNode.data == data;
    }

    public int size() {
        return size;
    }

    public void print() {
        if (head == null) return;
        Node currentNode = head.next;
        while (currentNode != head) {
            System.out.print(currentNode.data);
            currentNode = currentNode.next;
        }
        System.out.println(currentNode.data);
    }
}