package chapter10;
/**
 *
 * 16/04/2019   7:32:19 PM
 *  
 * @author Romani Ezzat
 *
 *
 * StringTest01Objects
 *
 */
public class StringTest01Objects 
{

	/**
	 * @param args
	 */
	public static void main(String[] args) 
	{
		String s1 = "Welcome to Java";
		String s2 = s1;
		String s3 = new String("Welcome to Java");
		String s4 = "Welcome to Java";
		
		System.out.println("1- " + (s1 == s2) + " 2- " + (s1 == s3) + " 3- " + (s1 == s4) + " 4- " + s1.equals(s3)
		+ " 5- " + s1.equals(s4) + " 6- " + "Welcome to Java".replace("Java", "HTML") + " 7- " + s1.replace('o', 'T') 
		+ " 8- " + s1.replaceAll("o", "T") + " 9- " + s1.replaceFirst("o", "T") + " 10- " + String.valueOf(s1.toCharArray()));
		
		
		String sd = new String(" ");
		System.out.println(sd.length());
		
		StringBuilder stringBuilder = new StringBuilder();
		stringBuilder.append("Welcome");
		stringBuilder.append(' ');
		stringBuilder.append("to");
		stringBuilder.append(' ');
		stringBuilder.append("Java");
		stringBuilder.insert(11, "HTML and ");
		StringBuilder stringBuilder1 = stringBuilder.reverse();
		System.out.println(stringBuilder);
		System.out.println(stringBuilder1);
		
		
		
		
		
	}

}
