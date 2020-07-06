package com.project.food;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class FoodCartDbUtil {

	public static List<Food> getFoodList() throws ClassNotFoundException, SQLException {
		ArrayList<Food> food = new ArrayList<>();

		String url = "jdbc:oracle:@localhost:1521:xe";
		String userName = "mydb";
		String password = "tiger";
		
		Class.forName("oracle.jdbc.driver.OracleDriver");
		
		Connection connection = DriverManager.getConnection(url,userName,password);
		Statement statement = connection.createStatement();
		ResultSet resultSet = statement.executeQuery("select * from FOOD");
		
		while(resultSet.next()) {
			int id = resultSet.getInt(1);
			String item = resultSet.getString(2);
			String price = resultSet.getString(2);
			food.add(new Food(id, item, price));
			
		}
		
		return food;
	}
}
