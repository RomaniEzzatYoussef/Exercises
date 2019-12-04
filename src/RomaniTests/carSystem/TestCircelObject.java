package RomaniTests.carSystem;

import java.util.Scanner;

/**
 *
 * 09/05/2019   7:32:33 AM
 *  
 * @author Romani Ezzat
 *
 *
 * TestCircelObject
 *
 */
public class TestCircelObject {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		System.out.print("Enter a radius for circle: ");
		double radius = input.nextDouble();
		
		System.out.print("Enter a color for circle: ");
		String color = input.next();
		
		System.out.print("Enter true or false to fill circle: ");
		boolean filled = input.nextBoolean();
		
		Circle circle = new Circle(radius, color, filled);
		double area = circle.getArea();
		
		System.out.println("The area of the circle is: " + Math.round(area) + " " + circle .toString());
		
		
		System.out.println("\n\n");
		
		
		System.out.print("Enter a length for square: ");
		double length = input.nextDouble();
		
		System.out.print("Enter a color for square: ");
		color = input.next();
		
		System.out.print("Enter true or false to fill square: ");
		filled = input.nextBoolean();
		
		Square square = new Square(length, color, filled);
		area = square.getArea();
		
		System.out.println("The area of the square is: " + Math.round(area) + " " + square .toString());
		
		input.close();
		
		
	}

}
