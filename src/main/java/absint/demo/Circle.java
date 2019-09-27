package absint.demo;

public class Circle extends Shape {
	public Circle(String shape, int radius) {
		super(shape, radius);
	}
	
	@Override
	public void resize() {
		System.out.println("resize");
	}
	
	@Override
	public void draw() {
		System.out.println("draw: " + shape + "of color: " + color);
	}
	
	@Override
	public void calculateArea() {
		int area = (int)Math.PI * x * x;
		System.out.println("calculateArea of the " + shape + " is: " + area);
	}
}
