package Queue;

public class Main {
    public static void main(String[] args) {
        Queue queue = new Queue(5);
        queue.insert(5);
        queue.insert(2);
        queue.insert(3);
        while (!queue.isEmpty()){
            System.out.println(queue.peek());
            queue.deletion();
        }
    }
}
