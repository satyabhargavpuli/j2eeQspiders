package com.form.registration;
import java.sql.*;
public class UpdateMailId {
public static void main(String[] args) {
	
	Connection connection = null;
	Statement statement = null;
	String url = "jdbc:mysql://localhost:3306?user=root&password=tiger";
	String query = "update registration.form set MAIL_ID='ramesh.samana999@gmail.com' where MAIL_ID='satyabhargav.puli@gmail.com'";
	
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
