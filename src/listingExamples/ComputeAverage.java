package listingExamples;

import java.util.Scanner;

/**
 *
 * 06/03/2019   9:10:20 PM
 *  
 * @author Romani Ezzat
 *
 *
 * ComputeAverage
 *
 */
public class ComputeAverage 
{

	/**
	 * @param args
	 */
	public static void main(String[] args) 
	{
		Scanner input = new Scanner(System.in);
		System.out.print("Enter three numbers: ");
		double num1 = input.nextDouble();
		double num2 = input.nextDouble();
		double num3 = input.nextDouble();
		
		double average = (num1 + num2 + num3) / 3;
		
		System.out.println("The average of " + num1 + " " + num2 + " " + num3 + " is " + average);
		
		input.close();
		
		
		int i , j , k;  // Declare varaiable
		i = j = k = 1;  // Assign Values 
		
		System.out.println("i: " + i + " , j: " + j + " , k: " + k);
		
		
		int r = 8 , w = 5 , q = 2;
		System.out.println("r: " + r + " , w: " + w + " , q: " + q);
		
		
		
	}

}
