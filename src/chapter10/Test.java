package chapter10;
/**
 *
 * 16/04/2019   8:16:22 PM
 *  
 * @author Romani Ezzat
 *
 *
 * Test
 *
 */
public class Test 
{
	private String text;
	public Test(String s) 
	{
		this.text = s;
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) 
	{
		Test test = new Test("ABC");
		
		System.out.println(test.text.toLowerCase());
		
		System.out.println("Hi, ABC, good".matches("ABC "));
		System.out.println("Hi, ABC, good".matches(".*ABC.*"));
		System.out.println("A,B;C".replaceAll(",;", "#"));
		System.out.println("A,B;C".replaceAll("[,;]", "#"));
		String[] tokens = "A,B;C".split("[,;]");
		for (int i = 0; i < tokens.length; i++)
			System.out.print(tokens[i] + " ");
		
		String s = "Hi, Good Morning";
		System.out.println(m(s));
	}
	
	public static int m(String s) 
	{
		int count = 0;
		for (int i = 0; i < s.length(); i++)
			if (Character.isUpperCase(s.charAt(i)))
				count++;
		return count;
	}

}
