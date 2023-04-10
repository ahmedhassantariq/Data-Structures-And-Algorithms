package CircularQueue;

public class Main {
    public static void main(String[] args) {
        CircularQueue cQ = new CircularQueue(5);
        cQ.insert(1);
        cQ.insert(2);
        cQ.insert(3);
        cQ.insert(4);
        cQ.insert(5);
        System.out.println(cQ.deletion());
        cQ.insert(6);
        System.out.println(cQ.deletion());
        cQ.insert(7);
        while (!cQ.isEmpty()){
            System.out.println(cQ.deletion());
        }
    }
}
