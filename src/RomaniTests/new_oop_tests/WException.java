package RomaniTests.new_oop_tests;

import java.util.Scanner;

public class WException 
{
	public static void main(String[] args)
	{
		System.out.println("Enter a value: ");
		Scanner input = new Scanner(System.in);
		int value = input.nextInt();
		
		method1(value);
		
	}
	
	public static void method1(int value)
	{
		if (value < 40)
			try {
				throw new Exception("Value is too small");
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		else
			System.out.println("The value is pure");
	}
}
