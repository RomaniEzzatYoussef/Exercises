package chapter04;

import java.util.Scanner;

/**
 *
 * 16/11/2017   11:16:10 PM
 *  
 * @author roman
 *
 *
 * OrderTwoCities
 *
 */
public class OrderTwoCities {

	/**
	 * @param args
	 */
	public static void main(String[] args) 
	{
		Scanner input = new Scanner(System.in);
		System.out.print("Enter Two Cities: ");
		String city1 = input.nextLine();
		String city2 = input.nextLine();
		
		if (city1.compareTo(city2) < 0)
			System.out.println("The cities in alphabetical order are " + city1 + " " + city2);
		else
			System.out.println("The cities in alphabetical order are " + city2 + " " + city1);
		
		input.close();
	}

}
