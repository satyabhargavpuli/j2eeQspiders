package org.servlet.File;

import java.io.IOException;
import java.sql.*;

import javax.servlet.*;
import javax.servlet.annotation.MultipartConfig;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;
@WebServlet("/upload")
@MultipartConfig(maxFileSize=1245662)
public class Upload extends HttpServlet {
String name;
Part image;
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
   name=req.getParameter("Name");
	image=req.getPart("IMAGE");
	jdbcCode();
	}
	public void jdbcCode()
	{
		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection con= DriverManager.getConnection("jdbc:mysql://localhost:3306?user=root&password=tiger");
		     PreparedStatement ps=con.prepareStatement("insert into insertimage.image  values (?,?)");
		    ps.setString(1, name);
		    ps.setBlob(2, image.getInputStream());
		     ps.executeUpdate();
		} catch (ClassNotFoundException | SQLException | IOException e) {
			e.printStackTrace();
		}
		
		
	}
}
