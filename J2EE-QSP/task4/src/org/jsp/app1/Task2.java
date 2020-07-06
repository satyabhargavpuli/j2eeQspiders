package org.jsp.app1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Task2 {
public static void main(String[] args) {
	
/*org.jsp.app1  
 * program for single records
 */
	String url ="jdbc:mysql://localhost:3306?user=root&password=tiger";
	String query ="select NAME from registration.form where age=25";
	
	Connection con = null;
	Statement st= null;
	try {
		con=DriverManager.getConnection(url);
		st=con.createStatement();
		ResultSet rs = st.executeQuery(query);
	for(int i=1;i<3;i++)
		{
			if(rs.next())
			{
				 String name=rs.getString("NAME");
					System.out.println(name);
			}
		}
		/*while(rs.next())
		{
	    String name=rs.getString("NAME");
		System.out.println(name);
		}//while
*/	}//try
	catch(SQLException e)
	{
		e.printStackTrace();
	}//catch
	finally {
		try {
			con.close();
			st.close();

		} //try
		catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}//catch
	}
	
	
}//main	
}//class
