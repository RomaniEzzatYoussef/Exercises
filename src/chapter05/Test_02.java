package chapter05;

import java.util.Scanner;

/**
 *
 * 19/11/2017   6:01:04 PM
 *  
 * @author roman
 *
 *
 * Test_02
 *
 */
public class Test_02 {

	/**
	 * @param args
	 */
	public static void main(String[] args) 
	{
		Scanner input = new Scanner(System.in);
		int sum = 0;
		int data;
		
		do
		{
			System.out.print("Enter an integer (the input ends if it is 0): ");
			data = input.nextInt();
			
			sum += data;
			
		} while (data != 0);
		
		System.out.println("Sum is " + sum);
		
		input.close();
	}

}
