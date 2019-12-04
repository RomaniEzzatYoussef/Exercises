package chapter02;

import java.util.Scanner;

/**
 * Geometry: area of a triangle
 * Write a program that prompts the user to enter three points 
 * (x1, y1), (x2, y2), (x3, y3) of a triangle and displays its area.
 * s = (side1 + side2 + side3)/2;
 * area = square root of (s(s - side1)(s - side2)(s - side3))
 */

public class Exercise_19 
{
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		System.out.print("Enter the three points: ");
		double x1 = input.nextDouble();
		double y1 = input.nextDouble();
		double x2 = input.nextDouble();
		double y2 = input.nextDouble();
		double x3 = input.nextDouble();
		double y3 = input.nextDouble();
		
		double side1 = Math.pow(Math.pow((x2 - x1) , 2) + Math.pow((y2 - y1) , 2) , 0.5);
		double side2 = Math.pow(Math.pow((x3 - x2) , 2) + Math.pow((y3 - y2) , 2) , 0.5);
		double side3 = Math.pow(Math.pow((x1 - x3) , 2) + Math.pow((y1 - y3) , 2) , 0.5);
		
		double s = (side1 + side2 + side3) / 2.0;
		
		double area = Math.pow((s * (s - side1) * (s - side2) * (s - side3)) , 0.5);
		
		System.out.println("The area of the triangle is " + area);
		
		input.close();
	}

}
