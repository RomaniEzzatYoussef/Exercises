package RomaniTests;

public class PassReferenceValue2 {
	
	public static void main(String[] args)
	{
		Tr t = new Tr();
		
		swap(t);
		System.out.println("e1 " + t.e1 + " e2 " + t.e2);
		
	}
	
	public static void swap(Tr t)
	{
		int temp = t.e1;
		t.e1 = t.e2;
		t.e2 = temp;
	}

}

