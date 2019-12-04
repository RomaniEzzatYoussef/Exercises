package chapter05;
/**
 *
 * 17/03/2019   6:56:08 AM
 *  
 * @author Romani Ezzat
 *
 *
 * Test_11
 *
 */
public class Test_11 {

	/**
	 * @param args
	 */
	public static void main(String[] args) 
	{
		for (int i = 1; i < 4; i++) 
		{
			for (int j = 1; j < 4; j++) 
			{
				if (i * j > 2)
					break;
				System.out.print(i * j);
			}
			
			System.out.println(i);
		}
		
		System.out.println("---------------------");
		
		for (int i = 1; i < 4; i++) 
		{
			for (int j = 1; j < 4; j++) 
			{
				if (i * j > 2)
					continue;
				System.out.print(i * j);
			}
			
			System.out.println(i);
		}
	}

}
