package RomaniTests.new_test;

import java.util.Scanner;

public class IsDivisible 
{
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		System.out.print("Enter a number: ");
		int x = input.nextInt();
		
		if (((x % 2) == 0) && ((x % 3) == 0))
			System.out.println("is divisible by 2 and 3");
		else
			System.out.println("is not divisible by 2 and 3");
		
		
		System.out.println("----------------------------------------------");
		
		
		if (((x % 6) == 0))
			System.out.println("is divisible by 6");
		else
			System.out.println("is not divisible by 6");
		
		System.out.println("----------------------------------------------");
		
		
		if ((x >= 50) && (x <= 100))
			System.out.println("x is greater than or equal to 50 and less than or equal to 100");
		else
			System.out.println("x out of range");
		
		System.out.println("----------------------------------------------");
		
		System.out.print("Enter w , y and z: ");
		double w = input.nextDouble();
		double y = input.nextDouble();
		double z = input.nextDouble();
		System.out.println("(w < y && y < z) is " + (w < y && y < z));
		System.out.println("(w < y || y < z) is " + (w < y || y < z));
		System.out.println("!(w < y) is " + !(w < y));
		System.out.println("(w + y < z) is " + (w + y < z));
		System.out.println("(w + y > z) is " + (w + y > z));
		
		
		input.close();
	}
}
