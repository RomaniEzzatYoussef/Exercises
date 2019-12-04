package chapter02;

import java.util.Scanner;

/**
 * Science: calculating energy 
 * Write a program that calculates the energy needed to heat water from an initial temperature to a final temperature. 
 * Your program should prompt the user to enter the amount of water in kilograms and the initial
 * and final temperatures of the water.
 * The formula to compute the energy is 
 * Q = M * (finalTemperature – initialTemperature) * 4184 
 * where M is the weight of water in kilograms, temperatures are in degrees Celsius, and energy Q is measured in joules.
 */
public class Exercise_10 
{
	public static void main(String[] args)
	{
		Scanner input = new Scanner (System.in);
		System.out.print("Enter the weight of water in kg , intial and the final temperature: ");
		double M = input.nextDouble();
		double intialTemperature = input.nextDouble();
		double finalTemperature = input.nextDouble();
		
		double Q = M * (finalTemperature - intialTemperature) * 4184;
		
		System.out.println("The energy needed is: " + Q);
		
		
		input.close();
	}

}
