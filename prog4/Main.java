package week3.prog4;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Triangle triangle = new Triangle(10, 10);
		Circle circle = new Circle(10);
		Rectangle rectangle = new Rectangle(10, 4);

		while (true) {

//		scanner.close();
			System.out.println("Enter C for Circle\n" + "Enter R for Rectangle\n" + 
					"Enter T for Triangle" +"\nEnter Q to Quit");
			Scanner scanner = new Scanner(System.in);
			String choice = scanner.next();
			switch (choice) {
			case "C":
				System.out.printf("Area of Circle with radius %.3f is %.3f:", circle.getRadius(), circle.computeArea());
				break;
			case "T":
				System.out.printf("Area of Triangle with width %.3f, height%.3f = : %f", triangle.getWidth(),
						triangle.getLength(), triangle.computeArea());
				break;

			case "R":
				System.out.printf("Area of Rectangle with width %.3f, height%f = : %.3f", rectangle.getWidth(),
						rectangle.getLength(), rectangle.computeArea());
				System.out.println();
				break;
			case "Q":
				System.out.println("Exiting");
				scanner.close();
				break;
			default:
				break;
			}
		}

	}

}
