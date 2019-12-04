package chapter10;
/**
 *
 * 21/04/2019   3:30:37 AM
 *  
 * @author Romani Ezzat
 *
 *
 * Excercise_09
 *
 */
public class Exercise_09 {

	/**
	 * @param args
	 */
	public static void main(String[] args) 
	{
		Course android = new Course("Android");
		android.addStudent("Romani Ezzat");
		android.addStudent("Batrek Nabil");
		android.addStudent("Sarah Ashraf");
		android.addStudent("Mazen Foad");
		
		android.dropStudent("Mazen Foad");
		
		String[] course = android.getStudents();
		
//		for(String e : course)
//			System.out.println(e);
		
		for(int i = 0; i < android.getNumberOfStudents(); i++)
			System.out.println(course[i]);
		
		android.clearStudents();
		String[] course1 = android.getStudents();
		
//		for(String e : course1)
//			System.out.println(e);
		
		for(int i = 0; i < android.getNumberOfStudents(); i++)
			System.out.println(course1[i]);
	}

}
