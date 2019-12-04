package chapter10;

public class MyInteger 
{
	private int value;
	
	public MyInteger(int value)
	{
		this.value = value;
	}
	
	public int getValue()
	{
		return value;
	}
	
	public boolean isEven()
	{
		return (value % 2 == 0);
	}
	
	public static boolean isEven(int value)
	{
		return ((value % 2) == 0);
	}
	
	public static boolean isEven(MyInteger obj)
	{
		return ((obj.value % 2) == 0);
	}
	
	public boolean isOdd()
	{
		return (value % 2 == 1);
	}
	
	public static boolean isOdd(int value)
	{
		return ((value % 2) == 1);
	}
	
	public static boolean isOdd(MyInteger obj)
	{
		return ((obj.value % 2) == 1);
	}
	
	public boolean isPrime()
	{
		if (isEven() && value != 2)
			return false;
		
		int tempValue = (int) Math.sqrt(value);
		
		for (int i = 3; i <= tempValue; i++)
			if (value % i == 0)
				return false;
		
		return true;
	}
	
	public static boolean isPrime(int value)
	{
		if (isEven(value) && value != 2)
			return false;
		
		int tempValue = (int) Math.sqrt(value);
		
		for (int i = 3; i <= tempValue; i++)
			if (value % i == 0)
				return false;
		
		return true;
	}
	
	public static boolean isPrime(MyInteger obj)
	{
		if (isEven(obj.value) && obj.value != 2)
			return false;
		
		int tempValue = (int) Math.sqrt(obj.value);
		
		for (int i = 3; i <= tempValue; i++)
			if (obj.value % i == 0)
				return false;
		
		return true;
	}
	
	/**
	 * parseInt ...222
	 * */
	public static int parseInt(char[] value) 
	{
		int p = value.length - 1;
		int power = (int) (Math.pow(10, p));
		
		int parsedInteger = 0;
		
		for (int i = 0; i < value.length; i++)
		{	
			parsedInteger += (value[i] * power);
			power /= 10;
		}
		return parsedInteger;
	}
	
	public static int parseInt(String value)
	{
		return (parseInt(value.toCharArray()));
	}
	
	public boolean equals(int value)
	{
		return (this.value == value);
	}
	
	public boolean equals(MyInteger obj)
	{
		return (this.value == obj.value);
	}
	
}
