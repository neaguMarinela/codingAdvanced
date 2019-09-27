package lambda.pfi;

import java.util.function.Consumer;

public class ConsumerDemo2 {
	public static void main(String args[]) {
		Consumer<String> consumer = message -> EmailUtility.sendEmail(message);
		consumer.accept("Your Account has been created");
	}

}

class EmailUtility {
	public static void sendEmail(String message) {
		// to
		// Cc
		// Subject
		// Message BOdy
		// sendEmail();

		System.out.println("Successfully sent an email with the message \n" + message);
	}
}
