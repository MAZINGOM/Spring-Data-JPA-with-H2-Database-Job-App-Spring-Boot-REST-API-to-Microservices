package OOP.polymorphysm;

public class SavingsAccount extends Account{
    @Override
    public double calculateInterest(double balance) {
        return balance * 0.04; // 4% interest
    }
}
