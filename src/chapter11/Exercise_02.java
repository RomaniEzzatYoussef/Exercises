package chapter11;

import chapter10.MyDate;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.StackPane;
import javafx.scene.text.Font;
import javafx.stage.Stage;

/**
 * * The Person, Student, Employee, Faculty, and Staff classes
 * Design a class named Person and its two subclasses named Student and Employee. 
 * Make Faculty and Staff subclasses of Employee. A person has a name, address, phone number, and email address. 
 * A student has a class status (freshman, sophomore, junior, or senior). 
 * Define the status as a constant. 
 * An employee has an office, salary, and date hired. 
 * Use the MyDate class defined in Programming Exercise 10.14 to create an object for date hired. 
 * A faculty member has office hours and a rank. 
 * A staff member has a title. 
 * Override the toString method in each class to display the class name and the person’s name. 
 * Write a test program that creates a Person, Student, Employee, Faculty, and Staff, and invokes their toString() methods.
 * 
 * 01/05/2019   8:02:45 PM
 *  
 * @author Romani Ezzat
 *
 *
 * Exercise_02
 *
 */
public class Exercise_02 extends Application
{
	static String message = "";
	
	/**
	 * @param args
	 */
	public static void main(String[] args) 
	{
		Person romani = new Staff("Developer");
		romani.name = "Romani Ezzat";
		
		message = "Staff class: " + romani.toString();
		
		romani = new Employee();
		message += "\nEmployee class: " + romani.toString();
		
		romani = new Studentt();
		message += "\nStudent class: " + romani.toString();
		
		romani = new Faculty();
		message += "\nFaculty class: " + romani.toString();
		
		Application.launch(args);
	}
	
	public String getMessage()
	{
		return message;
	}

	@Override
	public void start(Stage primaryStage) throws Exception 
	{
		
		Label label = new Label(getMessage());
		label.setFont(new Font(30));
		label.setStyle("-fx-border-color: black; -fx-text-fill: blue; -fx-background-color: aqua; -fx-font-weight: bold;");
		
		StackPane pane = new StackPane();
		pane.getChildren().add(label);
		pane.setStyle("-fx-background-color: aqua;");
		Scene scene = new Scene(pane);
		primaryStage.setScene(scene);
		primaryStage.setTitle("Chapter_11----Exercise_02");
		primaryStage.show();
		
	}

}

class Person
{
	protected String name;
	protected String address;
	protected String phoneNumber;
	protected String email;
	
	public Person()
	{
		this("Kevin", "NY", "1-347-123-4567", "generic@email.com");
	}
	
	public Person(String name, String address, String phoneNumber, String email)
	{
		this.name = name;
		this.address = address;
		this.phoneNumber = phoneNumber;
		this.email = email;
	}
	
	public String getName()
	{
		return name;
	}
	
	@Override
	public String toString()
	{
		return "Name: " + name
				+ "\nAddress: " + address
				+ "\nPhone#: " + phoneNumber
				+ "\nEmail address: " + email;
	}
}

class Studentt extends Person
{
	public static int FRESHMAN = 1;
	public static int SOPHMORE = 2;
	public static int JUNIOR = 3;
	public static int SENIOR = 4;
	
	protected int status;
	
	public Studentt()
	{
		this(1);
	}
	
	public Studentt(int status)
	{
		this.status = status;
	}
	
	public void setStatus(int status)
	{
		this.status = status;
	}
	
	@Override
	public String toString()
	{
		return (status == 1) ? getName() + " is a freshman."
			: (status == 2) ? getName() + " is a sophmore." 
			: (status == 3) ? getName() + " is a junior."
			: getName() + " is a senior.";
	}
}

class Employee extends Person
{
	protected String office;
	protected double salary;
	protected MyDate dateHired;
	
	public Employee()
	{
		this("Brooklyn", 75500.75 , new MyDate());
	}
	
	public Employee(String office, double salary, MyDate dateHired)
	{
		this.office = office;
		this.salary = salary;
		this.dateHired = dateHired;
	}
	
	public String getOffice()
	{
		return office;
	}
	
	@Override
	public String toString()
	{
		return "Office: " + office
				+ "\nSalary: $" + salary
				+ "\nDate Hired: " + dateHired
				+ "\n" + super.toString();	
	}
	
}

class Faculty extends Employee
{
	public static int LECTURER = 1;
	public static int ASSISTANT_PROFESSOR = 2;
	public static int ASSOCIATE_PROFESSOR = 3;
	public static int PROFESSOR = 4;
	
	protected String officeHours;
	protected int rank;
	
	public Faculty()
	{
		this("9AM - 5PM", 1);
	}
	
	public Faculty(String officeHours, int rank)
	{
		this.officeHours = officeHours;
		this.rank = rank;
	}
	
	public String getRank()
	{
		return (rank == 1) ? "Lecturer "
				: (rank == 2) ? "Assistant Professor "
						: (rank == 3) ? "Associate Professor "
								: "Professor ";
	}
	
	@Override
	public String toString()
	{
		return getRank() + getName() + " work from " + officeHours + " in " + getOffice(); 
	}
	
}

class Staff extends Employee
{
	protected String title;
	
	public Staff()
	{
		this("Janitor");
	}
	
	public Staff(String title)
	{
		this.title = title;
	}
	
	public String getTitle()
	{
		return title;
	}
	
	public void setTitle(Faculty emp)
	{
		emp = new Faculty();
		this.title = emp.getRank();
	}
	
	public String toString()
	{
		return getName() + "'s title is " + getTitle();
	}
	
}
