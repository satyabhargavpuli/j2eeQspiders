package org.jsp.app;

import java.io.IOException;
import java.sql.*;
import javax.servlet.*;
import javax.servlet.annotation.WebServlet;
@WebServlet("/first")
public class RegPage extends GenericServlet {
String fname,lname,username,gender,mailid,password,phno;
int d,agee;
	@Override
	public void service(ServletRequest request, ServletResponse response) throws ServletException, IOException {
     		 fname = request.getParameter("FIRSTNAME");
     		 lname = request.getParameter("LASTNAME");
     		 username=request.getParameter("USERNAME");
     		String dob=request.getParameter("DOB");
     		 d=Integer.parseInt(dob);
             phno=request.getParameter("PHNO");
             gender=request.getParameter("GENDER");
            String age=request.getParameter("AGE");
     		 agee=Integer.parseInt(age);
             mailid=request.getParameter("MAILID");
             password=request.getParameter("PASSWORD");
             try {
				jdbc();
			} catch (ClassNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	
	}
	public void jdbc() throws ClassNotFoundException
	{
		Class.forName("com.mysql.jdbc.Driver");
		try {
			Connection con= DriverManager.getConnection("jdbc:mysql://localhost:3306?user=root&password=tiger");
		    PreparedStatement pstmp=con.prepareStatement("insert into registration.regtable values(?,?,?,?,?,?,?,?,?)");
		    pstmp.setString(1, fname);
		    pstmp.setString(2, lname);
		    pstmp.setString(3, username);
		    pstmp.setInt(4, d);
		    pstmp.setString(5, phno);
		    pstmp.setString(6, gender);
		    pstmp.setInt(7, agee);
		    pstmp.setString(8, mailid);
		    pstmp.setString(9, password);
		    pstmp.executeUpdate();
		   System.out.println("<body>");
		  		   pstmp.close();
		    con.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

}
