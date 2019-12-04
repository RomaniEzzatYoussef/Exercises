package new_oop_tests;

public class EqualsMethod 
{
	public static void main(String[] args) 
	{
		Object a1 = new A();
		Object a2 = new A();
		System.out.println(a1.equals(a2));
		
		B b1 = new B();
		Object b2 = new B();
		System.out.println(b1.equals(b2));
	}
}

class A 
{
	double radius;
	
	@Override
	public boolean equals(Object a) 
	{
		return this.radius == ((A)a).radius;
	}

}


class B 
{
	double radius;
	
	public boolean equals(B b) 
	{
		return this.radius == b.radius;	
	}

}
