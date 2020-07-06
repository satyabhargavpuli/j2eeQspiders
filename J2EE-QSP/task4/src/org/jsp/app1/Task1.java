package org.jsp.app1;

import java.sql.*;

public class Task1 {
public static void main(String[] args) {
	/*org.jsp.app1  
	 * program for multiple records
	 */
	String url ="jdbc:mysql://localhost:3306?user=root&password=tiger";
	String query= "select NAME,MOBILENO from registration.form where age=25";
	
	Connection con =null;
	Statement st = null;
	
	try {
		con = DriverManager.getConnection(url);
		st=con.createStatement();
		ResultSet rs= st.executeQuery(query);
		while(rs.next())
		{
		String name  =	rs.getString("NAME");
		String mobileno = rs.getString("MOBILENO");
		
		System.out.println(name);
		System.out.println(mobileno);
		}//while
		
	}//try
	catch (SQLException e) {
		e.printStackTrace();
	}//catch
	finally
	{
		try {
			con.close();
			st.close();
		}//try
		catch (SQLException e) {
			e.printStackTrace();
		}//catch
		
	}//finally
	
	
}//main
}//class
