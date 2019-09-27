package exceptionsDemo.exceptionlabs;

/**
 * Account class with balance
 * 
 *
 */
public class Account {
	private double balance;
	
	public void deposit(double amount) {
		System.out.println("Deposit: " + amount);
		this.balance = this.balance + amount;
		System.out.println("New Balance: " + this.balance);
		System.out.println("-----");
	}
	
	public void withdraw(double requestedAmount) throws NotEnoughBalanceException {
		System.out.println("Withdraw: " + requestedAmount);
		double tempBalance = this.balance - requestedAmount;
		if (tempBalance < 0) {
			double missingAmount = tempBalance;
			throw new NotEnoughBalanceException("Not enough balance in your account", this.balance, requestedAmount);
		} else {
			this.balance = tempBalance;
		}
		
		System.out.println("New Balance: " + this.balance);
		System.out.println("-----");
	}
	

}
