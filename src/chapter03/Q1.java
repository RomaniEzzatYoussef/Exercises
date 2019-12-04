package chapter03;

/**
 * 10/10/2017   2:39:49 PM
 *
 * @author Romani Ezzat
 *
 */
public class Q1 
{
	int z;

	/**
	 * @param args
	 */
	public static void main(String[] args) 
	{
		Q1 myTest = new Q1();
		
		int z = 6;
		System.out.print(z + " "); // 6
		
		myTest.doStuff();    // 5 
		System.out.print(z + " "); // 6
		
		System.out.print(myTest.z); // 4
	}
	
	void doStuff()
	{
		int z = 5;
		doStuff2();
		
		System.out.print(z + " ");
	}
	
	void doStuff2()
	{
		z = 4;
	}

}
