package org.jsp.login;

import java.io.IOException;
import java.sql.*;

import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;
@WebServlet("/lOGIN")
public class LoginServlet extends GenericServlet{
String name,password;
	@Override
	public void service(ServletRequest request, ServletResponse response) throws ServletException, IOException {
    		 name=request.getParameter("USERNAME");
    		 password=request.getParameter("PASSWORD");
	}
    public void loginJdbc() throws ClassNotFoundException
    {
	Class.forName("org.mysql.jdbc.Driver");
	try {
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306?user=root&password=tiger");
		PreparedStatement pst=con.prepareStatement("select username,password from registration.regtable where mailid=?");
       
		ResultSet rs= pst.executeQuery();
       // rs.getString();
	} catch (SQLException e) {
		e.printStackTrace();
	}
	
    }
}
