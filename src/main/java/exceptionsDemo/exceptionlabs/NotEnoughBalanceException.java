package exceptionsDemo.exceptionlabs;

/**
 * Custom exception example
 * 
 *
 */
public class NotEnoughBalanceException extends IllegalStateException {
	
	private double balance;
	private double requestedAmount;
	
    public NotEnoughBalanceException(String msg, double balance, double requestedAmount) {
		super(msg);
		this.balance = balance;
		this.requestedAmount = requestedAmount;
	}
    
    public double getRequestedAmount() {
    	return this.requestedAmount;
    }
    
    public double getBalance() {
    	return this.balance;
    }
    
    public double getMissingAmount(){
    	if (balance - requestedAmount < 0)
    	    return Math.abs(balance - requestedAmount);
    	return 0;
    }
}
