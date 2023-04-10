public class accrunner {
    public static void main(String[] args) {
        Account a1 = new Account();
        a1.withdraw();
        a1.deposit();

        Account a2 = new Account(30000);
        a2.withdraw();
        a2.deposit();
    }
}
