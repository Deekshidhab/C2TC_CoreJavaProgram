package assignment6;

public class InsufficientFundsExceptio {
	// Custom Exception for Insufficient Funds
	class InsufficientFundsException extends Exception {
	    public InsufficientFundsException(String message) {
	        super(message);
	    }
	}

	// Custom Exception for Invalid Amount
	class InvalidAmountException extends Exception {
	    public InvalidAmountException(String message) {
	        super(message);
	    }
	}

	// BankAccount class simulates basic banking operations
	class BankAccount {
	    private int accountNumber;
	    private double balance;

	    // Parameterized constructor
	    public BankAccount(int accountNumber, double initialBalance) {
	        this.accountNumber = accountNumber;
	        this.balance = initialBalance;
	    }

	    // Deposit method
	    public void deposit(double amount) throws InvalidAmountException {
	        if (amount <= 0) {
	            throw new InvalidAmountException("Deposit amount must be positive.");
	        }
	        balance += amount;
	        System.out.println("Deposited: ₹" + amount);
	    }

	    // Withdrawal method
	    public void withdraw(double amount) throws InsufficientFundsException, InvalidAmountException {
	        if (amount <= 0) {
	            throw new InvalidAmountException("Withdrawal amount must be positive.");
	        }
	        if (amount > balance) {
	            throw new InsufficientFundsException("Insufficient balance for withdrawal.");
	        }
	        balance -= amount;
	        System.out.println("Withdrawn: ₹" + amount);
	    }

	    // Method to display current balance
	    public void displayBalance() {
	        System.out.println("Account Number: " + accountNumber + " | Current Balance: ₹" + balance);
	    }
	}

	// Main class to demonstrate the banking system
	public class BankingSystemDemo {
	    public static void main(String[] args) {
	        BankAccount account = new BankAccount(1001, 5000.0); // Initial account setup

	        try {
	            account.deposit(1500.0);
	            account.withdraw(2000.0);
	            account.withdraw(6000.0); // This will trigger InsufficientFundsException
	        } catch (InvalidAmountException | InsufficientFundsException e) {
	            System.out.println("Exception occurred: " + e.getMessage());
	        } finally {
	            account.displayBalance(); // Always shows the balance
	        }

	        try {
	            account.deposit(-300.0); // This will trigger InvalidAmountException
	        } catch (InvalidAmountException e) {
	            System.out.println("Exception occurred: " + e.getMessage());
	        } finally {
	            account.displayBalance(); // Always shows the balance
	        }
	    }
	}

}
