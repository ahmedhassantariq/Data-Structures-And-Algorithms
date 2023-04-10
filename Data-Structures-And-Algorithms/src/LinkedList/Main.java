package LinkedList;

public class Main {
    public static void main(String[] args) {
        LinkedList linkedList = new LinkedList();
        linkedList.insertAtEnd(5);
        linkedList.insertAtEnd(6);
        linkedList.insertAtStart(4);
        linkedList.insertAtEnd(7);

        LinkedList linkedList2 = new LinkedList();
        linkedList2.insertAtEnd(9);
        linkedList2.insertAtEnd(10);
        linkedList2.insertAtStart(8);




        LinkedList linkedList3 = LOperations.conCat(linkedList,linkedList2);

        linkedList3.replace(0,22);

        linkedList3.search(9);

        linkedList3.rotate(4);

//        CLinkedList cLinkedList = new CLinkedList();
//        cLinkedList.insertAtStart(5);
//        cLinkedList.insertAtEnd(6);
//        cLinkedList.insertAtMiddle(4);
//        cLinkedList.insertAtEnd(7);
//        cLinkedList.delete(4);
//        System.out.println(cLinkedList.size());
//        cLinkedList.search(5);
//
//        cLinkedList.print();

        linkedList3.print();

    }
}
