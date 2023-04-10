public class SavingAccount {
    public static double annualInterestRate ;
    private  double savingbalance ;

    public SavingAccount(double x)
    {
        savingbalance = x ;
    }

    public double calculateMonthlyInterest(){
        savingbalance = (savingbalance * annualInterestRate)/12 ;
        return savingbalance ;
    }

    public static void modifyInterestRate(double annualInterestRate) {
        SavingAccount.annualInterestRate = annualInterestRate;
    }
}
