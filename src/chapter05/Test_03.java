package chapter05;
/**
 *
 * 19/11/2017   6:57:05 PM
 *  
 * @author roman
 *
 *
 * Test_03
 *
 */
public class Test_03 {

	/**
	 * @param args
	 */
	public static void main(String[] args) 
	{
		int sum = 0;
		for (int i = 1; i < 10; sum += i , System.out.println("Sum is " + sum), i++);

		System.out.println();
		sum = 0;
		 
		for (int i = 1; i < 10; sum += i , System.out.println("Sum is " + sum), ++i);	
		
		for (int i = 1; i < 101; i++)
			System.out.println(i);
		
		for ( ; ; ) 
		{
			System.out.println("Why!");
		}
	}

}
