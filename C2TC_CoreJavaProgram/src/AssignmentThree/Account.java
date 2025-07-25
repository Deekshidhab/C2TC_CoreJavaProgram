package AssignmentThree;

public abstract class Account {
	
    protected String accountNumber;
    protected double balance;

    public Account(String accountNumber, double initialBalance) {
        this.accountNumber = accountNumber;
        this.balance = initialBalance;
        
        Bank.incrementAccountCount();
    }

    public abstract void deposit(double amount);
    public abstract void withdraw(double amount);
    public abstract double getBalance();

    public void displayAccountDetails() {
    	
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Current Balance: " + balance);
    }


}