package absint.demo;

public abstract class Shape {
	protected String shape;
	protected String color;
	
	// current coordinates
	protected int x;
	protected int y;
	
	public Shape(String shape, int a, int b) {
		this.shape = shape;
		this.x = a;
		this.y = b;
	}
	
	public Shape(String shape, int a) {
		this.shape = shape;
		this.x = a;
		this.y = a;
	}
	
	/**
	 * Does know What the behavior should be, left up to subclasses How to implement
	 */
	public abstract void draw();
	public abstract void resize();
    public abstract void calculateArea();
    
    /**
     * Common methods among subclasses: does know about What the behavior be, plus to How to implement
     * @param toX
     * @param toY
     */
	public void moveTo(int toX, int toY) {
		// moves the shape to certain other location
		this.x = toX;
		this.y = toY;
		System.out.println("moveTo:" + " X:" + this.x + " Y:" + this.y);
	}
}
