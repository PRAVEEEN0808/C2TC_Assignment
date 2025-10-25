package assignments3;
	
	class Bank {
	    private static int totalAccounts = 0; // shared among all instances

	    public static void incrementAccounts() {
	        totalAccounts++;
	    }

	    public static int getTotalAccounts() {
	        return totalAccounts;
	    }
	}
	abstract class Account {
	    protected String accountHolderName;
	    protected double balance;

	    public Account(String accountHolderName, double initialBalance) {
	        this.accountHolderName = accountHolderName;
	        this.balance = initialBalance;
	        Bank.incrementAccounts(); 
	    }

	    public abstract void deposit(double amount);
	    public abstract void withdraw(double amount);
	    public abstract double getBalance();

	    
	    public void displayAccountDetails() {
	        System.out.println("Account Holder: " + accountHolderName);
	        System.out.println("Current Balance: ₹" + balance);
	    }
	}

	class SavingsAccount extends Account {
	    private static final double INTEREST_RATE = 0.03; 

	    public SavingsAccount(String name, double initialBalance) {
	        super(name, initialBalance);
	    }

	    @Override
	    public void deposit(double amount) {
	        balance += amount + (amount * INTEREST_RATE);
	        System.out.println("Deposited ₹" + amount + " with interest. New balance: ₹" + balance);
	    }

	    @Override
	    public void withdraw(double amount) {
	        if (amount <= balance) {
	            balance -= amount;
	            System.out.println("Withdrawn ₹" + amount + ". New balance: ₹" + balance);
	        } else {
	            System.out.println("Insufficient balance in Savings Account!");
	        }
	    }

	    @Override
	    public double getBalance() {
	        return balance;
	    }
	}

	class CheckingAccount extends Account {
	    private static final double OVERDRAFT_LIMIT = 5000;

	    public CheckingAccount(String name, double initialBalance) {
	        super(name, initialBalance);
	    }

	    @Override
	    public void deposit(double amount) {
	        balance += amount;
	        System.out.println("Deposited ₹" + amount + " in Checking Account. New balance: ₹" + balance);
	    }

	    @Override
	    public void withdraw(double amount) {
	        if (amount <= balance + OVERDRAFT_LIMIT) {
	            balance -= amount;
	            System.out.println("Withdrawn ₹" + amount + " (Overdraft allowed). New balance: ₹" + balance);
	        } else {
	            System.out.println("Withdrawal exceeds overdraft limit!");
	        }
	    }

	    @Override
	    public double getBalance() {
	        return balance;
	    }
	}


	final class Transaction {
	    private final double transactionFee = 10.0; 

	    public final void performTransaction(Account account, String type, double amount) {
	        System.out.println("\n--- Transaction Start ---");
	        System.out.println("Transaction Type: " + type);
	        if (type.equalsIgnoreCase("deposit")) {
	            account.deposit(amount);
	        } else if (type.equalsIgnoreCase("withdraw")) {
	            account.withdraw(amount);
	        } else {
	            System.out.println("Invalid transaction type!");
	            return;
	        }

	       
	        account.withdraw(transactionFee);
	        System.out.println("Transaction fee of ₹" + transactionFee + " applied.");
	        System.out.println("--- Transaction Completed ---\n");
	    }
	}

	
	public class BankTransactionSystem {
	    public static void main(String[] args) {
	        
	        SavingsAccount s1 = new SavingsAccount("Praveen", 1000);
	        CheckingAccount c1 = new CheckingAccount("Ravi", 2000);

	        
	        Transaction t = new Transaction();
	        t.performTransaction(s1, "deposit", 500);
	        t.performTransaction(c1, "withdraw", 1500);

	        
	        s1.displayAccountDetails();
	        c1.displayAccountDetails();

	        System.out.println("\nTotal bank accounts created: " + Bank.getTotalAccounts());
	    }
	}


