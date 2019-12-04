package chapter02;

import java.util.Scanner;


public class Exercise_01 {
	
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		System.out.print("Enter celcuis degree: ");
		double celsuis = input.nextDouble();
		
		double fahrenheit = (9.0 / 5) * celsuis + 32;
		
		System.out.println("Fahrenheit: " + fahrenheit);
		
		
		
		
		input.close();
	}
}
