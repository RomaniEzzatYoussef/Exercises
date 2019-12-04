package chapter06;
/**
 *
 * 01/12/2017   4:24:28 PM
 *  
 * @author roman
 *
 *
 * RandomCharacter
 *
 */
public class RandomCharacter {

	/**
	 * @param args
	 */
	public static void main(String[] args) 
	{
		for (int i = 1; i <= 100; i++)
		{
			if ( i % 10 == 0)
				System.out.println(getRandomCharacter('!' , '~') + " ");
			else 
				System.out.print(getRandomCharacter('!' , '~') + " ");
		}
		
		System.out.println();
		
		for (int i = 1; i <= 100; i++)
		{
			if ( i % 10 == 0)
				System.out.println(getRandomLowerCaseLetter() + " ");
			else 
				System.out.print(getRandomLowerCaseLetter() + " ");
		}
		
		System.out.println();
		
		for (int i = 1; i <= 100; i++)
		{
			if ( i % 10 == 0)
				System.out.println(getRandomUpperCaseLetter() + " ");
			else 
				System.out.print(getRandomUpperCaseLetter() + " ");
		}
		
		System.out.println();
		
		for (int i = 1; i <= 100; i++)
		{
			if ( i % 10 == 0)
				System.out.println(getRandomDigitCharacter() + " ");
			else 
				System.out.print(getRandomDigitCharacter() + " ");
		}
		
		System.out.println();
		
		for (int i = 1; i <= 100; i++)
		{
			if ( i % 10 == 0)
				System.out.println(getRandomCharacter() + " ");
			else 
				System.out.print(getRandomCharacter() + " ");
		}
	}
	
	public static char getRandomCharacter(char ch1 , char ch2)
	{
		return (char) (ch1 + Math.random() * (ch2 - ch1 + 1));
	}
	
	public static char getRandomLowerCaseLetter()
	{
		return getRandomCharacter('a' , 'z');
	}
	
	public static char getRandomUpperCaseLetter()
	{
		return getRandomCharacter('A' , 'Z');
	}
	
	public static char getRandomDigitCharacter()
	{
		return getRandomCharacter('0', '9');
	}
	
	public static char getRandomCharacter()
	{
		return getRandomCharacter('\u0000' , '\uFFFF');
	}

}
