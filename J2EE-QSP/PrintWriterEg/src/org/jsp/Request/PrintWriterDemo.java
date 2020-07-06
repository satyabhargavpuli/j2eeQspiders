package org.jsp.Request;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.*;

import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;
@WebServlet("/printing")
public class PrintWriterDemo extends GenericServlet{
String mail,num,pswd,cnfmpswd;
	@Override
	public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException,NullPointerException {
     mail=req.getParameter("Email");
     num=req.getParameter("MOBILE-NUMBER");
     pswd=req.getParameter("PASSWORD");
     cnfmpswd=req.getParameter("CONFIRM-PASSWORD");
    
     PrintWriter out=res.getWriter();
	//	out.print("<body>");

     if (pswd.equals(cnfmpswd)) {
    	 try {
    		// out.print("<h1>" );
    	   	//    out.print("<center>");
    			out.print("password sucessfull");
    	   	 //   out.print("</center>");
    		//	out.print("</h1>" );
			jdbcCode();
		}
		catch (SQLException|ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
     else {
    	/* out.print("<h1>" );
    	 out.print("<center>");*/
 		 out.print("password failure");
   	   //  out.print("</center>");

 	//	out.print("</h1>" );
	}
     
	//	out.print("</body>");

	}
	public void jdbcCode() throws ClassNotFoundException, SQLException
	{
		Class.forName("com.mysql.jdbc.Driver");
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306?user=root&password=tiger");
		PreparedStatement ps=con.prepareStatement("insert into registration.printwriter values(?,?,?)");
	     ps.setString(1, mail);
	     ps.setString(2, num);
	     ps.setString(3, pswd);
	     ps.executeUpdate();
	     con.close();
	     ps.close();
	}

}
