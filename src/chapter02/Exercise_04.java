package chapter02;

import java.util.Scanner;

/**
 * Convert pounds into kilograms 
 * Write a program that converts pounds into kilograms.
 * The program prompts the user to enter a number in pounds, converts it to kilograms, and displays the result. 
 * One pound is 0.454 kilograms.
 */
public class Exercise_04 
{
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		System.out.print("Enter a number in pounds: ");
		double pound = input.nextDouble();
		
		double kilogram = pound * 0.454;
		
		System.out.println(pound + " pound = " + kilogram + " kilogram");
		
		
		input.close();
	}

}
