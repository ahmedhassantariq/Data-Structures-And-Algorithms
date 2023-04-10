public class CountObjTest {
    public static void main(String[] args) {
        CountObj o1 = new CountObj() ;
        CountObj o2 = new CountObj(12);
        CountObj o3 = new CountObj(25);

        System.out.println("Number of object created " +CountObj.getObj());
        System.out.println("Number of object created " +o1.getObj());
    }
}
