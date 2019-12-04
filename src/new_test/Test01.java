package new_test;

public class Test01 
{
	public static void main(String[] args)
	{
		Doll c = new Demo();
	}
}

class Doll
{
	public Doll()
	{
		System.out.println("Constructor of Doll");
	}
}

class Coll extends Doll{
	
	public Coll()
	{
		System.out.println("Coll constructor");
	}

}

class Demo extends Coll
{
	public Demo()
	{
		System.out.println("Demo constructor");
	}
}

