package absint;

public abstract class AbstractClass implements AnInterface {
    
	public static int STATIC_FIELD_1 = 1;
	
	public int NON_STATIC_FIELD_1 = 1;
	
	public abstract String abs_method_1();
	
	public abstract String abs_method_2();
	
	public String concrete_method_1() {
		return "";
	}
	
	public AbstractClass(int i) {
	}
	
	public AbstractClass() {
	}
}
