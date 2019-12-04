package RomaniTests;

import java.util.Date;
import java.util.Random;

public class ShowErrors {
	
	public static void main(String[] args)
	{
		Date date = new Date();
		System.out.println("The elapsed time since Jan 1, 1970 is " + date.getTime() + " milliSeconds");
		System.out.println("The elapsed time since Jan 1, 1970 is " + System.currentTimeMillis() + " milliSeconds");
		System.out.println(date.toString());
		System.out.println(date.toString());
		
		Random random1 = new Random(3);
		System.out.print("From random1: ");
		for (int i = 0; i < 10; i++)
			System.out.print(random1.nextInt(1000) + " ");
		
		Random random2 = new Random(3);
		System.out.print("\nFrom random2: ");
		for (int i = 0; i < 10; i++)
			System.out.print(random2.nextInt(1000) + " ");
	}

}
