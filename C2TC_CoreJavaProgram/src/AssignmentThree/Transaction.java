package AssignmentThree;

public class Transaction {
	
    public static final double transactionFee = 2.5;
    public final void performTransaction(Account account, String type, double amount) {
        System.out.println("Transaction Fee: " + transactionFee);

        switch (type.toLowerCase()) {
            case "deposit":
                account.deposit(amount);
                break;
            case "withdraw":
                account.withdraw(amount + transactionFee);
                break;
            default:
                System.out.println("Invalid transaction type.");
                return;
        }

        System.out.println("Transaction completed. Updated balance: " + account.getBalance());
    }
}