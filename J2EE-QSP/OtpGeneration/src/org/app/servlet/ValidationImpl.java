package org.app.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;
@WebServlet("/Reenteringotp")
public class ValidationImpl extends GenericServlet {

	OtpGenerationImpl n1=new OtpGenerationImpl();
    int ot=OtpGenerationImpl.otp;
	@Override
	public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
    		String otp1 = req.getParameter("otpNum");
    		int otpval=Integer.parseInt(otp1);
    		
    		PrintWriter out=res.getWriter();
    		out.print("<body>");
    		out.print("<center>");
    		if (ot==otpval) {
    			
    			out.print("<table>");
    			out.print("<td>");
				out.print("otp is valid");
				out.print("</td>");
				out.print("</table>");
			}
    		else {
    			out.print("<table>");
    			out.print("<td>");
				out.print("otp is invalid");
				out.print("</td>");
				out.print("</table>");
					
			}
    		out.print("</body>");
    		
    		out.print("</center>");
    		out.close();
	}

}
