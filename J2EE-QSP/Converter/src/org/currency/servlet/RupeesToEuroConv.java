package org.currency.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.*;
import javax.servlet.annotation.WebServlet;
@WebServlet("/akshith")
public class RupeesToEuroConv extends GenericServlet 
{

	@Override
	public void service(ServletRequest req, ServletResponse resp) throws ServletException, IOException 
	{
	 String s1=req.getParameter("Rupees");
	 int i1=Integer.parseInt(s1);
	 double d1=i1*81.27;
	 System.out.println(d1);
	 PrintWriter pw=resp.getWriter();
	 pw.print("Rupees to Euro converted is"+d1);
	 
		
	}

}
