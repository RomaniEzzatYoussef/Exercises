package chapter11;
/**
 *
 * 24/04/2019   5:17:33 PM
 *  
 * @author Romani Ezzat
 *
 *
 * DynamicBindingDemo
 *
 */
public class DynamicBindingDemo 
{

	/**
	 * @param args
	 */
	public static void main(String[] args) 
	{
		m(new GraduateStudent());
		m(new Studentt());
		m(new Personn());
		m(new Object());
	}
	
	public static void m(Object o)
	{
		System.out.println(o.toString());
	}

}

class GraduateStudent extends Studentt
{
	@Override
	public String toString()
	{
		return "Graduate Student";
	}
}

class Student extends Personn
{
//	@Override
//	public String toString()
//	{
//		return "Student";
//	}
}

class Person1 extends Object
{
	@Override
	public String toString()
	{
		return "Person1";
	}
}
