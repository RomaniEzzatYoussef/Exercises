package chapter05;
/**
 *
 * 28/11/2017   7:40:21 AM
 *  
 * @author roman
 *
 *
 * TestBreak
 *
 */
public class TestBreak {

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
			sum += num;
			if (sum >= 100)
				break;
		}
		
		System.out.println("The number is " + num);
		System.out.println("The sum is " + sum);
	}

}
