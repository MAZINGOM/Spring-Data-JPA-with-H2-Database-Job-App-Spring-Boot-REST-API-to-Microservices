package OOP.Inhritence;

public class Main {
    public static void main(String[] args) {
        SavingsAccount savingsAccount = new SavingsAccount("12",10,10);
        savingsAccount.applyInterest();
        //System.out.println(savingsAccount);

        Account account = new Account("12",10) {
            @Override
            public void displayAccountDetails() {
                System.out.println();
            }
        };

        account.displayAccountDetails();
    }
}
