package com.servelts.app;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class JdbcClass {
	boolean status=false;
/*LoginServlet l= new LoginServlet();
ForgotPasswordServlet f= new ForgotPasswordServlet();
RegisterServlet r= new RegisterServlet();
*/ 
public static  void registerJdbc()
{
	try {
		Class.forName("com.mysql.jdbc.Driver");
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306?user=root&password=tiger");
		PreparedStatement ps=con.prepareStatement("insert into apllication.registration values(?,?,?,?)");
		ps.setString(1, RegisterServlet.name);
		ps.setString(2, RegisterServlet.phno);
		ps.setString(3, RegisterServlet.username);
		ps.setString(4, RegisterServlet.password);
		ps.executeUpdate();
		ps.close();
		con.close();
	} catch (ClassNotFoundException | SQLException e) {
		e.printStackTrace();
	}
}

public static void forgotPasswordJdbc()
{
	   try {
			Class.forName("com.mysql.jdbc.Driver");
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306?user=root&password=tiger");
		PreparedStatement ps=con.prepareStatement("update apllication.registration set password=?  where phonenumber=?");
		ps.setString(1, ForgotPasswordServlet.password);
		ps.setString(2, ForgotPasswordServlet.phno);
		ps.executeUpdate();
		ps.close();
		con.close();
	} catch (SQLException | ClassNotFoundException e) {
		e.printStackTrace();
	}

}
public static void loginJdbc() 
{
	try {
		Class.forName("com.mysql.jdbc.Driver");
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306?user=root&password=tiger");
		PreparedStatement pst=con.prepareStatement("select name from apllication.registration where username=? and password=? ");
		pst.setString(1, LoginServlet.username);
		pst.setString(2, LoginServlet.password);
		pst.executeQuery();
		ResultSet rs = pst.executeQuery();
        rs.next();
       // rs.getString("name");
        
       String name= rs.getString("name");
       System.out.println("welcome "+name);
		
	
		
		pst.close();
		con.close();
		
	} catch (SQLException | ClassNotFoundException e) {
		e.printStackTrace();
	}
	
}
}


