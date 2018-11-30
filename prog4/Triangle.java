package week3.prog4;

public final class Triangle {

	private double width, length;

	public Triangle(double width, double length) {
		super();
		this.width = width;
		this.length = length;
	}

	public double computeArea() {
		return 0.5 * (width * length);
	}

	public double getWidth() {
		return width;
	}

	public double getLength() {
		return length;
	}

}
