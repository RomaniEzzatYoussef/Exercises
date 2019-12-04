package chapter02;

import java.util.Scanner;

/**
 * Geometry: area of a hexagon 
 * Write a program that prompts the user to enter the side of a hexagon and displays its area.
 * Area of Hexagon = (3(square root(3))/2) * side^2
 */
public class Exercise_16 
{
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		System.out.print("Enter the side: ");
		double side = input.nextDouble();
		
		double areaHexagon = (3 * Math.pow(3 , 0.5) / 2) * Math.pow(side ,  2);
		
		System.out.println("The area of the hexagon is: " + areaHexagon);
		
		input.close();
	}

}
