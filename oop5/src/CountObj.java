public class CountObj {
    private  static int obj ;

    public CountObj(){
        obj++ ;
    }
    public CountObj(int a){
        int x = a ;
        obj++ ;
    }

    public static int getObj() {
        return obj;
    }

}
