package OOP.polymorphysm;

public class FixedDepositAccount extends Account{

    @Override
    public double calculateInterest(double balance) {
        return balance * 0.065; // 6.5% interest
    }
}
