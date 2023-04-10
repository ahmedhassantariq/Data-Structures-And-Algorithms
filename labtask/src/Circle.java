public class Circle {
public double r,cir;
public Circle()
{
    r = 2;
}
public Circle(double a){
    r=a;
}
public double circumfrence(){
    return cir = 3.14 * (r*r);

}
public void display(){
    System.out.println("circum = " +circumfrence());
}
}
