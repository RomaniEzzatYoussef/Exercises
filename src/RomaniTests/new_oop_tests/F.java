package RomaniTests.new_oop_tests;

public class F 
{
	private static int i = 0;
	private static int j = 0;
	private int x = 0; // Instance variable
	private int y = 0;
	
	public static void main(String[] args)
	{
		F f = new F();
		f.p();
		
		int i = 2;
		int k = 3;
		
		{
			int j = 3;
			System.out.println("i + j is " + (i + j));
		}
		
		k = i + j;
		System.out.println("k is " + k);
		System.out.println("j is " + j);
	}
	
	public F()
	{
		
	}
	
	public void p() 
	{
		int x = 1; // Local variable
		System.out.println("x = " + x);
		System.out.println("y = " + y);
	}
}