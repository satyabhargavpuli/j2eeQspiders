package org.jsp;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Demo {
	
	public static void main(String[] args)  {
	//	String url = "jdbc:mysql://localhost:3306?user=root&password=tiger";
	 	String query = "insert into balu.sample values('nana','hyd')";
		Connection connection = null;
		 Statement statement = null;
		try {
			connection=DriverManager.getConnection("jdbc:mysql://localhost:3306?", "root", "tiger");
		//	 connection =DriverManager.getConnection(url);
			System.out.println("step1");
    
	        statement = connection.createStatement();	 
	        System.out.println("step2");
	        
	        ResultSet rs=statement.executeQuery("select name,address from balu.sample");
	        while(rs.next())
	        {
	        	String name=rs.getString(1);
	        	String address=rs.getString(2);
	        	System.out.println("name is "+name);
	        	System.out.println("address is "+address);
	        }
	        
	     //   statement.executeUpdate(query);
	   //     System.out.println("step 3 ");
	        
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}
