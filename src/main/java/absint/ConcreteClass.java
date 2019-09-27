package absint;

public class ConcreteClass extends AnotherClass implements AnInterface, OtherInterface {
    private int field;
    
    public ConcreteClass(int field) {
		this.field = field;
	}
    
    public void displayInfo() {
    	System.out.println(field);
    }
}
