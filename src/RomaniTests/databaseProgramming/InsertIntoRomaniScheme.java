package RomaniTests.databaseProgramming;

import java.sql.*;
import java.util.Scanner;

import oracle.jdbc.OracleDriver;

public class InsertIntoRomaniScheme
{
    public static Scanner input = new Scanner(System.in);
    
	public static void main(String[] args) 
	{
		
		System.out.println("Operations" 
				+ "\n\t1 Search"
				+ "\n\t2 Insert New User");
		
		System.out.print("Enter number of the operation: ");
		int operation = input.nextInt();
		
		if (operation == 1)
		{
			searchByName();
		}
		
		else if (operation == 2)
		{
			insertUsers();
		}
		
		input.close();
	}
	
	
	public static void searchByName()
	{
		System.out.print("Search By First Name: ");
		String searchByFN = input.next();
		
		try {
			DriverManager.deregisterDriver(new OracleDriver());
			Connection conn = DriverManager.getConnection("jdbo:oracle:thin:@localhost:1521:xe", "romani", "r");
			Statement st = conn.createStatement();
			
			String sql = "select * from users where lower(first_name) like '%" + searchByFN + "%'";
			
			ResultSet rs = st.executeQuery(sql);
			
			
			while (rs.next())
			{
				System.out.print(rs.getString(2));
			}
			
		} 
		
		catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	
	public static void insertUsers()
	{
		System.out.print("How many student you will enter: ");
		int num = input.nextInt();
		
		for (int i = 0; i < num; i++)
		{
			System.out.println("Enter details for new user:");
			
			try {
				DriverManager.registerDriver(new OracleDriver());
				Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "romani", "r");
				Statement sta = con.createStatement();
				
				String s = "select max(id)+1 from users";
				
				ResultSet rs = sta.executeQuery(s);
				
				int id = 0;
				
				if (rs.next())
				{
					id = rs.getInt(1);
					System.out.println("\tID: " + id);
				}
				else
					id = 1;
				
				
				
				System.out.print("\tFirst Name:");
				String firstName = input.next();
				
				System.out.print("\tLast Name:");
				String lastName = input.next();
				
				System.out.print("\tPhone Number:");
				String phone = input.next();
				
				System.out.print("\tEmail:");
				String email = input.next();
				
				System.out.print("\tPassword:");
				String password = input.next();
				
				Statement st = con.createStatement();
				String sql = "insert into users values ('" + id + "' , '" + firstName + "' , '" + lastName + "' , '" + phone + "' , '" + email + "' , '" + password + "' )";			
				
				int c = st.executeUpdate(sql);
				
				if (c == 1)
					System.out.println("A new user has been created..");
				
				else
					System.out.println("There is a problem");
				
				rs.close();
				sta.close();
				st.close();
				con.close();
			
			System.out.println();
				
			}
			
			catch (SQLException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}	
		}
		
	}
}
