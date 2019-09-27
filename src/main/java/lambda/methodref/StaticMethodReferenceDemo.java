package lambda.methodref;

interface MethodReference {
	void helloMethodReference();
}

public class StaticMethodReferenceDemo {
	static void helloMethodReference() {
		System.out.println("From helloMethodReference!");

	}

	public static void main(String args[]) {
		MethodReference methodReference = StaticMethodReferenceDemo::helloMethodReference;
		methodReference.helloMethodReference();
	}
}
