package chapter05;
/**
 *
 * 28/11/2017   7:52:22 AM
 *  
 * @author roman
 *
 *
 * TestContinue
 *
 */
public class TestContinue {

	/**
	 * @param args
	 */
	public static void main(String[] args) 
	{
		int sum = 0;
		int num = 0;
		
		while (num < 20)
		{
			num++;
			if (num == 10 || num == 11)
				continue;
			
			sum += num;
		}
		
		System.out.println("The number is " + num);
		System.out.println("The sum is " + sum);
	}

}
