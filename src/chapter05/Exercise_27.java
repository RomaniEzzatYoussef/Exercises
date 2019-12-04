package chapter05;
/**
 * Display leap years
 * Write a program that displays all the leap years, ten per line, from 101 to 2100, separated by exactly one space. 
 * Also display the number of leap years in this period.
 *
 * 30/11/2017   7:22:37 AM
 *  
 * @author roman
 *
 *
 * Exercise_27
 *
 */
public class Exercise_27 {

	/**
	 * @param args
	 */
	public static void main(String[] args) 
	{
		int leapYearCounter = 0;
		
		for (int i = 101; i <= 2100; i++)
		{
			if (i % 4 == 0)
			{
				if (i % 100 == 0 && i % 400 == 0 || i % 100 != 0)
				{
					leapYearCounter++;
					
					if (leapYearCounter % 25 == 0)
						System.out.println(i + " ");
					else
						System.out.print(i + " ");
					
				}
			}
		}
	}

}
