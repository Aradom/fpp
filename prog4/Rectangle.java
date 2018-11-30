package week3.prog4;

public final class Rectangle {
	private double width, length;

	public Rectangle(double width, double length) {
		this.width = width;
		this.length = length;
	}

	public double computeArea() {
		return width * length;
	}

	public double getWidth() {
		return width;
	}



	public double getLength() {
		return length;
	}

	
}
