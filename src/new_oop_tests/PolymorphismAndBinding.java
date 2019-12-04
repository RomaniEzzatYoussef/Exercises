package new_oop_tests;

public class PolymorphismAndBinding 
{
	public static void main(String[] args) 
	{
		new Person1().printPerson();
		new Student().printPerson();
	}

}

class Student extends Person1 
{
	@Override
	public String getInfo() 
	{
		return "Student";
	}

}

class Person1 
{
	public String getInfo() 
	{
		return "Person";
	}
	
	public void printPerson() 
	{
		System.out.println(getInfo());
	}
		
}