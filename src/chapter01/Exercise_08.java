package chapter01;

/**
 * Area and perimeter of a circle 
 * Write a program that displays the area and perimeter
 * of a circle that has a radius of 5.5 using the following formula:
 * perimeter = 2 * radius * pi
 * area = radius * radius * pi
 */

public class Exercise_08 {

	public static void main(String[] args) {
		System.out.print("Perimeter = ");
		System.out.println(2 * 5.5 * 3.14159);
		System.out.print("Area = ");
		System.out.println(5.5 * 5.5 * 3.14159);
		
		double radius = 5.5;
		double pi = 3.14;
		double perimeter = 2 * radius * pi;
		double area = radius * radius * pi;
		
		System.out.println("Perimeter = " + perimeter);
		System.out.println("Area = " + area);
		
	}
}
