package nebulogicPractise;

import java.sql.Array;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class BasicJdbc {
	public static void main(String[] args) throws Exception {
		Connection connection = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "mydb","tiger");
	         PreparedStatement prepareStatement = connection.prepareStatement("select * from emp_tbl");
	ResultSet query = prepareStatement.executeQuery();
	 while (query.next()) {
		 int int1 = query.getInt("id");
			//Array array = query.getArray("name");
		     
		System.out.println(int1);
		//System.out.println(array);
				
	}
	}
}
