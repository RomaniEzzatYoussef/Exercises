package new_oop_tests;

public class Test03 
{
	public static void main(String[] args)
	{
		
		try
		{
			TestException c1 = new TestException(5);
			TestException c2 = new TestException(4);
			TestException c3 = new TestException(0);
			TestException c4 = new TestException(-5);
		}
		catch (IllegalArgumentException ex)
		{
			System.out.println(ex);
		}
		
		
		System.out.println("Number of Objects created: " + TestException.numOfObjects);
	}
}
