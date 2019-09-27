package absint.demo;

public class Triangle extends Shape {
	
	public Triangle(String shape, int a, int b) {
		super(shape, a, b);
	}
	
	@Override
	public void draw() {
		System.out.println("Drawing: " + shape + "of color: " + color);
	}
	
	@Override
	public void resize() {
		System.out.println("Resize");
	}
	
    @Override
    public void calculateArea() {
    	double area = 0.5 * x * y;
    	System.out.println("calculateArea of the " + shape + " is: " + area);
    }
}
