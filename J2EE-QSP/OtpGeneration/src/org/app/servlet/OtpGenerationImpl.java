package org.app.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Random;

import javax.servlet.*;
import javax.servlet.annotation.WebServlet;
@WebServlet("/generatingotp")
public class OtpGenerationImpl extends GenericServlet{
String	PrintWriter;
static int otp;
	@Override
	public void service(ServletRequest req, ServletResponse resp) throws ServletException, IOException {
	Random random= new Random();
       //  int num=9999;
         otp=random.nextInt(10000);
         PrintWriter out=resp.getWriter();
            //resp.setContentType("text/html");	
         	out.print("<body>");
         	out.print("<center>");
         	out.print("<br><br>");
         	out.print("<h1>Re enter the otp</h1>");
         	out.print("<hr width=150>");
         	out.print("Otp is "+otp);
         	out.print("<br>");
         	out.print("<form action=\"Reenteringotp\">"); 
         	out.print("Re enter the above otp:<input type=\"text\" name=\"otpNum\">");  
         	out.print("<input type=\"submit\" value=\"click me\">");  
         	out.print("</center>"); 
         	out.print("</form>"); 
         	out.print("</body>");
         	out.close();
	}

}
