package colections.demos.sort;

public class Fruit implements Comparable<Fruit> {

	private String color; // reddish, yellow, brown, green
	private String odor; // aromatic, odorless
	private String texture; // hard, fibrous
	private String shape; // round, oval
	private String taste; // bitter, sweet, sour, tart
	private int ranking;
	private double size;

	public Fruit(String color, String odor, String texture, String shape, String taste, int ranking, double size) {
		this.color = color;
		this.odor = odor;
		this.texture = texture;
		this.shape = shape;
		this.taste = taste;
		this.ranking = ranking;
		this.size = size;
	}

	@Override
	public int compareTo(Fruit fruit) {
		return (this.ranking - fruit.getRanking()); // compare price wise with the object being compared
	}

	@Override
	public String toString() {
		StringBuilder strBuild = new StringBuilder();
		strBuild.append("\ncolor: " + color);
		strBuild.append("\nodor: " + odor);
		strBuild.append("\ntexture: " + texture);
		strBuild.append("\nshape: " + shape);
		strBuild.append("\ntaste: " + taste);
		strBuild.append("\nranking: " + ranking);
		strBuild.append("\nsize: " + size);
		strBuild.append("\n--------");
		return strBuild.toString();
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public String getOdor() {
		return odor;
	}

	public void setOdor(String odor) {
		this.odor = odor;
	}

	public String getTexture() {
		return texture;
	}

	public void setTexture(String texture) {
		this.texture = texture;
	}

	public String getShape() {
		return shape;
	}

	public void setShape(String shape) {
		this.shape = shape;
	}

	public String getTaste() {
		return taste;
	}

	public void setTaste(String taste) {
		this.taste = taste;
	}

	public double getPrice() {
		return ranking;
	}

	public double getSize() {
		return size;
	}

	public void setSize(double size) {
		this.size = size;
	}

	public int getRanking() {
		return ranking;
	}

	public void setRanking(int ranking) {
		this.ranking = ranking;
	}

}
