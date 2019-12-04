package chapter06;

import java.util.Scanner;

/**
 *
 * 01/12/2017   7:28:16 AM
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
		System.out.print("Enter number1 and number2: ");
		int n1 = input.nextInt();
		int n2 = input.nextInt();
		
		System.out.println("Before invoking the swap method, number1 is " + n1 + " and number2 is " + n2);
		swap(n1, n2);
		System.out.println("After invoking the swap method, number1 is " + n1 + " and number2 is " + n2);
		
		input.close();
		
		int n = 1;
		System.out.println("\nBefore the call n is " + n);
		increment(n);
		System.out.println("After the call n is " + n);
	}
	
	public static void increment(int n)
	{
		n++;
		System.out.println("\t n Inside the method is " + n);
	}
	
	public static void swap(int n1 , int n2)
	{
		System.out.println("\tInside the swap method");
		System.out.println("\t  Before swapping number1 is "+ n1 + " and number2 is " + n2);
		
		int temp = n1;
		n1 = n2;
		n2 = temp;
		
		System.out.println("\t  After swapping n1 is "+ n1 + " and n2 is " + n2);
		
	}

}
