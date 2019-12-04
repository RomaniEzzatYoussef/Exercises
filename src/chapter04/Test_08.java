package chapter04;
/**
 *
 * 17/11/2017   8:00:41 AM
 *  
 * @author roman
 *
 *
 * Test_08
 *
 */
public class Test_08 {

	/**
	 * @param args
	 */
	public static void main(String[] args) 
	{
		System.out.println("java".indexOf("va", 2));
		
		System.out.println("Welcome to Java".indexOf('W') + "\n" + "Welcome to Java".indexOf('o') + "\n" + "Welcome to Java".indexOf('o', 5) 
				+ "\n" + "Welcome to Java".indexOf("come") + "\n" + "Welcome to Java".indexOf("Java", 5) + "\n" + "Welcome to Java".indexOf("java", 5) 
				+ "\n" + "Welcome to Java".lastIndexOf('W') + "\n" + "Welcome to Java".lastIndexOf('o') + "\n" + "Welcome to Java".lastIndexOf('o', 5) 
				+ "\n" + "Welcome to Java".lastIndexOf("come") + "\n" + "Welcome to Java".lastIndexOf("Java", 5) + "\n" + "Welcome to Java".lastIndexOf("Java") );
		
		
		String s = "Romani Ezzat";
		int k = s.indexOf(' ');
		
		String firstName = s.substring(0, k);
		String lastName = s.substring(k+1);
		
		System.out.println(lastName + " " + firstName);
		
		String s1 = "Welcome to Java";
		String s2 = "Programming is fun";
		String s3 = "Welcome to Java";
		
		System.out.println((s1 == s2) + " " + (s2 == s3) + " " + s1.equals(s2) + " " + s1.equals(s3) + " " + s1.compareTo(s2) + " " + s2.compareTo(s2) + " " + s1.compareTo(s3));
		
		System.out.println("1" + 1);
		System.out.println('1' + 1);
		System.out.println("1" + 1 + 1);
		System.out.println("1" + (1 + 1));
		System.out.println('1' + 1 + 1);
		System.out.println('\u0001' + 1);
		System.out.println(1 + "Welcome " + 1 + 1 + " " + 1 + "Welcome " + (1 + 1) + " " + 1 + "Welcome " + ('\u0001' + 1) + " " + 1 + "Welcome " + 'a' + 1);
		
		String ss1 = "welcome ";
		String ss2 = "Welcome ";
		
		boolean isEqual1 = ss1.equals(ss2);
		boolean isEqual2 = ss1.equalsIgnoreCase(ss2);
		int x1 = ss1.compareTo(ss2);
		int x2 = ss1.compareToIgnoreCase(ss2);
		boolean b1 = ss1.startsWith("AAA");
		boolean b2 = ss1.endsWith("AAA");
		int x3 = ss1.length();
		char x4 = ss1.charAt(0);
		String ss3 = ss1.concat(ss2);
		String str1 = ss1.substring(1);
		String str2 = ss1.substring(1, 4);
		String ss4 = ss1.toLowerCase();
		String ss5 = ss1.toUpperCase();
		String ss6 = ss1.trim();
		int x5 = ss1.indexOf('e');
		int x6 = ss1.lastIndexOf("abc");
		
		System.out.println(isEqual1 + " " + isEqual2 + " " + x1 + " " + x2 + " " + b1 + " " + b2 + " " + x3 + " " + x4 + " " + ss3 + " " + str1 
				+ " " + str2 + " " + ss4 + " " + ss4 + " " + ss5 + " " + ss6 + " " + x5 + " " + x6);
		
		
		
	}

}
