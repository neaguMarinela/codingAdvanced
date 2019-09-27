package anonymusInnerClasses;

interface Message {
    abstract String greetWithMessage();
}

public class AnonymousInnerClassAsArgument {
	
	// method which accepts the object of interface Message
	public void displayMessage(Message m) {
	    System.out.println(m.greetWithMessage() +	" This is an example of anonymous inner class as the method argument");  
	}
	
	public static void main(String args[]) {
		
		// Instantiate the class
		AnonymousInnerClassAsArgument obj = new AnonymousInnerClassAsArgument();
		
		// Pass the anonymous inner class instance as an argument
		obj.displayMessage(new Message() {
			
			@Override
			public String greetWithMessage() {
			    return "Hey there!";
			}
		
		});
	}
}
