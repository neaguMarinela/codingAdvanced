package absint.demo;

public class Rectangle extends Shape {
	
	public Rectangle(String shape, int length, int breadth) {
	    super(shape, length, breadth);
	}
	
	@Override
	public void draw() {
		System.out.println("Drawing: " + shape + "of color: " + color);
	}
	
	@Override
	public void resize() {
		System.out.println("resize");
	}
	
	@Override
	public void calculateArea() {
		int area =  x * y;
		System.out.println("calculateArea of the " + shape + " is: " + area);
	}
}
