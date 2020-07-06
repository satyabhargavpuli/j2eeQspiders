package org.currency.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;
@WebServlet("/dollartoruppes")
public class DollarToRuppesConverter extends GenericServlet{

	@Override
	public void service(ServletRequest req, ServletResponse resp) throws ServletException, IOException {

		String dollar=req.getParameter("Dollars");
		int convertedruppes=Integer.parseInt(dollar);
		  double rupees=convertedruppes*70.0;
		System.out.println("Dollar converted to rupees is"+rupees);
		PrintWriter out=resp.getWriter();
		out.print("Dollar converted to rupees is" +rupees);
	}

	
	
}
