package org.jsp.task5;
import java.sql.*;
public class EvenPositionsInfo {

	public static void main(String[] args) {
	
		String url="jdbc:mysql://localhost:3306?user=root&password=tiger";
		String query="select * from base.columdata ";
		Connection con=null;
		Statement st=null;
		ResultSet rs=null;
		
		try {
			con=DriverManager.getConnection(url);
			st=con.createStatement();
			rs=st.executeQuery(query);
	//	int num= rs.getInt("sno");
			/*while(rs.next())
			{
*/
			for (int i = 1; i < 10; i++) {
				rs.next();
				if(i%2==0)
				{
					int sno=rs.getInt("sno");
                    String name=rs.getString("name");
                    String surname=rs.getString("surname");
					System.out.println(sno);
					System.out.println(name);
					System.out.println(surname);
			//	}					
			}
			}
		/*	while(rs.next())
			{
				if()
				{
					System.out.println(rs);
				}
			
			}*/
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		finally {
			try {
				con.close();
				st.close();

			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
	}
}
