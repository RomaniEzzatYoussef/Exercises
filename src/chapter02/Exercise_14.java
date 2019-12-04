package chapter02;

import java.util.Scanner;

/**
 * Health application: computing BMI 
 * Body Mass Index (BMI) is a measure of health on weight. 
 * It can be calculated by taking your weight in kilograms and dividing by the square of your height in meters. 
 * Write a program that prompts the user to enter a weight in pounds and height in inches and displays the BMI. 
 * Note that one pound is 0.45359237 kilograms and one inch is 0.0254 meters.
 * BMI = kg / (m * m);
 */
public class Exercise_14 
{
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		System.out.print("Enter your weight in pounds: ");
		double weight = (input.nextDouble()) * 0.45359237;
		
		System.out.print("Enter your height in inches: ");
		double height = (input.nextDouble()) * 0.0254; 
		
		double bmi = weight / (height * height);
		//int bmi = (int) (weight / (height * height));
		
		System.out.println("Your BMI is " + bmi);
		
		input.close();
	}

}
