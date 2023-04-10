package LinkedList;

public class LOperations {
    //Operations from Theory Assignment
    public static LinkedList copy(LinkedList linkedList){
        if(linkedList.head==null){
            System.out.println("List is Empty");
            return null;
        }
        LinkedList temp = new LinkedList();
        while(linkedList.head!=null){
            temp.insertAtEnd(linkedList.head.data);
            linkedList.head = linkedList.head.next;
        }
        return temp;
    }

    public static LinkedList conCat(LinkedList linkedList1,LinkedList linkedList2){
        if(linkedList1.head==null){
            System.out.println("List is Empty");
            return null;
        }
        LinkedList temp = new LinkedList();
        Node currentNode = linkedList1.head;
        while (currentNode != null) {
            temp.insertAtEnd(currentNode.data);
            currentNode = currentNode.next;
        }
        if(linkedList2.head==null){
            System.out.println("List is Empty");
            return null;
        }
        Node currNode = linkedList2.head;
        while (currNode!=null){
            temp.insertAtEnd(currNode.data);
            currNode = currNode.next;
        }
        return temp;
    }

}
