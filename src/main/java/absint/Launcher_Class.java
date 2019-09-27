package absint;

public class Launcher_Class {
    public static void main(String[] args) {
    	AbstractClass ac = new AbstractClass(5) {
			
			@Override
			public String abs_method_2() {
				return null;
			}
			
			@Override
			public String abs_method_1() {
				return null;
			}
		};
	}
}
