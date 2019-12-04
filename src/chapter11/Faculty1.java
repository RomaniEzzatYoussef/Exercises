package chapter11;
/**
 *
 * 23/04/2019   6:10:02 PM
 *  
 * @author Romani Ezzat
 *
 *
 * Faculty
 *
 */
public class Faculty1 extends Employee1 
{
	public Faculty1()
	{
		super("Hello World!....................");
		System.out.println("(4) Performs Faculty's tasks");

	}

	/**
	 * @param args
	 */
	public static void main(String[] args) 
	{
		new Faculty1();
	}

}

class Employee1 extends Person1
{
	public Employee1()
	{
		this("(2) Invoke Employee's overloaded constructor");
		System.out.println("(3) Performs Employee's tasks ");
	}
	
	public Employee1(String s)
	{
		System.out.println(s);
	}
}

class Personn
{
	public Personn()
	{
		System.out.println("(1) Performs Person's tasks");
	}
}