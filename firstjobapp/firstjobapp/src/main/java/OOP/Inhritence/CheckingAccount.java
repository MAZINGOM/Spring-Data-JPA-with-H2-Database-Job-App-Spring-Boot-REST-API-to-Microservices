package OOP.Inhritence;

public class CheckingAccount extends Account {
    private boolean hasChecks;
    public CheckingAccount(String accountNumber, double balance,boolean hasChecks) {
        super(accountNumber, balance);
        this.hasChecks = hasChecks;
    }

    @Override
    public void displayAccountDetails() {
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Balance: $" + balance);
        System.out.println("Has Checks: " + hasChecks);
    }
}
