package chapter03;

import java.util.Scanner;

/*
 * (Sort three integers) Write a program that prompts the user to enter three integers
 *  and display the integers in non-decreasing order.
 */


public class Exercise_08 
{
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		System.out.print("Enter amount of your numbers: ");
		int length = input.nextInt();
		
		int[] a = new int[length];
		
		System.out.print("Enter the numbers for sorting: ");
		for(int i = 0; i < a.length; i++)
			a[i] = input.nextInt();
		
		sortNumbers(a);
		
		input.close();
	}
	
	public static void sortNumbers(int... a)
	{
		for(int x = 0; x < a.length-1; x++)
		{
			for(int i = x+1; i < a.length; i++)
			{
				if (a[x] > a[i])
				{
					int temp = a[x];
					a[x] = a[i];
					a[i] = temp;
				}
			}
		}
		
		for(int i = 0; i < a.length; i++)
		{
			System.out.print(a[i] + " ");
		}
		
	}
	
	public static void sort5(int num1 , int num2 , int num3 , int num4 , int num5)
	{
		if (num1 > num2)
		{
			int temp = num1;
			num1 = num2;
			num2 = temp;
		}
		
		if (num1 > num3)
		{
			int temp = num1;
			num1 = num3;
			num3 = temp;
		}
		
		if (num1 > num4)
		{
			int temp = num1;
			num1 = num4;
			num4 = temp;
		}
		
		if (num1 > num5)
		{
			int temp = num1;
			num1 = num5;
			num5 = temp;
		}
		
		if (num2 > num3)
		{
			int temp = num2;
			num2 = num3;
			num3 = temp;
		}
		
		if (num2 > num4)
		{
			int temp = num2;
			num2 = num4;
			num4 = temp;
		}
		
		if (num2 > num5)
		{
			int temp = num2;
			num2 = num5;
			num5 = temp;
		}
		
		if (num3 > num4)
		{
			int temp = num3;
			num3 = num4;
			num4 = temp;
		}
		
		if (num3 > num5)
		{
			int temp = num3;
			num3 = num5;
			num5 = temp;
		}
		
		if (num4 > num5)
		{
			int temp = num4;
			num4 = num5;
			num5 = temp;
		}
		
		System.out.println("The 5 Numbers: " + num1 + " " + num2 + " " + num3 + " " + num4 + " " + num5);
	}
	
	
	public static void sort3(int num1 , int num2 , int num3)
	{
		
		if (num1 > num2)
		{
			int temp = num1;
			num1 = num2;
			num2 = temp;
		}
		
		if (num1 > num3)
		{
			int temp = num1;
			num1 = num3;
			num3 = temp;
		}
		
		if (num2 > num3)
		{
			int temp = num2;
			num2 = num3;
			num3 = temp;
		}
		
		System.out.println("The Sort Of Your Numbers is: " + num1 + " " + num2 + " " + num3);
	}

}
