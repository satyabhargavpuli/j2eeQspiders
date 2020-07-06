package com.pro.login;

import java.sql.*;
import java.util.Scanner;

public class LoginInfo {
	public static void main(String[] args) {
		
			LoginInfo login=new LoginInfo();
			login.paytmLogin();
		}
	public void userName()
	{
		String url = "jdbc:mysql://localhost:3306?user=root&password=tiger";
	    String query="select firstname from registration.logindata where username=? and password=? ";
	
	try {
		Connection con=DriverManager.getConnection(url);
		PreparedStatement pstmp= con.prepareStatement(query);
			
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter user name");
	    String username=	sc.next();
    	System.out.println("Enter password");
	    String password = sc.next();
	    pstmp.setString(1, username);
	    pstmp.setString(2, password);
	    ResultSet rs= pstmp.executeQuery();
	    if(rs.next())
	    {
	    	String firstname = rs.getString("firstname");
	    	System.out.println("Welcome MR"+" "+firstname);
	    }
	    else
	    {
	    	System.err.println("invalid login");
	    }
	    con.close();
	    sc.close();
	} catch (SQLException e) {
		e.printStackTrace();
	}
	
	}
	public void paytmLogin()
	{
		String url = "jdbc:mysql://localhost:3306?user=root&password=tiger";
	    String query="select phonenumber,username from registration.logindata where username=? and password=? ";
	
	try {
		Connection con=DriverManager.getConnection(url);
		PreparedStatement pstmp= con.prepareStatement(query);
			
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter username or mobile number ");
	    String phonenumber =	sc.next();
    	System.out.println("Enter password");
	    String password = sc.next();
	    pstmp.setString(1, phonenumber);
	    pstmp.setString(2, password);
	    ResultSet rs= pstmp.executeQuery();
	    if(rs.next())
	    {
	    	String username = rs.getString("username");
	    	String phonenumb=rs.getString("phonenumber");
	    //	username.equals(arg0)
        //    if((phonenumb)||(username))
	    	System.out.println("Welcome MR"+" "+username);
	    	
	    }
	    else
	    {
	    	System.err.println("invalid login");
	    }
	    con.close();
	    sc.close();
	} catch (SQLException e) {
		e.printStackTrace();
	}
	
	}
	}
	


