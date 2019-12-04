package RomaniTests;

public class StudentTest {
	
	public static void main(String[] args)
	{
		Student r = new Student();
		
		System.out.println("R Object's Defaults id " + r.id + " name " + r.name + " ScienceMajor is " + r.isScienceMajor + " gender is" + r.gender );
		System.out.println("r is " + r.toString());
	}

}
