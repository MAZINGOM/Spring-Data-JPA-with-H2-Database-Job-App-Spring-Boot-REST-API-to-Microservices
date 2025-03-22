package OOP.polymorphysm;

public class BankDemo {
    public static void main(String[] args) {
        // Parent reference pointing to child objects
        Account savings = new SavingsAccount();
        Account fixedDeposit = new FixedDepositAccount();
        Account current = new CurrentAccount();

        double savingsBalance = 10000;
        double fixedDepositBalance = 50000;
        double currentBalance = 20000;

        System.out.println("Savings Account Interest: $" + savings.calculateInterest(savingsBalance));
        System.out.println("Fixed Deposit Interest: $" + fixedDeposit.calculateInterest(fixedDepositBalance));
        System.out.println("Current Account Interest: $" + current.calculateInterest(currentBalance));
    }
}
