import java.util.Scanner;

public class Factorial {

    public static int factorial(int f){
        if(f==1){
            return 1;
        }
        return f*factorial(f-1);
    }


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int value = scanner.nextInt();


        for (int i =0;i<=value;i++){
            for (int j=1;j<=2*i-1;j++){

                if(j==1 || j==2*i-1 || i==value) {
                    System.out.print("*");
                }else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
