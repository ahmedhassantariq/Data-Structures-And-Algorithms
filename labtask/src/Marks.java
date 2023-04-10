public class Marks {
    int a,b,c,s;

    public Marks(){
        a=1;
        b=2;
        c=3;
    }
    public Marks(int x , int y , int z){
        this.a = x ;
        this.b = y ;
        this.c = z ;
    }
    public void Sum(){
       s = a+b+c;
        System.out.println("Sum ="+s); ;
    }

}
