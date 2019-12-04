package chapter12;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

/**
 *
 * 19/07/2019   5:36:13 PM
 *  
 * @author Romani Ezzat
 *
 *
 * OracleCon
 *
 */
public class OracleCon {

	/**
	 * @param args
	 */
	public static void main(String[] args) 
	{
		try{  
			//step1 load the driver class  
			Class.forName("oracle.jdbc.driver.OracleDriver");  
  
			//step2 create  the connection object  
			Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","hr","hr");  
  
			//step3 create the statement object  
			Statement stmt = con.createStatement();  
  
			//step4 execute query  
			ResultSet rs=stmt.executeQuery("select * from employees");  
			while(rs.next())  
				System.out.println(rs.getInt(1)+"  "+rs.getString(2)+"  "+rs.getString(3));  
  
			//step5 close the connection object  
			con.close();  
  
		}
		catch(Exception e)
		{
			System.out.println(e);
		}  

	}

}
