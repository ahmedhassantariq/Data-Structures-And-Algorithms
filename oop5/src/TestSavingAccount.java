public class TestSavingAccount {
    public static void main(String[] args) {
        SavingAccount saver1 = new SavingAccount(2000);
        SavingAccount saver2 = new SavingAccount(3000);

        SavingAccount.annualInterestRate = 3 ;

        System.out.println("New balance for saver1 =" +saver1.calculateMonthlyInterest());
        System.out.println("New balance for saver2 =" +saver2.calculateMonthlyInterest());

        SavingAccount.annualInterestRate = 4 ;
        System.out.println("New balance for saver1 =" +saver1.calculateMonthlyInterest());
        System.out.println("New balance for saver2 =" +saver2.calculateMonthlyInterest());
    }
}
