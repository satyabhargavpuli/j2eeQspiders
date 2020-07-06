package com.servelts.app;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;
@WebServlet("/REGISTRATION")
public class RegisterServlet extends GenericServlet {
 static String name,phno,username,password,confirmpwd;
	@Override
	public void service(ServletRequest req, ServletResponse resp) throws ServletException, IOException {
		
		 name=req.getParameter("NAME");
		 phno=req.getParameter("PHONENUMBER");
		 username=req.getParameter("USERNAME");
		 password=req.getParameter("PASSWORD");
		 confirmpwd=req.getParameter("CONFIRM-PASSWORD");
		 PrintWriter out = resp.getWriter();
		 out.print("<body>");
		 out.print("<h2>");
		 out.print("registration sucessfull");
		 out.print("</h2>");
		 out.print("<a href='login.html'>Registration sucessfull");
		 out.print("</body>");
		 JdbcClass.registerJdbc();
		 out.close();
	}
	

}
