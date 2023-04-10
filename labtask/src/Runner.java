public class Runner {
    public static void main(String[] args) {
        Rectangle rect = new Rectangle() ;
        //rect.length    = 5 ;
        //rect.width  = 10 ;

        System.out.println(rect.Calculatearea());
        Rectangle rect2 = new Rectangle(10,20) ;
        System.out.println(rect2.Calculatearea());



        Point p1 = new Point() ;
        p1.move(2,3);
        p1.display();

        Point p2 = new Point(4,5);
        p2.display();

    }


}
