package AssignmentThree;

public class CheckingAccount extends Account{
	
    public CheckingAccount(String accountNumber, double initialBalance) {
        super(accountNumber, initialBalance);
    }

    @Override
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposited " + amount + " into Checking Account.");
        }
    }
    
    @Override
    public void withdraw(double amount) {
        if (amount <= balance) {
            balance -= amount;
            System.out.println("Withdrew " + amount + " from Checking Account.");
        } else {
            System.out.println("Insufficient funds in Checking Account.");
        }
    }

    @Override
    public double getBalance() {
        return balance;
    }
}