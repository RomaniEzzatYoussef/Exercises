package chapter10;
/**
 * * New string split method
 * The split method in the String class returns an array of strings consisting of the substrings split by the delimiters. 
 * However, the delimiters are not returned. Implement the following new method that returns an array of strings consisting of the substrings split by the matching delimiters, 
 * including the matching delimiters.
 * public static String[] split(String s, String regex)
 * For example, split("ab#12#453", "#") returns ab, #, 12, #, 453 in an array of String, and split("a?b?gf#e", "[?#]") returns a, b, ?, b, gf, #, and e in an array of String.
 * 
 * 22/04/2019   7:42:36 AM
 *  
 * @author Romani Ezzat
 *
 *
 * Exercise_25
 *
 */
public class Exercise_25 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		String[] s = MyString2.split("ab#12#453", "#");
		
		for (int i = 0; i < s.length; i++)
			System.out.print(s[i] + ", ");
		
		s = MyString2.split("a?b?gf#e", "[?#]");
		
		System.out.println();
		for (int i = 0; i < s.length; i++)
			System.out.print(s[i] + ", ");

	}

}
