package absint.demo;

public class Launch_TestShapes {

	public static void main(String[] args) {
		Circle c = new Circle("Circle", 5);
		c.calculateArea();
		c.resize();
		System.out.println("---------");
		
		Rectangle r = new Rectangle("Rectangle", 5, 10);
		r.calculateArea();
		r.moveTo(5, 5);
		System.out.println("---------");
		
		Shape t = new Triangle("Triangle", 5, 10);
		t.calculateArea();
		t.moveTo(5, 7);
		System.out.println("---------");

	}

}
