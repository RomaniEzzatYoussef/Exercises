package RomaniTests.new_test;

public class AssociationRelationClasses 
{
	public static void main(String[] args)
	{
		System.out.println("AssociationRelationClasses");
	}

}

class S
{
	private C[] courseList;
	
	public void addCourse(C course)
	{
		
	}
}

class C
{
	private S[] studentList;
	private Faculty faculty;
	
	public void addStudent(S student)
	{
		
	}
	
	public void addFaculty(Faculty faculty)
	{
		
	}
}

class Faculty
{
	private C[] courseList;
	
	public void addCourse(C course)
	{
		
	}
}