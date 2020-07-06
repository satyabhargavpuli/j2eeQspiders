package org.jsp.task6;

import java.sql.*;
import java.util.Scanner;

public class AtmLogicInfo {
public static void main(String[] args) {
	String query="";
	Connection con=null;
	Scanner scanner= new Scanner(System.in);
	int inp = scanner.nextInt();
	switch (inp) {
	case 1:System.out.println("enter insert query");
      query="";
		break;
	case 2:System.out.println("enter update query");
    query="";
		break;
	case 3:System.out.println("enter delete query");
    query="";
		break;
	case 4:System.out.println("enter select query");
    query="";
		break;
	default:
		break;
	}
	try {
		con=DriverManager.getConnection("jdbc:mysql://localhost:3306?", "root", "tiger");
		ResultSet rs= con.createStatement().executeQuery(query);
		rs.next();
	} catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
}
}
