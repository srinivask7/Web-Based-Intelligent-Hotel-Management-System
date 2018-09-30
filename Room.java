package homePage;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.*;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;







/**
 * Servlet implementation class Room
 */
@WebServlet("/Room")
public class Room extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Room() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
        String ps=request.getParameter("pass"); // gets the value from a jsp page
		try
	    {
	    
	      String myDriver = "com.mysql.jdbc.Driver";
	      String myUrl = "jdbc:mysql://localhost/Booking"; 
	      Class.forName(myDriver);
	      String msg="";
	      Connection conn = DriverManager.getConnection(myUrl, "root", ""); //connects to the database
	      String query="select RoomKey from Booking_Infoo"; // selects the RoomKey from the specifed table name
	      Statement statement = conn.createStatement();
	      ResultSet result = statement.executeQuery(query);
	      while(result.next())
	      {
	    	   //gets the username and password from the user and checks in the database
	    	  String Password=result.getString("RoomKey");
	    	  
	    	  if(ps.equals(Password)) //if the user name is correct then next page it loads
	    	  {
	    		  request.getRequestDispatcher("/Room.jsp").forward(request, response);
	    	  }
	    
	    	  
	    	  else
	    	  {
	    		  msg="Incorrect password";
	    		  response.setContentType("text/html");
	    		  PrintWriter out=response.getWriter();
	    		  out.println("<font size='6' color='red'>"+msg+ "</font>");	    		  		
	    	  }
	    		  
	      }
	    }
		catch (Exception e)
	    {
	      System.err.println("Got an exception!");
	      System.err.println(e.getMessage());
	    }
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		
		
	}
	

}
