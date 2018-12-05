package w1l5.prob1;

public class Main {
	public static void main(String[] args) {
		Circle circle1 = new Circle("Green", 4);
		Square square1 = new Square("Red", 5);
		Square square2 = new Square("Yellow", 5);
		Rectangle rect1 = new Rectangle("Blue", 44, 2);
		Rectangle rect2 = new Rectangle("Blue", 44, 2);

		Shape[] shapes = { circle1, square1, square2, rect1, rect2 };
		printTotal(shapes);

	}

	public static void printTotal(Shape[] shapes) {
		for (Shape s : shapes) {
			System.out.println("Area of " + s.getClass().getSimpleName() + " is: " + s.calculateArea());
			System.out.println("Perimeter of " + s.getClass().getSimpleName() + " is: " + s.calculatePerimeter());
		}
	}

}


/**
Area of Circle is: 50.26548245743669
Perimeter of Circle is: 25.132741228718345
Area of Square is: 25.0
Perimeter of Square is: 20.0
Area of Square is: 25.0
Perimeter of Square is: 20.0
Area of Rectangle is: 88.0
Perimeter of Rectangle is: 92.0
Area of Rectangle is: 88.0
Perimeter of Rectangle is: 92.0


*/