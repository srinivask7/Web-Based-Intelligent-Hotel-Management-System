package homePage;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Booking_Details
 */
@WebServlet("/Booking_Details")
public class Booking_Details extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Booking_Details() {
        super();
        // TODO Auto-generated constructor stub
    }
    
	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String checkIn=request.getParameter("checkin"); //gets the values from the user
		String checkOut=request.getParameter("checkout");
		String room=request.getParameter("room");
		String adults=request.getParameter("adults");
		String childrens=request.getParameter("childrens");
		String fname=request.getParameter("fname");
		String lname=request.getParameter("lname");
		String email=request.getParameter("email");
		String mobile=request.getParameter("mobile");
		String address=request.getParameter("address");
		String Nationality=request.getParameter("Nationality");
		String RoomKey=request.getParameter("RoomKey");
		System.out.println("-------- MySQL JDBC Connection Demo ------------");
		int y = Integer.parseInt(room);
		int sum=0;
		sum=sum+y;
		if(sum<10)
		{
		
		 try
		    {
		      // create a mysql database connection
		      String myDriver = "com.mysql.jdbc.Driver";
		      String myUrl = "jdbc:mysql://localhost/Booking";
		      Class.forName(myDriver);
		      
		      Connection conn = DriverManager.getConnection(myUrl, "root", "");
		      
		     
		      String query = " insert into Booking_Infoo (CheckIn,CheckOut,Room,Adults,Childrens,First_name,Last_name,Email,"
		      		+ "Mobile,Address,Nationality,RoomKey)"
		    	        + " values (?, ?, ?, ?,?,?,?,?,?,?,?,?)";//insert the values in the database
		      PreparedStatement preparedStmt = conn.prepareStatement(query);
		      preparedStmt.setString (1, checkIn);
		      preparedStmt.setString (2, checkOut);
		      preparedStmt.setString (3, room);
		      preparedStmt.setString (4, adults);
		      preparedStmt.setString (5, childrens);
		      preparedStmt.setString (6, fname);
		      preparedStmt.setString (7, lname);
		      preparedStmt.setString (8, email);
		      preparedStmt.setString (9, mobile);
		      preparedStmt.setString (10, address);
		      preparedStmt.setString (11, Nationality);
		      preparedStmt.setString (12, RoomKey);
		      preparedStmt.execute();
		      System.out.println("data inserted");
		      
		      request.getRequestDispatcher("/Payment.jsp").forward(request, response);
		    }
		    catch (Exception e)
		    {
		      System.err.println("Got an exception!");
		      System.err.println(e.getMessage());
		    }
	}
		else{
			request.getRequestDispatcher("/roomUnavailable.jsp").forward(request, response);
		}
	}
	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	}

}
