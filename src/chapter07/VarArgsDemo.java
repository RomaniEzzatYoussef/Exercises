package chapter07;
/**
 *
 * 05/12/2017   6:48:26 AM
 *  
 * @author roman
 *
 *
 * VarArgsDemo
 *
 */
public class VarArgsDemo 
{

	/**
	 * @param args
	 */
	public static void main(String[] args) 
	{
		printMax(1, 2, 2, 3, 15, 4, 7, 12, 4, 14);
		printMax(new double[] {5.2 , 5.1 , 6.8 , 6.9 , 7.1});
	}
	
	public static void printMax(double... numbers)
	{
		if (numbers.length == 0)
		{
			System.out.println("No Argument Passed");
			return;
		}
		
		double result = numbers[0];
		for (int i = 1; i < numbers.length; i++)
			if (result < numbers[i])
				result = numbers[i];
		
		System.out.println("Max value is " + result);
		
	}

}
