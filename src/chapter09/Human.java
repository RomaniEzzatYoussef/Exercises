package chapter09;
/**
 *
 * 13/12/2017   5:52:18 PM
 *  
 * @author roman
 *
 *
 * Human
 *
 */
public class Human 
{
	private String name = "Baby";
	private int age = 1;
	private String sex = "Male";
	private String status = "Single";
	private String mode = "happy";

	public Human()
	{
		
	}
	
	public Human(String name)
	{
		this.name = name;
	}
	
	public void setName(String name) 
	{
		this.name = name;
	}

	public void setAge(int age) 
	{
		this.age = age;
	}

	public void setSex(String sex) 
	{
		this.sex = sex;
	}
	
	public String getStatus() 
	{
		return status;
	}

	public void setStatus(String status) 
	{
		this.status = status;
	}

	public String getMode() 
	{
		return mode;
	}

	public void setMode(String mode) 
	{
		this.mode = mode;
	}

	public String getName() 
	{
		return name;
	}

	public int getAge() 
	{
		return age;
	}

	public String getSex() 
	{
		return sex;
	}
	
	public static void main(String[] args) 
	{
		Human baby = new Human("Massu");
		baby.setAge(10);
		System.out.println("Name: " + baby.getName() + " and Age: " + baby.age);
		
		Human romani = new Human("Romani Ezzat");
		romani.setAge(22);
		romani.setMode("Singing");
		romani.setSex("Male");
		romani.setStatus("Eggs");
		System.out.println("Name: " + romani.getName() + " , Age: " + romani.getAge() + " , Mode: " + romani.mode + " , Sex: " + romani.getSex() + " and Status: " + romani.status);
		
		System.out.println("Name: " + new Human("Sarah").getName());
	}

}
