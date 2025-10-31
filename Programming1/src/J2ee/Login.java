package J2ee;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class Login {
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		Connection con=null;
		PreparedStatement ps=null;
		ResultSet rs=null;
	    String url="jdbc:mysql://localhost:3306/studentapp";
	    String user="root";
	    String password="root";
		String query="select * from student where MAIL=? and PASSWORD=?";

	    
	    try {
	    	    Class.forName("com.mysql.cj.jdbc.Driver");
			con=DriverManager.getConnection(url, user, password);
			ps=con.prepareStatement(query);
			System.out.println("enter the mail: ");
			String mail=sc.next();
			System.out.println("enter student password: ");
			String pass=sc.next();
			ps.setString(1, mail);
			ps.setString(2, pass);
			rs=ps.executeQuery();
	
			
			while(rs.next()) {
				
				int id=rs.getInt("sid");
				String name=rs.getString("name");
				String city=rs.getString("location");
				//System.out.println("welcome");
				System.out.println("welcome "+ name+ " your sid is " +id+ " and location is "+city);	
			}
			
		} catch (ClassNotFoundException|SQLException e) {
			e.printStackTrace();
		}
	    
	}

}
