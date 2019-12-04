package chapter07;

import java.util.Random;

/**
 *
 * 05/12/2017   5:17:05 PM
 *  
 * @author roman
 *
 *
 * TesterClass
 *
 */
public class TesterClass {

	/**
	 * @param args
	 */
	public static void main(String[] args) 
	{
		Random random = new Random();
		
		int[] a = new int[100];
		
		for (int i = 0; i < a.length; i++)
			a[i] = random.nextInt(100 + 2) - 1;
		
		for (int e : a)
			System.out.println(e);
	}

}
