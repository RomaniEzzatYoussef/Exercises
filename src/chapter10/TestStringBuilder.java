package chapter10;
/**
 *
 * 16/04/2019   10:24:19 PM
 *  
 * @author Romani Ezzat
 *
 *
 * TestStringBuilder
 *
 */
public class TestStringBuilder 
{

	/**
	 * @param args
	 */
	public static void main(String[] args) 
	{
		StringBuilder s1 = new StringBuilder("Java");
		StringBuilder s2 = new StringBuilder("HTML");
		
		s1.append(" is fun"); System.out.println(s1);
		s1.append(s2);  System.out.println(s1);
		s1.insert(2, "is fun"); System.out.println(s1);
		s1.insert(1, s2); System.out.println(s1);
		s1.charAt(2);System.out.println(s1.charAt(2));
		s1.length();System.out.println(s1.length());
		s1.deleteCharAt(3);System.out.println(s1);
		s1.delete(1, 3);System.out.println(s1);
		s1.reverse();System.out.println(s1);
		s1.replace(1, 3, "Computer");System.out.println(s1);
		System.out.println(s1.substring(1, 3));
		System.out.println(s1.substring(2));
		
		
		String s = "Java";
		StringBuilder builder = new StringBuilder(s);
		change(s, builder);
		System.out.println(s);
		System.out.println(builder);
	}
	
	private static void change(String s, StringBuilder builder) 
	{
		s = s + " and HTML";
		builder.append(" and HTML");
	}

}
