package RomaniTests;

public class PassReferenceValue3 {
	
	public static void main(String[] args)
	{
		TE t1 = new TE();
		TE t2 = new TE();
		TE t3 = new TE();
		
		t1.j = 3;
		
		System.out.println("t1's i " + t1.i + " t1's j " + t1.j);
		System.out.println("t2's i " + t2.i + " t2's j " + t2.j);
		System.out.println("t3's i " + t3.i + " t3's j " + t3.j);
	}

}
