package chapter09;
/**
 *
 * 04/01/2018   5:57:45 PM
 *  
 * @author Romani Ezzat
 *
 *
 * Test_06
 *
 */
public class Test_06 
{
	private int p;
	
	Test_06()
	{
		this(12);
		System.out.println("C's no-arg constructor invoked");
	}
	
	Test_06(int p)
	{
		this.p = p;
	}
	
	public void setP(int p)
	{
		this.p = p;
	}
	
	public static void main(String[] args) 
	{
		Test_06 t = new Test_06(300);
		System.out.println(t.p);
	}

}
