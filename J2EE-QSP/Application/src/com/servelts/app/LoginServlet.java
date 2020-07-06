package com.servelts.app;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.*;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
@WebServlet("/LOGINPAGE")
public class LoginServlet extends HttpServlet {
static String username,password;

	@Override
protected void doPost(HttpServletRequest req, HttpServletResponse resp)
		throws ServletException, IOException 
{

  username=req.getParameter("USERNAME");
 password=req.getParameter("PASSWORD"); 
 PrintWriter out = resp.getWriter();
 out.print("<body>");
 out.print("<h2 align=center>");
 out.print("login sucessfull");
 out.print("welcome" +""+"loginJdbc.name1");
 out.print("</h2>");
  out.print("</body>");
 JdbcClass.loginJdbc();

}

}
