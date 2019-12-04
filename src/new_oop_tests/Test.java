package new_oop_tests;

import java.util.Date;

public class Test 
{
	public static void main(String[] args)
	{
		String s = "14/07/2017";
		
		Date date = new Date(s);
		System.out.println(date);
		
		
		int day = Integer.parseInt(s.substring(0, 2)); 
		int month = Integer.parseInt(s.substring(3, 5));
		int year = Integer.parseInt(s.substring(6));
		System.out.println(day + " " + month + " " + year);
		
		
		String[] a = s.split("/");
		int d = Integer.parseInt(a[0]); 
		int m = Integer.parseInt(a[1]);
		int y = Integer.parseInt(a[2]);
		Date date1 = new Date((year - 1900) , month , day);
		System.out.println(date1);
		
		
	}
	
}
