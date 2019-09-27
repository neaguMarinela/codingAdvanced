package exceptionsDemo.exceptiondemos;

/**
 * TestCustomVotingAgeException
 * 
 * @see InvalidVotingAgeException
 * 
 *
 */
public class TestCustomVotingAgeException {
	
	static void validate(int age) throws InvalidVotingAgeException {
        if (age < 18)  
		    throw new InvalidVotingAgeException("Age not valid");  
		 else  
		    System.out.println("Welcome to vote");  
    }  
	
    public static void main(String args[]) {
        try {
            validate(13);  
        } 
        catch (InvalidVotingAgeException e) {
        	System.out.println("Specific exception occured: " + e);
        	e.printStackTrace();
		}
        catch(Exception m) {
	        System.out.println("Generic exception occured: " + m);
	        m.printStackTrace();
        }  
  
        System.out.println("Rest of the code...");
	}
}