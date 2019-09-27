package exceptionsDemo.exceptionlabs;

/**
 * TestTest
 * 
 *
 */
public class NotEnoughBalanceExceptionTest {
	public static void main(String args[]) {
		try{
		   Account myAccount = new Account();
		   myAccount.deposit(800);
		   myAccount.withdraw(300);
		   myAccount.withdraw(700);
		}
		catch(NotEnoughBalanceException e){
		   System.out.println(e.getMessage());
		   System.out.println("You are missing: " + e.getMissingAmount() + "$");
		}
	   }
}
