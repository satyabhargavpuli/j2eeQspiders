package com.form.registration;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class UpdateAge {
public static void main(String[] args) {
	
	Connection connection = null;
	Statement statement = null;
	String url = "jdbc:mysql://localhost:3306?user=root&password=tiger";
	String query="update registration.form set AGE=25 where AGE=24";
	

		
		try {
			connection=DriverManager.getConnection(url);

			statement=connection.createStatement();
			statement.executeUpdate(query);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	
}
	
}
