public class Rectangle {
    public int length ;
    public int width ;

    //public int Calculatearea(){
      //  return length * width ;
    //}

    public  Rectangle(){
        length = 2 ;
        width  = 5 ;

    }
    public Rectangle(int l , int w ){
        this.length = l ;
        this.width = w ;
    }
    public int Calculatearea(){
        return (length*width) ;
    }
}
