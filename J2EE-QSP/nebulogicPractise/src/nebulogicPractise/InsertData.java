package nebulogicPractise;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class InsertData {
public static void main(String[] args) throws Exception {
	Connection connection = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "mydb", "tiger");
                 PreparedStatement prepareStatement = connection.prepareStatement("insert into emp_tbl values (?,?,?)");
                  prepareStatement.setInt(1,7);
                  prepareStatement.setString(2, "mani");
                  prepareStatement.setDouble(3,2000);
                  prepareStatement.executeUpdate();
System.out.println("check data is inserted or not");
}
}
