package chapter09;
/**
 *
 * 30/12/2017   6:22:53 PM
 *  
 * @author roman
 *
 *
 * Test_03
 *
 */
public class Test_03 {

	/**
	 * @param args
	 */
	public static void main(String[] args) 
	{
		T t1 = new T();
		T t2 = new T();
		System.out.println("t1's i = " + t1.i + " and j = " + t1.j);
		System.out.println("t2's i = " + t2.i + " and j = " + t2.j);
	}

}

class T
{
	static int i = 0;
	int j = 0;
	
	T()
	{
		i++;
		j = 1;
	}
}