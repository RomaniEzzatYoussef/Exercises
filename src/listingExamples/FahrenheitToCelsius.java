package listingExamples;

import java.util.Scanner;

/**
 *
 * 10/03/2019   8:17:25 AM
 *  
 * @author Romani Ezzat
 *
 *
 * FahrenheitToCelsius
 *
 */
public class FahrenheitToCelsius 
{

	/**
	 * @param args
	 */
	public static void main(String[] args) 
	{
		Scanner input = new Scanner(System.in);
		System.out.print("Enter a degree in Fahrenheit: ");
		double fahrenheit = input.nextDouble();
		
		double celsius = (5.0 / 9) * (fahrenheit - 32);
		System.out.println("Fahrenheit " + fahrenheit + " is " + celsius + " in Celsius");
		
		input.close();
	}

}
