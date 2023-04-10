public class Main {

    public static void main(String[] args) {

        Book b1 = new Book("Ahmed");
        Book b2 = new Book();
        b2.setAuthor("Ahmed");



        System.out.println(b1.compare(b2));
    }
}
