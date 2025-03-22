package OOP.polymorphysm;

public class CurrentAccount extends Account{

    @Override
    public double calculateInterest(double balance) {
        return 0; // No interest for current accounts
    }
}
