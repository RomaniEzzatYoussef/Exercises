package chapter04;

import java.util.Scanner;

/**
 * Geometry: area of a hexagon
 * Write a program that prompts the user to enter the side of a hexagon and displays its area.
 *
 * 18/11/2017   12:19:58 PM
 *  
 * @author roman
 *
 *
 * Exercise_04
 *
 */
public class Exercise_04 {

	/**
	 * @param args
	 */
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		System.out.print("Enter the side of the hexagon: ");
		double side = input.nextDouble();
		double area = (6 * Math.pow(side, 2)) / (4 * Math.tan(Math.PI / 6));
		
		System.out.printf("Area of the Hexagon: %.2f", area);
		
		input.close();
	}

}
