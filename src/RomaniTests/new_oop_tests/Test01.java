package RomaniTests.new_oop_tests;

import java.math.BigDecimal;
import java.math.BigInteger;

public class Test01 
{
	public static void main(String[] args)
	{
		Integer x = 3 + new Integer(5);
		System.out.println(x);
		
		Integer q = 3;
		System.out.println(q);
		
		Double w = 3.0;
		System.out.println(w);
		
		Double e = 3.0;
		System.out.println(e);
		
		int r = new Integer(3);
		System.out.println(r);
		
		int t = new Integer(3) + new Integer(4);
		System.out.println(t);
		
		Double s = 3.5;
		System.out.println(s.intValue());
		System.out.println(s.compareTo(4.5));
		
		BigInteger a = new BigInteger("9223372036854775807");
		BigInteger b = new BigInteger("2");
		BigInteger c = a.multiply(b); // 9223372036854775807 * 2
		System.out.println(c);
		
		BigDecimal aa = new BigDecimal(1.0);
		BigDecimal bb = new BigDecimal(3);
		BigDecimal cc = aa.divide(bb, 4, BigDecimal.ROUND_UP);
		System.out.println(cc);
	}
}
