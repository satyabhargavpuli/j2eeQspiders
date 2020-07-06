package org.jsp.task5;

import java.sql.*;

public class OddNumInfo {

	public static void main(String[] args) {
		Connection conn=null;	
		try {
			conn=DriverManager.getConnection("jdbc:mysql://localhost:3306?", "root", "tiger");
			ResultSet rs = conn.createStatement().executeQuery("select * from base.columdata");
			for (int i = 1; i < 10; i++) {
				rs.next();
				if(i%2==1)
				{
					int sno=rs.getInt("sno");
                    String name=rs.getString("name");
                    String surname=rs.getString("surname");
					System.out.println(sno +" "+name +" " +surname);
				}
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		finally {
			try {
				conn.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
			
		}
		
	}
}
