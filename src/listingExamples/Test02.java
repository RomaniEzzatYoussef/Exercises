package listingExamples;
/**
 *
 * 10/03/2019   10:57:28 AM
 *  
 * @author Romani Ezzat
 *
 *
 * Test02
 *
 */
public class Test02 
{

	/**
	 * @param args
	 */
	public static void main(String[] args) 
	{
		int i = 2;
		int k = ++i + i++ + --i + i-- + i;
		System.out.println(k);
		System.out.println(i);
		
		int j = 2;
		int m = --j + j-- + ++j + j++ + j;
		System.out.println(m);
		System.out.println(j);
		
		i = j = k = m = 0;
		
		System.out.println(i = i + 5);
	}

}
