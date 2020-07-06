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
 * Servlet implementation class ClothServlet
 */
@WebServlet(
		urlPatterns = { "/ClothServlet" }, 
		initParams = { 
				@WebInitParam(name = "cloth", value = "50")
		})
public class ClothServlet extends GenericServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see GenericServlet#GenericServlet()
     */
    public ClothServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see Servlet#service(ServletRequest request, ServletResponse response)
	 */
	public void service(ServletRequest request, ServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		ServletConfig config=getServletConfig();
	     String Cloth_serv=config.getInitParameter("cloth");
	     PrintWriter out=response.getWriter();
	     out.print("<body>");
	     out.print("<center>");
	     out.print("offer:upto"+ Cloth_serv +"off");
	     out.print("<center>");
	     out.print("<a href= 'Home.html'>home page</a>");
	     out.print("</body>");
	}

}
