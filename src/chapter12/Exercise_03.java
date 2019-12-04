package chapter12;

import java.io.IOException;
import java.util.Random;
import java.util.Scanner;

/**
 *
 * 09/05/2019   9:29:04 PM
 *  
 * @author Romani Ezzat
 *
 *
 * Exercise_03
 *
 */
public class Exercise_03 
{

	/**
	 * @param args
	 */
	public static void main(String[] args) 
	{
		int[] a = new int[100];
		
		Random r = new Random();
		for (int i = 0; i < a.length; i++)
			a[i] = r.nextInt(a.length);
		
		System.out.print("Enter an index for array to display: ");
		
		try
		{
			Scanner input = new Scanner(System.in);
			int num = a[input.nextInt()];
			System.out.println("The number is: " +  num);
			input.close();
		}
		catch (Exception e)
		{
			if (e instanceof IOException)
				System.out.println("Input Error");
			else
				System.out.println("Out Of Bounds");
		}
		
		
	}

}
