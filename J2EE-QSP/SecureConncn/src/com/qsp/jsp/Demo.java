package com.qsp.jsp;

import java.io.FileReader;
import java.sql.Connection;
import java.sql.DriverManager;
import java.util.Properties;

public class Demo {
public static void main(String[] args) {
	String url="jdbc:mysql://localhost:3306";
	try {
		FileReader f=new FileReader("/SecureConncn/src/com/qsp/jsp/secure/properties");
		Properties p=new Properties();
		p.load(f);
		Connection con=DriverManager.getConnection(url, p);
		System.out.println("step1");
	} catch (Exception e) {
		e.printStackTrace();
	}
}
}
