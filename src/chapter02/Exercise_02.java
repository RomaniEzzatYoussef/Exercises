package chapter02;

import java.util.Scanner;

/**
 * Compute the volume of a cylinder 
 * Write a program that reads in the radius and length of a cylinder and computes the area and volume using the following formulas: 
 * area = radius * radius * pi 
 * volume = area * length
 */
public class Exercise_02 
{
	public static void main(String[] args)
	{
		double pi = 3.14159;
		double area , radius , volume , length;
		
		Scanner input = new Scanner(System.in);
		System.out.print("Enter the radius of the cylinder: ");
		radius = input.nextDouble();
		
		System.out.print("Enter the length of the cylinder: ");
		length = input.nextDouble();
		
		area = radius * radius * pi;
		volume = area * length;
		
		System.out.println("The area of the cylinder is: " + area);
		System.out.print("The volume of the cylinder is: " + volume);
		
		input.close();
		
	}
}
