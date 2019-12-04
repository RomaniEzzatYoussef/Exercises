package chapter12;

import java.awt.print.Book;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

/**
 *
 * 19/07/2019   5:40:37 PM
 *  
 * @author Romani Ezzat
 *
 *
 * SQLiteJDBCDriverConnection
 *
 */
  
 public class SQLiteJDBCDriverConnection 
 {
    
	 private ArrayList<String> bookList = new ArrayList<>();
	 
	 
     public SQLiteJDBCDriverConnection() 
     {
    	 bookList.add("\n");
    	 Connection conn = null;
         try {
             // db parameters
             String url = "jdbc:sqlite:C:/Users/Romani Ezzat/Desktop/db new/db/MyBooksDB.db";
             // create a connection to the database
             conn = DriverManager.getConnection(url);
             
             System.out.println("Connection to SQLite has been established.");
             
             
           //step3 create the statement object  
 			Statement stmt = conn.createStatement();  

 			//step4 execute query  
 			ResultSet rs = stmt.executeQuery("select * from books");  
 			
 			while(rs.next()) 
 			{
 				bookList.add(rs.getString(1) + "-" + rs.getString(3) + "  ");
 			}	
             
             
         } catch (SQLException e) {
             System.out.println(e.getMessage());
         } finally {
             try {
                 if (conn != null) {
                     conn.close();
                 }
             } catch (SQLException ex) {
                 System.out.println(ex.getMessage());
             }
         }
     }
     
	public ArrayList<String> getBookList() 
	{
		return bookList;
	}
	
	public void setBookList(ArrayList<String> bookList) 
	{
		this.bookList = bookList;
	}
 }