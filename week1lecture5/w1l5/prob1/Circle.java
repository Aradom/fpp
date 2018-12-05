package w1l5.prob1;

public class Circle extends Shape{
	double radius;

	public Circle(String color, double radius) {
		super(color);
		this.radius = radius;
	}
	
	public double calculateArea() {
		return Math.PI * (radius*radius);
	}
	
	public double calculatePerimeter() {
		return 2 * Math.PI * radius;
	}
	

}
