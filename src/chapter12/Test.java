package chapter12;
/**
 *
 * 07/05/2019   7:29:30 AM
 *  
 * @author Romani Ezzat
 *
 *
 * Test
 *
 */
public class Test {

	/**
	 * @param args
	 */
	public static void main(String[] args) 
	{
		long value = Long.MAX_VALUE + 1;
		System.out.println(value);
		
		try {
			int v = 30;
			if (v < 40)
				throw new Exception("value is too small");
		}
		catch (Exception ex) {
			System.out.println(ex.getMessage());
		}
		System.out.println("Continue after the catch block");

		
		for (int i = 0; i < 2; i++) 
		{
			System.out.print(i + " ");
			try 
			{
				System.out.println(1 / 0);
			}
			catch (Exception ex) 
			{
				System.out.println("catch hanling exception..");
			}
		}
		
		try {
			for (int i = 0; i < 2; i++) 
			{
				System.out.print(i + " ");
				System.out.println(1 / 0);
			}
		}
		catch (Exception ex) {
			System.out.println("catch hanling exception..");
		}
	}

}
