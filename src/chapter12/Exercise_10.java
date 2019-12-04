package chapter12;
/**
 *
 * 21/05/2019   7:29:36 AM
 *  
 * @author Romani Ezzat
 *
 *
 * Exercise_10
 *
 */
public class Exercise_10 {

	@SuppressWarnings("unused")
	public static void main(String[] args) 
	{
		try
		{
			int[] largeArray;
			largeArray = new int[(int) Math.pow(Integer.MAX_VALUE, 2)];
		}
		catch (OutOfMemoryError e) 
		{
			System.out.println(e.getMessage());
		}
	}

}
