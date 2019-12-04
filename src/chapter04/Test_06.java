package chapter04;
/**
 *
 * 16/11/2017   6:02:23 PM
 *  
 * @author roman
 *
 *
 * Test_06
 *
 */
public class Test_06 {

	/**
	 * @param args
	 */
	public static void main(String[] args) 
	{
		randomNumeric();
		
		System.out.println();
		
		randomUpperCase();
		
		System.out.println();
		
		randomLowerCase();
	}
	
	public static void randomLowerCase()
	{
		int random = (int) (97 + (Math.random() * 26) );
		
		for (int i = 1; i < 101; i++)
		{
			random = (int) (97 + (Math.random() * 26) );
			System.out.print((char) random + " ");
			
			if (i % 10 == 0)
				System.out.println();
			
			//if (i == 10 || i == 20 || i == 30 || i == 40 || i == 50 || i == 60 || i == 70 || i == 80 || i == 90 || i == 100)
				//System.out.println();
		}
	}
	
	public static void randomUpperCase()
	{
		int random = (int) (65 + (Math.random() * 26) );
		
		for (int i = 1; i < 101; i++)
		{
			random = (int) (65 + (Math.random() * 26) );
			System.out.print((char) random + " ");
			
			if (i % 10 == 0)
				System.out.println();
			
			//if (i == 10 || i == 20 || i == 30 || i == 40 || i == 50 || i == 60 || i == 70 || i == 80 || i == 90 || i == 100)
				//System.out.println();
		}
	}
	
	public static void randomNumeric()
	{
		int random = (int) (48 + (Math.random() * 10) );
		
		for (int i = 1; i < 101; i++)
		{
			random = (int) (48 + (Math.random() * 10) );
			System.out.print((char) random + " ");
			
			if (i % 10 == 0)
				System.out.println();
			
			//if (i == 10 || i == 20 || i == 30 || i == 40 || i == 50 || i == 60 || i == 70 || i == 80 || i == 90 || i == 100)
				//System.out.println();
		}
	}

}
