package chapter02;

import java.util.Scanner;

/**
 * Cost of driving 
 * Write a program that prompts the user to enter the distance to drive, 
 * the fuel efficiency of the car in miles per gallon, and the price per gallon, and displays the cost of the trip.
 */

public class Exercise_23 
{
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		System.out.print("Enter the distance: ");
		double distance = input.nextDouble();
		
		System.out.print("Enter the miles per gallon: ");
		double milesPerGallon = input.nextDouble();
		
		System.out.print("Enter the price per gallon: ");
		double pricePerGallon = input.nextDouble();
		
		double cost = (distance / milesPerGallon) * pricePerGallon;
		
		
		System.out.println("The cost will be " + cost);
		
		
		input.close();
	}

}
