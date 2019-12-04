package RomaniTests.new_oop_tests;

public class Test02 
{
	public static void main(String[] args) 
	{
		Integer i = new Integer(2);
		StringBuilder builder = new StringBuilder("java");
		
		change(i, builder);
		
		System.out.println(i);
		System.out.println(builder);
	}	
		
	private static void change(Integer i, StringBuilder builder) 
	{
		i *= 5;;
		builder.append(" and HTML");
	
	}
}