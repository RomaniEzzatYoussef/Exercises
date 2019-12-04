package chapter10;
/**
 *
 * 05/04/2018   2:53:04 PM
 *  
 * @author roman
 *
 *
 * Student
 *
 */
public class Student 
{
	public static void main(String[] args) 
	{
		
	}
	
	private String name;
	private Course[] courseList;// indicates to Association relationship
	
	public void addCourse(Course course)
	{
		
	}
	

}

class Courses
{
	private Student[] classList;
	private Faculty faculty;
	public void addStudent(Student student)
	{
		
	}
	public void setFaculty(Faculty faculty)
	{
		
	}
}

class Faculty
{
	private Course[] courseList;
	public void addCourse(Course course)
	{
		
	}
}
