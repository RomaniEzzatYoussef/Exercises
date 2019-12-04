package chapter06;
/**
 *
 * 01/12/2017   11:15:46 AM
 *  
 * @author roman
 *
 *
 * TestMethodOverloading
 *
 */
public class TestMethodOverloading {

	/**
	 * @param args
	 */
	public static void main(String[] args) 
	{
		System.out.println("The maximum of 3 and 4 is " + max(3, 4));
		System.out.println("The maximum of 3.0 and 5.4 is " + max(3.0, 5.4));
		System.out.println("The maximum of 3.0, 5.4, and 10.14 is " + max(3.0, 5.4, 10.14));
	}
	
	public static int max(int n1 , int n2)
	{
		if (n1 > n2)
			return n1;
		else
			return n2;
	}
	
	public static double max(double n1 , double n2)
	{
		if (n1 > n2)
			return n1;
		else
			return n2;
	}
	
	public static double max(double n1 , double n2 , double n3)
	{
		return max(max(n1 , n2) , n3);
	}

}
