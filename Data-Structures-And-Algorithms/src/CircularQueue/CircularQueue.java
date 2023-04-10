package CircularQueue;

public class CircularQueue {
    private int cQueue[];
    private int front = -1;
    private int rear = -1;
    private int size;


    public CircularQueue(int size) {

        this.cQueue = new int[size];
        this.size = size;
    }


    public void insert(int data){
        if(isFull()){
            System.out.println("Full");
            return;
        }
        if(front==-1){
            front = 0;
        }
        rear = (rear+1)%size;
        cQueue[rear] = data;
    }

    public int deletion(){
        if(isEmpty()) {
            System.out.println("Empty");
            return -1;
        }
        int result = cQueue[front];
        if(rear==front){
            rear=front=-1;
        }else {
            front=(front+1)%size;
        }
        return result;

    }

    public void display(){
        System.out.println("Display");
       int temp = front;
       while(temp!=rear){
           System.out.println(cQueue[temp]);
           temp=temp+1% cQueue.length;
       }
        System.out.println(cQueue[temp]);
    }
    public int peek(){
        if (isEmpty()){
            System.out.println("Empty");
            return -1;
        }
        return cQueue[front];
    }

    public boolean isFull(){

        return (rear+1)%size==front;
    }
    public boolean isEmpty(){
        return (front==-1&&front==-1);
    }
}
