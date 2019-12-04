package chapter11;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * 02/05/2019   7:52:36 PM
 *  
 * @author Romani Ezzat
 *
 *
 * Exercise_05
 *
 */
public class Exercise_05 
{

	/**
	 * @param args
	 */
	public static void main(String[] args) 
	{
		Scanner input = new Scanner(System.in);
		System.out.print("Enter number of students: ");
		int size = input.nextInt();
		
		Course javaCourse = new Course();
		
		for (int i = 0; i < size; i++)
		{
			System.out.print("Enter student's name: ");
			javaCourse.addStudent(input.next());
		}
		
		//javaCourse.clearStudents();
		
		ArrayList<String> stuList = new ArrayList<String>();
		stuList = javaCourse.getStudentsList();
		
		for (int i = 0; i < stuList.size(); i++)
			System.out.print(stuList.get(i) + " ");
		
		input.close();
	}

}

class Course 
{
	private String courseName;
	private ArrayList<String> studentsList = new ArrayList<String>();
	
	public Course()
	{
		this("Java 101");
	}
	
	public Course(String courseName)
	{
		this.courseName = courseName;
	}
	
	
	public void addStudent(String student)
	{
		studentsList.add(student);
	}
	
	public void dropStudent(String student)
	{
		studentsList.remove(student);
	}
	
	public void clearStudents()
	{
		studentsList.clear();
	}

	public ArrayList<String> getStudentsList()
	{
		return studentsList;
	}
	
	public String[] getStudentsArray()
	{
		String[] list = new String[studentsList.size()]; 
		list = studentsList.toArray(list);
		return list;
	}


	public String getCourseName() 
	{
		return courseName;
	}
	
	public int getNumberOfStudents()
	{
		return studentsList.size();
	}
}

