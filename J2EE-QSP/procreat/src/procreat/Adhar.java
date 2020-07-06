package procreat;
import java.sql.*;
import java.util.Scanner;
public class Adhar {
static	 String url="jdbc:mysql://localhost:3306?user=root&password=tiger";
static	String query="";
static    Connection con=null;
static    Scanner sc=new Scanner(System.in);
static    PreparedStatement pstmp=null;

public static void main(String[] args) throws SQLException,NullPointerException {
	System.out.println("please enter 1 for inserting the Aadhar details");
	System.out.println("please enter 2 for deleting the Aadhar details");
	System.out.println("please enter 3 for checking the Aadhar details");
	System.out.println("please enter 4 for updating the Aadhar details");
	
	switch (sc.nextInt()) {
	case 1:insert();
		break;
	case 2:delete();
        break;
    case 3 :select();
		break;
    case 4 :update();
        break;
		default:System.out.println("please enter only given inputs");
		        main(null);
	}
}
public static void insert() throws SQLException {	
	{
	con=DriverManager.getConnection(url);
	pstmp=con.prepareStatement("insert into adharinform.registrationform values(?,?,?,?,?,?)");
	//sc=new Scanner(System.in);
	System.out.println("please enter Adhar id: ");
//	sc.next();
	String id=sc.next();
	pstmp.setString(1, id);
	System.out.println("please enter first name");
	String fname=sc.next();
	pstmp.setString(2, fname);
	System.out.println("please enter last name");
	String lname=sc.next();
	pstmp.setString(3, lname);
	System.out.println("plese enter Gender");
	String gender=sc.next();
	pstmp.setString(4, gender);
	System.out.println("please enter age");
	int age=sc.nextInt();
    pstmp.setInt(5, age);
    System.out.println("please enter country");
    String country=sc.next();
    pstmp.setString(6, country);
   System.out.println("data inserted sucessfully");
   int rs=pstmp.executeUpdate();
    System.out.println("rows inserted is "+rs);
    con.close();
} 
}


public static void update() throws SQLException
{
	con=DriverManager.getConnection(url);
	pstmp=con.prepareStatement("update  adharinform.registrationform set Country=? where AdharID=?)");
//	sc=new Scanner(System.in);
	System.out.println("please enter Adhar id");
	String ucoadharid=sc.next();
	pstmp.setString(1, ucoadharid);
	System.out.println("please enter country");
	String c=sc.next();
	pstmp.setString(6, c);
	pstmp.executeQuery();
    System.out.println("update sucessfull");
    con.close();
	//sc.next()
}
public static void delete() throws SQLException
{
	con=DriverManager.getConnection(url);
	pstmp=con.prepareStatement("delete from  adharinform.registrationform where AdharID=?");
	System.out.println("please enter Adhar id");
	String dAdharid=sc.next();
	pstmp.setString(1, dAdharid);
	pstmp.executeUpdate();
	System.out.println("Adhar deleted sucessfully");
	con.close();
    //ResultSet rs= pstmp.executeQuery();
   // String s= rs.getString("AdharID");
	
	
	//String s=rs.getString("FirstName");
	//System.out.println(rs);
}
public static void select() throws SQLException
{
	con=DriverManager.getConnection(url);
	pstmp=con.prepareStatement("select * from  adharinform.registrationform where AdharID=?");
	//sc=new Scanner(System.in);
	System.out.println("please enter Adhar id");
	String s=sc.next();
	pstmp.setString(1, s);
	ResultSet rs=pstmp.executeQuery();
	rs.next();
	String id=rs.getString("AdharID");	
	System.out.println("Id is "+id);
	
	con.close();
	
}
}
