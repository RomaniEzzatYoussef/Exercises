package chapter06;

import java.util.Scanner;

/**
 *
 * 30/11/2017   11:37:44 AM
 *  
 * @author roman
 *
 *
 * Test_01
 *
 */
public class Test_01 {

	/**
	 * @param args
	 */
	public static void main(String[] args) 
	{
		Scanner input = new Scanner(System.in);
		System.out.print("Enter your string and times: ");
		String message = input.next();
		int times = input.nextInt();
		
		nPrintln(message, times);
		
		System.out.print("Enter your score: ");
		double score = input.nextDouble();
		
		testReturn(score);
		
		System.out.println("Your Grade is: " + getGrade(score));
		
		System.out.print("Your Grade is: ");
		printGrade(score);
		
		input.close();
		
		System.out.println(max(5, 5));
		System.out.println(sign(5));
		System.out.println(sum(1 , 20));
	}
	
	public static int sum(int n1 , int n2)
	{
		int result = 0;
		
		for (int i = n1; i <= n2; i++)
		{
			result += i;
		}
		
		return result;
	}
	
	public static int max(int num1 , int num2)
	{
		return (num1 > num2) ? num1 : num2;
	}
	
	public static int sign(int n)
	{
		if (n > 0)
			return 1;
		else if (n == 0)
			return 0;
		return -1;
	}
	
	public static void printGrade(double score)
	{
		if (score >= 90.0)
			System.out.println("A");
		else if (score >= 80.0)
			System.out.println("B");
		else if (score >= 70.0)
			System.out.println("C");
		else if (score >= 60.0)
			System.out.println("D");
		else 
			System.out.println("F");
	}
	
	public static String getGrade(double score)
	{
		if (score >= 90.0)
			return "A";
		else if (score >= 80.0)
			return "B";
		else if (score >= 70.0)
			return "C";
		else if (score >= 60.0)
			return "D";
		else 
			return "F";
	}
	
	public static void testReturn(double score)
	{
		if (score < 0 || score > 100) 
		{
			System.out.println("Invalid score");
			return;
		}
		
		if (score >= 90.0)
		{
			System.out.println("You have a good marks.");
			return;
		}
		else if (score >= 80.0)
			System.out.println("Your Grade is B");
		else if (score >= 70.0)
			System.out.println("Your Grade is C");
		else if (score >= 60.0)
			System.out.println("Your Grade is D");
		else 
			System.out.println("Your Grade is F");
		
		System.out.println("you should study hard to get full marks.");
	}
	
	public static void nPrintln(String message , int times)
	{
		for (int i = 0; i < times; i++)
			System.out.println(message);
	}
	

}
