package homePage;

import java.sql.*;


public class Booking 
{
 
  public static void main(String[] args)
  { 
	  try { 
	  
  
  	Connection connection = DriverManager.getConnection("jdbc:mysql://localhost", "root", ""); // connects the jdbc to the local server
    
    Statement statement = connection.createStatement();
    // create the DB .. 
    statement.execute("CREATE DATABASE Booking" )  ; //creates the database for the Application
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
      String myUrl = "jdbc:mysql://localhost/Booking";
      Class.forName(myDriver); //checks for the mysql driver in the project  
      System.out.println("driver present");	
      Connection conn = DriverManager.getConnection(myUrl, "root", "");
      Statement statement = conn.createStatement();
      
	  String sql="create table Booking_Infoo (Booking_id int  auto_increment not null,CheckIn varchar(32) not null,"
	  		+ "CheckOut varchar(32) not null,Room varchar(32) not null,"
	  		+ "Adults varchar(32) not null, Childrens varchar(32) not null,First_name varchar(32) not null,"
	  		+ "Last_name varchar(32) not null,Email varchar(32) not null,"
	  		+ "Mobile varchar(32) not null,Address varchar(32) not null, Nationality varchar(32) not null, RoomKey varchar(32) not null,"
	  		+ "primary key (Booking_id))";//creates a table
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