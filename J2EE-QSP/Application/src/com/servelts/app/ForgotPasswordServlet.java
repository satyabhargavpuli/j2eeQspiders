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
@WebServlet("/FORGOTPASSWORD")
public class ForgotPasswordServlet extends GenericServlet{
	static String phno,password,cnfpassword;
	@Override
	public void service(ServletRequest req, ServletResponse resp) throws ServletException, IOException {

		 phno=req.getParameter("PHONENUMBER");
		 password=req.getParameter("PASSWORD");
		 cnfpassword=req.getParameter("CONFIRM-PASSWORD");
		 PrintWriter out = resp.getWriter();
		 out.print("<body>");
		 if(password.equals(cnfpassword))
		 {
		 JdbcClass.forgotPasswordJdbc();
		 out.print("<h2>");
		 out.print("password changed sucessfull");
		 out.print("</h2>");
		 }
		 else {
			 out.print("<h2>");
			 out.print("please  re-check entered details");
			 out.print("</h2>");
		}
		 out.print("</body>");
		 out.close();
	}
	
}
