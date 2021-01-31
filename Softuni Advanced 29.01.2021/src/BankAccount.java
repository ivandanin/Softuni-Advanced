public class BankAccount {
    private int id;
    private double balance;
    private static double interest = 0.02;
    private static int counter = 1;

    BankAccount() {
        this.id = counter++;
    }

    public static void setInterest(double interest) {
        BankAccount.interest = interest;
    }

    public void deposit(double amount) {
        this.balance += amount;
    }

    public double getInterest(int years) {
        return BankAccount.interest * years * this.balance;
    }

    public int getId() {
        return id;
    }
}
