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
 * Servlet implementation class AddRegistration
 */
@WebServlet("/AddRegistration")
public class AddRegistration extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public AddRegistration() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		String fname=request.getParameter("firstname"); //gets the values from the user
		String lname=request.getParameter("lastname");
		String email=request.getParameter("email");
		
		String pass=request.getParameter("password");

		System.out.println("-------- MySQL JDBC Connection Demo ------------");
		
		 try
		    {
		      // create a mysql database connection
		      String myDriver = "com.mysql.jdbc.Driver";
		      String myUrl = "jdbc:mysql://localhost/Hotel_Login";
		      Class.forName(myDriver);
		      
		      Connection conn = DriverManager.getConnection(myUrl, "root", "");
		      
		     
		      String query = " insert into Details (First_name,Last_name,Email,Password)"
		    	        + " values (?, ?, ?, ?)";//insert the values in the database
		      PreparedStatement preparedStmt = conn.prepareStatement(query);
		      preparedStmt.setString (1, fname);
		      preparedStmt.setString (2, lname);
		      preparedStmt.setString (3, email);
		    
		     
		      preparedStmt.setString (4, pass);
		      
		      preparedStmt.execute();
		      System.out.println("data inserted");
		      
		      request.getRequestDispatcher("/Register_Success.jsp").forward(request, response);
		      
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
