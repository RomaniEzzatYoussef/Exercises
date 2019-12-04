package chapter12;
/**
 *
 * 07/05/2019   6:37:48 PM
 *  
 * @author Romani Ezzat
 *
 *
 * TestException
 *
 */
public class TestException 
{

	/**
	 * @param args
	 */
	public static void main(String[] args) 
	{
		try {
			System.out.println(sum(new int[] {1, 3, 4, 6, 9}));
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("\n" + e.getMessage());
			System.out.println("\n" + e.toString());
			
			System.out.println("\nTrace Info Obtained from getStackTrace");
			StackTraceElement[] stackTrace = e.getStackTrace();
			for(int i = 0; i < stackTrace.length; i++)
			{
				System.out.print("method " + stackTrace[i].getMethodName() + "(" + stackTrace[i].getClassName() + ":"
						+stackTrace[i].getLineNumber() + ")\n");
			}
		}
	}
	
	public static int sum(int[] list)
	{
		int result = 0;
		for (int i = 0; i <= list.length; i++)
		{
			result += list[i];
		}
		
		return result;
	}

}
