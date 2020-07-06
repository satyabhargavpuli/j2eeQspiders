package com.form.registration;

import java.sql.*;
import java.util.Scanner;

public class RegistrationInfo {
static	Connection connection=null;
static PreparedStatement pstmp=null;
static Scanner sc=new Scanner(System.in);
static String url="jdbc:mysql://localhost:3306?user=root&password=tiger";
static int num;
        /*this method is used for registration*/
	public static void register()
	{
		try
	    {
			 connection=DriverManager.getConnection(url);
		     pstmp=connection.prepareStatement("insert into registration.form values(?,?,?,?,?,?) ");
		  //  Scanner s= new Scanner(System.in);
		    System.out.println("please enter username");
		    String username = sc.next();
		    pstmp.setString(1, username);
		    System.out.println("enter password");
		    String password=sc.next();
		    pstmp.setString(2, password);
		    System.out.println("enter DateOfBirth");
		    String dob=sc.next();
		    pstmp.setString(3, dob);
		    System.out.println("Enter age");
		    int age=sc.nextInt();
		    pstmp.setInt(4, age);
		    System.out.println("enter mobileno");
		    String mobno=sc.next();
		    pstmp.setString(5, mobno);
		    System.out.println("enter mail-id");
		    String mail_id=sc.next();
		    pstmp.setString(6, mail_id);
		   pstmp.executeUpdate();
		   System.out.println("Registation sucessfull");
		   pstmp.close();
		   connection.close();
			//RegistrationInfo.login();//redirect to login page

		   /* if ((username || password || dob || age || mobno || mail_id)!=null) 
		    {
				System.out.println("Registration sucess");
			}*/
		    
	    }
		catch (SQLException e) {
			e.printStackTrace();
		}
	    
	}//method close
	
	    public static void login() throws SQLException 
	    {
		 System.out.println("please enter 2 for login");
		 System.out.println("please enter 0 for exit");
	//	int selct=sc.nextInt();

		 connection=DriverManager.getConnection(url);
	     pstmp=connection.prepareStatement("select MOBILENO from registration.form where ?,? ");
	       
	        System.out.println("Enter username ");
		    String username =	sc.next();
	    	System.out.println("Enter password");
		    String password = sc.next();
		    ResultSet rs= pstmp.executeQuery();
	        rs.next();
		    String name=  rs.getString("NAME");
		    String dbpass=rs.getString("PASSWORD");
		    if((username.equals(name)&(password.equals(dbpass))))
		    {
		    	System.out.println("login sucess");
		    }
		    else
		    {
		    	System.err.println("username or password incorrect");
		    }
	        
	}
	
	
	
public static void main(String[]args) throws SQLException {
	System.out.println("please enter 1 for registration");
	System.out.println("please enter 2 for login");
//	RegistrationInfo ris=new RegistrationInfo();
	System.out.println("please select one number");
	switch (sc.nextInt()) {
	case 1:register();
		break;
	case 2:login();
        break;
    case 0 :exit();
	default:
		break;
	}
  sc.close();
}

public static void exit() {
System.out.println("program exit sucessfully");

}

}