package new_oop_tests;
/**
 *
 * 11/04/2019   12:49:17 PM
 *  
 * @author Romani Ezzat
 *
 *
 * Test_00
 *
 */
public class Test_00 
{
	private static int i = 0;
	private static int j = 0;
	
	/**
	 * @param args
	 */
	public static void main(String[] args) 
	{
		int i = 2;
		int k = 3;
		{
			int j = 3;
			System.out.println("i + j is " + i + j);
		}
		
		k = i + j;
		System.out.println("k is " + k);
		System.out.println("j is " + j);
	}
	
	

}
