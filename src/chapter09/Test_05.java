package chapter09;
/**
 *
 * 04/01/2018   5:24:11 PM
 *  
 * @author roman
 *
 *
 * Test_05
 *
 */
public class Test_05 {

	private int x = 0;
	private int y = 0;
	
	public void p()
	{
		int x = 1;
		System.out.println(this.x);
		System.out.println(y);
		System.out.println(x);
	}
	
	public static void main(String[] args) 
	{
		Test_05 t = new Test_05();
		t.p();
	}

}
