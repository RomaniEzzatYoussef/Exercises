package chapter10;
/**
 *
 * 07/04/2018   12:55:03 PM
 *  
 * @author roman
 *
 *
 * Course
 *
 */
public class Course 
{
	private String courseName;
	private String[] students = new String[3];
	private int numberOfStudents;
	
	public Course(String courseName)
	{
		this.courseName = courseName;
	}
	
	
	public void addStudent(String student)
	{
		if (numberOfStudents >= students.length)
		{
			String[] temp = new String[students.length*2];
			System.arraycopy(students, 0, temp, 0, students.length);
			students = temp;
		}
		
		students[numberOfStudents++] = student;
	}
	
	public void dropStudent(String student)
	{
		String[] temp = new String[this.students.length];
		int index = 0;
		for (int i = 0; i < students.length; i++)
		{
			if (!(students[i] == student))
			{
				temp[index++] = students[i];
			}
		}
		
		students = temp;
		numberOfStudents--;
	}
	
	public void clearStudents()
	{
		numberOfStudents = 0;
		students = new String[5];
	}

	public String[] getStudents()
	{
		return students;
	}


	public String getCourseName() 
	{
		return courseName;
	}


	public int getNumberOfStudents() 
	{
		return numberOfStudents;
	}


}
