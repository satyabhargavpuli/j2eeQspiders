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
 * Servlet implementation class BookServlet
 */
@WebServlet(
		urlPatterns = { "/BookServlet" }, 
		initParams = { 
				@WebInitParam(name = "book", value = "70")
		})
public class BookServlet extends GenericServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see GenericServlet#GenericServlet()
     */
    public BookServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see Servlet#service(ServletRequest request, ServletResponse response)
	 */
	public void service(ServletRequest request, ServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		ServletConfig config=getServletConfig();
	     String Book_Serv=config.getInitParameter("book");
	     PrintWriter out=response.getWriter();
	     out.print("<body>");
	     out.print("<center>");
	     out.print("offer:upto"+ Book_Serv +"off");
	     out.print("<center>");
	     out.print("<a href='Home.html'>home page</a>");
	     out.print("</body>");
	}

}
