package Queue;

public class Queue {
    private int queue[];
    private int front = -1;
    private int rear = -1;
    private int size;


    public Queue(int size) {

        this.queue = new int[size];
        this.size = size;
    }


    public void insert(int data){
        if(rear==size-1){
            System.out.println("Full Queue.Queue");
            return;
        }
        rear++;
        queue[rear] = data;
    }

    public int deletion(){
       if(isEmpty()){
           System.out.println("Empty");
           return -1;
       }
       int front = queue[0];
       for(int i=0;i<rear;i++){
           queue[i] = queue[i+1];
       }
       rear--;
       return front;
    }

    public int peek(){
        if(isEmpty()){
            System.out.println("Empty");
            return -1;
        }
        return queue[0];
    }

    public void display(){
        System.out.println("Display");
       int temp = front;
       while(temp!=rear){
           System.out.println(queue[temp]);
           temp=temp+1%queue.length;
       }
        System.out.println(queue[temp]);
    }

    public boolean isFull(){

        return (front==0&&rear==queue.length-1);
    }
    public boolean isEmpty(){
        return rear==-1;
    }
}
