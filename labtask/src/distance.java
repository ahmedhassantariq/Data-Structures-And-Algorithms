public class distance {
    int ft , inch ;

    public distance(){
        ft = 5 ;
        inch = 3 ;
    }

    public distance(int a , int b){
        this.ft = a ;
        this.inch = b ;
    }
    public void display (){
        System.out.println("Feet ="+ft+ "Inches ="+inch );
    }
}
