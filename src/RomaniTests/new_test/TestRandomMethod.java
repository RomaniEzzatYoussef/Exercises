package RomaniTests.new_test;

import java.util.Scanner;

public class TestRandomMethod 
{
	public static void main(String[] args)
	{
		double num = Math.random() * 10;
		System.out.println(num);
		
		int num1 = (int) (Math.random() * 100);
		int num2 = (int) (Math.random() * 100);
		
		Scanner input = new Scanner(System.in);
		
		if (num1 < num2)
		{	
			int temp = num1;
			num1 = num2;
			num2 = temp;
		}
		
		System.out.print(num1 + " - " + num2 + " = ");
		int answer = input.nextInt();
		
		if ((num1 - num2) == answer)
			System.out.println(answer + " is correct");
		else
		{
			System.out.println(answer + " is wrong");
			System.out.println("The correct answer is " + num1 + " - " + num2 + " = " + (num1 - num2));
		}
		input.close();
	}

}
