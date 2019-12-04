package mumExercises;

import java.util.Scanner;

/**
 *
 * 07/08/2019   6:59:04 PM
 *  
 * @author Romani Ezzat
 *
 *
 * Q1
 *
 */
public class Q1 
{

	/**
	 * @param args
	 */
	public static void main(String[] args) 
	{
		Scanner input = new Scanner(System.in);
		
		
		System.out.println("Question 1");
		
		int[] a1 = {1 , 2 , 3 , 4 , 5};
		System.out.println(a1(a1));
		
		int[] a2 = {3 , 2 , 1 , 4 , 5};
		System.out.println(a1(a2));
		
		int[] a3 = {1 , 2 , 3 , 4 , 1};
		System.out.println(a1(a3));
		
		int[] a4 = {1 , 2 , 3 , 4};
		System.out.println(a1(a4));
		
		int[] a5 = {};
		System.out.println(a1(a5));
		
		int[] a6 = {10};
		System.out.println(a1(a6));
		
		
		System.out.println("Question 2");
		
		int[] b1 = {1};
		System.out.println(a2(b1));
		
		int[] b2 = {1 , 2};
		System.out.println(a2(b2));
		
		int[] b3 = {1 , 2 , 3};
		System.out.println(a2(b3));
		
		int[] b4 = {1 , 2 , 3 , 4};
		System.out.println(a2(b4));
		
		int[] b5 = {3 , 3 , 4 , 4};
		System.out.println(a2(b5));
		
		int[] b6 = {3 , 2 , 3 , 4};
		System.out.println(a2(b6));
		
		int[] b7 = {4 , 1 , 2 , 3};
		System.out.println(a2(b7));
		
		int[] b8 = {1 , 1};
		System.out.println(a2(b8));
		
		int[] b9 = {};
		System.out.println(a2(b9));
		
		
		
		
		input.close();
	}
	
	public static int a1(int[] a)
	{
		if (a == null || a.length % 2 == 0)
			return 0;
		
		int midIndex = a.length / 2;
		int midItem = a[midIndex];
		
		for (int i = 0; i < a.length; i++)
		{
			if (i != midIndex && midItem >= a[i])
				return 0;
		}
		
		return 1;
	}
	
	public static int a2(int[] a)
	{
		int x = 0;
		int y = 0;
		
		
		for (int i = 0; i < a.length; i++)
		{
			if (a[i] % 2 == 0)
				x += a[i];
			else
				y += a[i];
		}
		
		return  x - y;
		
	}
	
	
	
	
	
	

}
