package org.jsp;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Demo1 {
//program using result set and prepared statement
	public static void main(String[] args) throws SQLException {
		
	Connection con=null;
	PreparedStatement pst = null;
	
	try {
	con = 	DriverManager.getConnection("jdbc:mysql://localhost:3306?", "root", "tiger");
	
	 pst=con.prepareStatement("select * from  balu.sample");
	ResultSet rs = pst.executeQuery();
	
	while (rs.next()) {
	String s1 =	rs.getString(1);
	String s2 = rs.getString(2);
	System.out.println(s1);
	System.out.println(s2);

	}
	} catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	con.close();
	pst.close();
	
	
	}
}
