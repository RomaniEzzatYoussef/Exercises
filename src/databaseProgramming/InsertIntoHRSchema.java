package databaseProgramming;

import java.util.Scanner;

import oracle.jdbc.OracleDriver;

import java.sql.*;

public class InsertIntoHRSchema 
{
	static Scanner input = new Scanner(System.in);
	
	public static void main(String[] args)
	{
		
		System.out.println("Operations" 
				+ "\n\t1 Search"
				+ "\n\t2 Insert New Employee");
		System.out.print("Enter number of the operation: ");
		int operation = input.nextInt();
		
		if (operation == 1)
		{
			doQuering();
		}
		
		else if (operation == 2)
		{
			doInsert();
		}
		
		else
			System.out.println("You Operation is not in the list.");
		
		
		input.close();
	}
	
	public static void doInsert()
	{
		System.out.print("How Many Employees you will add: ");
		int num = input.nextInt();
		
		for (int i = 0; i < num; i++)
		{
			System.out.println("Enter details for new employee:");
			
			try 
			{
				DriverManager.registerDriver(new OracleDriver());
				Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "hr", "hr");
				
				Statement st = con.createStatement();
				
				String sql = "select max(employee_id)+1 from employees";
				ResultSet rs = st.executeQuery(sql);
				
				int employeeId = 0;
				
				if (rs.next())
				{
					employeeId = rs.getInt(1);
					System.out.println("\tEmployee ID: " + employeeId);
				}
				else
					employeeId = 1;
				
				System.out.print("\tFirst Name (Romani):");
				String firstName = input.next();
				
				System.out.print("\tLast Name (Ezzat):");
				String lastName = input.next();
				
				System.out.print("\tEmail (email@gmail.com):");
				String email = input.next();
				
				System.out.print("\tPhone Number (012012):");
				String phone = input.next();
				
				System.out.print("\tHire Date(07-JUL-02):");
				String hireDate = input.next();
				
				if (hireDate == "00")
					hireDate = null;
				
				System.out.print("\tJob ID (ST_CLERK):");
				String jobId = input.next();
				
				if (jobId == "00")
					jobId = null;
				
				System.out.print("\tSalary (12000):");
				String salary = input.next();
				
				System.out.print("\tCommission PCT (0.20):");
				String commissionPct = input.next();
				
				System.out.print("\tManager ID (100):");
				String managerId = input.next();
				
				System.out.print("\tDepartment ID (50):");
				String departmentId = input.next();
				
				
				Statement sta = con.createStatement();
				String s = "insert into employees values ('" + employeeId + "' , '" + firstName + "' , '" + lastName 
						+ "' , '" + email + "' , '" + phone + "' , '" + hireDate + "' , '" + jobId + "' , '" 
						+ salary + "' , '" + commissionPct + "' , '" + managerId + "' , '" + departmentId + "' )";			
				
				int c = st.executeUpdate(s);
				
				if (c == 1)
					System.out.println("A new Employee has been created..");
				
				else
					System.out.println("There is a problem");
				
				rs.close();
				sta.close();
				st.close();
				con.close();
			
			    System.out.println();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
	}
	
	public static void doQuering()
	{
		System.out.print("Search By: "
				+ "\n\t\t1 Employee ID"
				+ "\n\t\t2 Last Name"
				+ "\n\t\t3 Salary"
				+ "\nEnter the search number: ");
		int searchNumber = input.nextInt();
		
		String searchColumn = "";
		String searchValue = "";
		
		if (searchNumber == 1)
		{	
			searchColumn = "employee_id";
			
			System.out.print("Enter Employee ID: ");
			searchValue = input.next();
			
		}
		
		else if (searchNumber == 2)
		{	
			searchColumn = "last_name";
			
			System.out.print("Enter Last Name: ");
			searchValue = input.next();
		}
		
		else if (searchNumber == 3)
		{	
			searchColumn = "salary";
			
			System.out.print("Enter Salary: ");
			searchValue = input.next();
		}
			
		else
			System.out.println("Your Search Number is wrong.");
		
		
		try 
		{
			DriverManager.registerDriver(new OracleDriver());
			Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "hr", "hr");
			
			Statement st = con.createStatement();
			
			if (searchNumber == 1 || searchNumber == 2 || searchNumber == 3)
			{
				String sql = "select * from employees where " + searchColumn + " like  '%" +  searchValue + "%'";
				ResultSet rs = st.executeQuery(sql);
				
				
				String[][] t = new String[30][11];
				
				t[0][0] = "employee_id";
				t[0][1] = "first_name";
				t[0][2] = "last_name";
				t[0][3] = "email";
				t[0][4] = "phone_number";
				t[0][5] = "hire_date";
				t[0][6] = "job_id";
				t[0][7] = "salary";
				t[0][8] = "commission_pct";
				t[0][9] = "manager_id";
				t[0][10] = "department_id";
				
				t[1][0] = "----------------------";
				t[1][1] = "----------------------";
				t[1][2] = "----------------------";
				t[1][3] = "----------------------";
				t[1][4] = "----------------------";
				t[1][5] = "----------------------";
				t[1][6] = "----------------------";
				t[1][7] = "----------------------";
				t[1][8] = "----------------------";
				t[1][9] = "----------------------";
				t[1][10] = "----------------------";
				
				
				
				while (rs.next())
				{
						int x = 1;
						int rr = rs.getRow() + 1;
						
						for (int c = 0; c < t[rs.getRow()].length; c++)
						{
							if (x < 12)
							{
								
								t[rr][c] = rs.getString(x);
								x++;
								
								if (t[rr][c] == null)
									t[rr][c] = "  ";
							}
						}
						System.out.println();
					
				}
				
				for (int r = 0; r < t.length; r++)
				{	
					for (int c = 0; c < t[r].length; c++)
					{
						if (t[r][c] == null)
							t[r][c] = "0000";
						else
							System.out.printf("%-22s%s" , t[r][c] , " ");
					}
					System.out.println();
				}
			}
			
			
			st.close();
			con.close();
			
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
	
}
