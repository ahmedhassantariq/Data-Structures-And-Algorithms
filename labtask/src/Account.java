public class Account {
    int balance;

    public Account() {
        balance = 2000;
    }
    public Account(int a ) {
        balance = a ;
    }
    public void withdraw(){
        int money = 10000;
        balance = balance - money;
        System.out.println("The balance = "+balance);
    }
    public void deposit(){
        int money = 10000;
        balance = money + balance;
        System.out.println("The balance = "+balance);
    }


}
