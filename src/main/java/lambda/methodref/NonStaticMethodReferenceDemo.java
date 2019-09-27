package lambda.methodref;

interface MethodReferenceNS {
	void helloMethodReference();
}

public class NonStaticMethodReferenceDemo {
	void helloMethodReference() {
		System.out.println("From helloMethodReference!");

	}

	public static void main(String args[]) {
		NonStaticMethodReferenceDemo obj = new NonStaticMethodReferenceDemo();
		MethodReferenceNS methodReferenceNS = obj::helloMethodReference;
		methodReferenceNS.helloMethodReference();
	}
}
