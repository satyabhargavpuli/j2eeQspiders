package com.servlet.app;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.GenericServlet;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebInitParam;
import javax.servlet.annotation.WebServlet;

/**
 * Servlet implementation class MobileServlet
 */
@WebServlet(
		urlPatterns = { "/MobileServlet" }, 
		initParams = { 
				@WebInitParam(name = "mobile", value = "80")
		})
public class MobileServlet extends GenericServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see GenericServlet#GenericServlet()
     */
    public MobileServlet() {
        super();
        // TODO Auto-generated constructor stub	
    }

	/**
	 * @see Servlet#service(ServletRequest request, ServletResponse response)
	 */
	public void service(ServletRequest request, ServletResponse response) throws ServletException, IOException {
     ServletConfig config=getServletConfig();
     String Mob_off=config.getInitParameter("mobile");
     PrintWriter out=response.getWriter();
     out.print("<body>");
     out.print("<center>");
     out.print("<h1>offer:upto"+ Mob_off +"off</h1>");
     out.print("<center>");
     out.print("<a href='Home.html'>home page</a>");
     out.print("</body>");

		
	}

}
