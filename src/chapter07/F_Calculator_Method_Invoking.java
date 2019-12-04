package chapter07;

import java.util.Scanner;

/**
 *
 * 05/12/2017   11:41:13 AM
 *  
 * @author roman
 *
 *
 * Invoking_Calculator_Method
 *
 */
public class F_Calculator_Method_Invoking {

	/**
	 * @param args
	 */
	public static void main(String[] args) 
	{
		Scanner input = new Scanner(System.in);
		System.out.print("Enter an arithmetic operation: ");
		String[] a = new String[3];
		for (int i = 0; i < a.length; i++)
			a[i] = input.next();
		
		F_Calculator.main(a);
		
		input.close();
	}

}
