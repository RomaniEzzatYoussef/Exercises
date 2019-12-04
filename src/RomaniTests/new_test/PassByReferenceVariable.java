package RomaniTests.new_test;

public class PassByReferenceVariable 
{

	public static void main(String[] args) 
	{
		Vectra vectra = new Vectra();
		
		System.out.println("vectra name before method is: " + vectra.name);
		
		printName(vectra);
		
		System.out.println("vectra name after method is: " + vectra.name);
	}
	
	public static void printName(Vectra vectra)
	{
		vectra.name = "Holden Vectra";
		System.out.println("\tVectra name inside method is: " + vectra.name);
	}
	
}

class Vectra {
    
    int id;
    String name = "Opel Vectra";
    int price = 10000;
    
    public Vectra()
    {
    	name = "Opel Vectra";
    }
    
    public Vectra (int id , String name , int price)
    {
    	this.id = id;
    	this.name = name;
    	this.price = price;
    }
}
