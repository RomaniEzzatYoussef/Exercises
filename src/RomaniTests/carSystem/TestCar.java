package RomaniTests.carSystem;

import java.util.Scanner;

/**
 *
 * 05/05/2019   1:41:57 PM
 *  
 * @author Romani Ezzat
 *
 *
 * Car
 *
 */
public class TestCar {

	/**
	 * @param args
	 */
	public static void main(String[] args) 
	{
		Scanner input = new Scanner(System.in);
		char choice = ' ';
		System.out.print("Are you want a new car? (Enter Y for yes and N for no): ");
		String userInput = input.nextLine();
		if (userInput.length() >= 1)
		{
			choice = ((userInput).toUpperCase()).charAt(0);
			
			if (choice == 'Y')
			{
				System.out.println("Enter \n\tName:\tModel:\tMax Speed:\tColor:\n\t\t");
				Car bmw = new Car(input.next(), input.next(), input.nextInt(), input.next());
				bmw.printCarInfo();
			}
			
			else if (choice == 'N')
				System.out.println("OK, Thank You..");
			
			else
				System.out.println("Wrong answer, try again!..");
		}
		else
			System.out.println("Wrong Input");
		
		
		
		input.close();
	}

}

class Car
{
	private String name;
	private String model;
	private double price;
	private int maxSpeed;
	private String color;
	private boolean isOn;
	
	public String getName() 
	{
		return name;
	}

	public void setName(String name) 
	{
		this.name = name;
	}
	
	public Car()
	{
		
	}

	public Car(String name, String model, int maxSpeed, String color)
	{
		this.name = name;
		this.model = model;
		this.maxSpeed = maxSpeed;
		this.color =  color;
		
		if (name.toUpperCase().equals("BMW"))
			this.price = 1000000;
		else if (name.toUpperCase().equals("WAGEN"))
			this.price = 7800000;
		else if (name.toUpperCase().equals("AUDI"))
			this.price = 9500000;
		else if (name.toUpperCase().equals("MERECEDES"))
			this.price = 1500000;
		else
			this.price = 500000;
		
		
	}
	
	public  void printCarInfo()
	{
		System.out.println("Your Car is " + name + ", model " + model + ", Max Speed " 
				+ maxSpeed + "km/h, color " + color + " and the price is: " + price);
	}

	public String getModel() 
	{
		return model;
	}
	
	public void setModel(String model) 
	
	{
		this.model = model;
	}
	
	public double getPrice() 
	{
		return price;
	}
	
	public void setPrice(double price) 
	{
		this.price = price;
	}

	public int getMaxSpeed() 
	{
		return maxSpeed;
	}

	public void setMaxSpeed(int maxSpeed) 
	{
		this.maxSpeed = maxSpeed;
	}

	public String getColor() 
	{
		return color;
	}

	public void setColor(String color) 
	{
		this.color = color;
	}

	public boolean isOn() 
	{
		return isOn;
	}

	public void setOn(boolean isOn) 
	{
		this.isOn = isOn;
	}

	
	
	
	
	
	
}
