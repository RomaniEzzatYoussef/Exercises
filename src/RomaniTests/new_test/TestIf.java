package RomaniTests.new_test;

import java.util.Scanner;

public class TestIf 
{
	public static void main(String[] args)
	{
		int num1 = (int)(System.currentTimeMillis() % 100);
		int num2 = (int)((System.currentTimeMillis() / 7) % 100);
		
		Scanner input = new Scanner(System.in);
		System.out.print(num1 + " + " + num2 + " = " );
		int answer = input.nextInt();
		
		if (answer == (num1 + num2))
		{	
			System.out.println("Your answer is correct");
			System.out.println(num1 + " + " + num2 + " = " + answer + " is " + (num1 + num2 == answer));
		}
		
		else
		{
			System.out.println("Your answer is wrong");
			System.out.println(num1 + " + " + num2 + " = " + answer + " is " + (num1 + num2 == answer));
		}
		
		
		
		input.close();
	}
}
