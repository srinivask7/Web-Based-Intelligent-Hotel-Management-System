package homePage;

import java.sql.*;


public class Registration 
{
 
  public static void main(String[] args)
  { 
	  try { 
	  
  
  	Connection connection = DriverManager.getConnection("jdbc:mysql://localhost", "root", ""); // connects the jdbc to the local server
    
    Statement statement = connection.createStatement();
    // create the DB .. 
    statement.execute("CREATE DATABASE Hotel_Login" )  ; //creates the database for the Application
    System.out.println("database created");
    
      
      // create the DB .. 
     
      
	  }
	  catch (SQLException e) {
          // TODO Auto-generated catch block
		  System.err.println(e.getMessage());
      }
    try
    {
      // create a mysql database connection
      String myDriver = "com.mysql.jdbc.Driver";
      String myUrl = "jdbc:mysql://localhost/Hotel_Login";
      Class.forName(myDriver); //checks for the mysql driver in the project  
      System.out.println("driver present");	
      Connection conn = DriverManager.getConnection(myUrl, "root", "");
      Statement statement = conn.createStatement();
      
	  String sql="create table Details (Customer_id int  auto_increment not null,First_name varchar(32) not null,"
	  		+ "Last_name varchar(32) not null,Email varchar(32) not null,"
	  		+ "Password varchar(32) not null,"
	  		+ "primary key (Customer_id))";//creates a table
	  statement.execute(sql )  ;
	
	  System.out.println("table created");
    }
      // create the DB .. 
	  catch (Exception e)
	    {
	      System.err.println("Got an exception!");
	      System.err.println(e.getMessage());
	    }
  
   
      
  }
}