package chapter05;
/**
 *
 * 27/11/2017   11:31:55 AM
 *  
 * @author roman
 *
 *
 * TestSum
 *
 */
public class TestSum {

	/**
	 * @param args
	 */
	public static void main(String[] args) 
	{
		{
			float sum = 0;
			
			for (float i = 0.01f; i < 1.0f; i += 0.01f)
				sum += i;
			
			System.out.println("Sum is " + sum);
		}
		
		{
			double sum = 0;
			
			for (double i = 0.01; i < 1.0; i += 0.01)
				sum += i;
			
			System.out.println("Sum is " + sum);
		}
		
		{
			double sum = 0;
			double currentValue = 0.01;
			
			for (int i = 1; i < 100; i++)
			{
				sum += currentValue;
				currentValue += 0.01;
			}
				
			System.out.println("Sum is " + sum);
		}
		
		{
			double sum = 0;
			double currentValue = 1.0;
			
			for (int i = 1; i < 100; i++)
			{
				sum += currentValue;
				currentValue -= 0.01;
			}
				
			System.out.println("Sum is " + sum);
		}
	}

}
