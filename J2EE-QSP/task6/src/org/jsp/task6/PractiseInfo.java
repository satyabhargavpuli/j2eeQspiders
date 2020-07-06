package org.jsp.task6;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class PractiseInfo {
public static void main(String[] args)  {
	Connection con=null;
	Statement st =null;
	String url="jdbc:mysql://localhost:3306?user=root&password=tiger";
	String query="select * from  registration.form  ";
	try {
		con = DriverManager.getConnection(url);
		st = con.createStatement();
		ResultSet rs=st.executeQuery(query);
		rs.next();
		String age=rs.getString("age");
        System.out.println(age);
        String name=  rs.getString("NAME");
        System.out.println(name);
	    } 
	catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
		
	}	
}
}
