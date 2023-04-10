package LinkedList;

public class LinkedList {

    //Singly Linked List
    public Node head;
    public int size;

    public void print() {
        if(head==null){
            System.out.println("List is empty in Print");
            return;
        }
        Node currentNode = head;
        while (currentNode != null) {
            System.out.println(currentNode.data);
            currentNode = currentNode.next;
        }
    }

    public void insertAtStart(int data) {
        Node newNode = new Node(data);
        if(head==null) {
            head = newNode;
            return;
        }
        newNode.next = head;
        head = newNode;
    }

    public void insertAtEnd(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            return;
        }
        Node currentNode = head;

        while (currentNode.next != null) {
            currentNode = currentNode.next;
        }
        currentNode.next = newNode;
    }

    public void search(int data) {
        int i = 0;
        Node currentNode = head;
        while (currentNode != null){
            if(currentNode.data==data){
                System.out.println(currentNode.data+ " : found at index : "+i);
                return;
            }
            i++;
            currentNode = currentNode.next;
        }
        System.out.println("Not Found");
    }

    public void deleteAtStart(){
        if(head==null){
            System.out.println("List is Empty");
            return;
        }
        if (head.next!=null){
            head = head.next;
        }
    }

    public void deleteAtEnd(){
        if(head==null){
            System.out.println("List is Empty");
            return;
        }
        if(head.next==null){
            head=null;
            return;
        }
        Node secondLastNode = head;
        Node lastNode = head.next;

        while(lastNode.next!=null){
            lastNode = lastNode.next;
            secondLastNode = secondLastNode.next;
        }
        secondLastNode.next=null;
    }

    public void replace(int i, int value){
        if(head==null){
            System.out.println("List is Empty in Replace");
            return;
        }
        int iteration = 0;
        Node currentNode = head;
        while (currentNode!=null){
            if(iteration==i){
                currentNode.data = value;
            }
            iteration++;
            currentNode = currentNode.next;
        }
    }

    public void rotate(int index){
        if(index==0)return;
        if(head==null||head.next==null){
            System.out.println("Rotation Error");
            return;
        }

        for (int i= 0;i<index;i++) {
        Node currentNode = head;

        int temp = currentNode.data;

        while (currentNode.next != null) {
            currentNode.data = currentNode.next.data;
            currentNode = currentNode.next;
        }
        currentNode.data = temp;
    }




    }

}
