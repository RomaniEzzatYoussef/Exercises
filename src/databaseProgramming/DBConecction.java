package databaseProgramming;

import java.sql.*;

import oracle.jdbc.OracleDriver;

public class DBConecction 
{
	public static void main(String[] args)
	{
		System.out.print("aaaaaaaaa");
		try {
			DriverManager.registerDriver(new OracleDriver());
			
			
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
