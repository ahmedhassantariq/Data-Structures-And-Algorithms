public class Time {
    int min , sec , hr ;
    public Time(){
        min = 5 ;
        sec = 20 ;
        hr = 3 ;
    }
    public Time(int a , int b , int c ){
        this.hr = a ;
        this.min = b ;
        this.sec = c ;
    }
    public void display(){
        System.out.println("Time = " +hr+ ":" +min+ ":" +sec);
    }

}
