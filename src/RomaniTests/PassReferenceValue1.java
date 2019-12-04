package RomaniTests;

public class PassReferenceValue1 {
	
	public static void main(String[] args)
	{
		int[] a = {1 , 2};
		
		swap(a);
		System.out.println("a[0] " + a[0] + " a[1] " + a[1]);
		
	}
	
	public static void swap(int[] a)
	{
		int temp = a[0];
		a[0] = a[1];
		a[1] = temp;
	}

}
