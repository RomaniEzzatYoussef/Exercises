package chapter05;

import java.util.Scanner;

/**
 *
 * 19/11/2017   9:51:48 AM
 *  
 * @author roman
 *
 *
 * SentinelValue
 *
 */
public class SentinelValue {

	/**
	 * @param args
	 */
	public static void main(String[] args) 
	{
		Scanner input = new Scanner(System.in);
		System.out.print("Enter an integer (the input ends if it is 0): ");
		int data = input.nextInt();
		
		int sum = 1;
		while (data != 0)
		{
			sum *= data;
			
			System.out.print("Enter an integer (the input ends if it is 0): ");
			data = input.nextInt();
		}
		
		System.out.println("The sum is " + sum);
		
		input.close();
	}

}
