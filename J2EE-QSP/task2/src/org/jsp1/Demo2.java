package org.jsp1;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
public class Demo2 {

	

	public static void main(String[] args) {
		
		String url = "jdbc:mysql://localhost:3306?user=root&password=tiger";
		String query = "update balu.sample set  name = 'bhargav' where name = 'satya' ";
		
		try {
			Connection connection = DriverManager.getConnection(url);
			System.out.println("step 1 ");
			         Statement statement =  connection.createStatement();
			 		System.out.println("step 2 ");

			         statement.executeUpdate(query);
			 		System.out.println("step 3 ");

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	}


