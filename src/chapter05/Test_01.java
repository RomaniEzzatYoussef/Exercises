package chapter05;

import java.util.Scanner;

/**
 *
 * 18/11/2017   11:59:16 PM
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
		int i;
		for (i = 0; i < 100; i++) {
		System.out.println("Welcome to Java!");
		}
		
		
		int x = 80000000;
		while (x > 0)
			x++;
		System.out.println("x is " + x);
		
		
		
		Scanner input = new Scanner(System.in);
		System.out.print("Enter a number: ");
		int number = input.nextInt();
		int max = number;
		while (number != 0) 
		{
			number = input.nextInt();
			if (number > max)
				max = number;
		}
		System.out.println("max is " + max);
		System.out.println("number " + number);
		input.close();
		
		int t = 1;
		while (t < 10)
			if((t++) % 2 == 0)
			System.out.println(t);
		
		while (t < 10)
		{
			if(t % 2 == 0)
				System.out.println(t);
			t++;
		}
		
		
		int count = 0;
		while (count < 10)
		{
			System.out.println("Romani");
			count++;
		}
		
		int sum = 0 , d = 1;
		
		while (d < 10)
		{
			sum += d;
			d++;
		}
		
		System.out.println(sum);
		
		int item = 11;
		int s = 0;
		
		while (item != 0)
		{
			s += item;
			item -= 1;
		}
		
		System.out.println(s);
	}

}
