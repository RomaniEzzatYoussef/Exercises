package listingExamples;
/**
 *
 * 10/03/2019   11:37:17 AM
 *  
 * @author Romani Ezzat
 *
 *
 * Test03
 *
 */
public class Test03 
{

	/**
	 * @param args
	 */
	public static void main(String[] args) 
	{
		double amount = 5;
		System.out.println(amount / 2);
		System.out.println(5 / 2);
		
		float f = 12.5F;
		int i = (int)f;
		System.out.println("f is " + f);
		System.out.println("i is " + i);
		
		int a = 6;
		int b = a++;
		System.out.println(a);
		System.out.println(b);
		a = 6;
		b = ++a;
		System.out.println(a);
		System.out.println(b);
	}

}
