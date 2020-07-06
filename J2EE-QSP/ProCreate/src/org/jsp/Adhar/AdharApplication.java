package org.jsp.Adhar;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.*;

import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;

@WebServlet("AdharApplication")
public class AdharApplication extends GenericServlet {
	String id;
String fname,lname,gender,country;
int ag;
	@Override
	public void service(ServletRequest request, ServletResponse response) throws ServletException, IOException {
	// response.getWriter();
	  PrintWriter out=response.getWriter();
		String id =  request.getParameter("ID");
		//int aid=Integer.parseInt(id);
	   fname = request.getParameter("FIRSTNAME");
	   lname = request.getParameter("LASTNAME");
	   gender = request.getParameter("GENDER");
	   String   age = request.getParameter("AGE");
	   int ag=Integer.parseInt(age);
	   country=request.getParameter("country");
	  
	  System.out.println(id+""+fname+""+lname+""+gender+""+age+""+country);
	 try {
		jdbcCode();
	} catch (SQLException | ClassNotFoundException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	out.close();
	}
       public void jdbcCode() throws SQLException, ClassNotFoundException
       {
     String url="jdbc:mysql://localhost:3306?user=root&password=tiger";
        String query="insert into values (?,?,?,?,?,?) ";
        Class.forName("com.mysql.jdbc.Driver");
        Connection con=DriverManager.getConnection(url);
        PreparedStatement pstmp=con.prepareStatement(query);
        pstmp.setString(1, id);
        pstmp.setString(2, fname);
        pstmp.setString(3,lname);
        pstmp.setString(4,gender);
        pstmp.setInt(5, ag);
        pstmp.setString(6, country);
        pstmp.executeUpdate();
       }
}
