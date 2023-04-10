public class DateDemo {
    public static void main(String[] args) {
        Date date1 = new Date() ;
        Date date2 = new Date() ;
        date1.month = "December " ;
        date1.day = 31 ;
        date1.year = 1992 ;

        System.out.println("date1 :");
        date1.displayDate();


        date2.month = "December" ;
        date2.day = 31 ;
        date2.year = 1992 ;

        System.out.println("date2 :");
        date2.displayDate();
    }
}
