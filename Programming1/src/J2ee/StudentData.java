package J2ee;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class StudentData { 
	
	public static void main(String[] args) {
		String url="jdbc:mysql://localhost:3306/STUDENTAPP";
		
		String user="root";
		String password="root";
		Connection con=null;
		//Statement st=null;
		PreparedStatement ps=null;
		ResultSet rs=null;
		String query="INSERT INTO STUDENT VALUES(0,?,?,?,?,?,?,sysdate())";
		//String query="select * from student";
		Scanner sc=new Scanner(System.in);
		
		//loading and registering 
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			System.out.println("class loaded succesfully");
			
			//establishing connection between java and database
			con =DriverManager.getConnection(url, user, password);
			System.out.println("connection established");
			
//			st=con.createStatement();
			ps=con.prepareStatement(query);
			System.out.println("platform create succesfully");
			
			//boolean res=st.execute(query);
//			//System.out.println(res);
//			System.out.println("enter the student id : ");
//			int s_id=sc.nextInt();
			System.out.println("enter the student name : ");
		     String name=sc.next();
		     System.out.println("enter the phone : ");
		     long phone=sc.nextLong();
		     System.out.println("enter the student mail : ");
		     String mail=sc.next();
		     System.out.println("enter the student branch : ");
		     String branch=sc.next();
		     System.out.println("enter the student location : ");
		     String city=sc.next();
		     System.out.println("enter the student password : ");
		     String pass=sc.next();
		     
		     ps.setString(1,name);
		     ps.setLong(2,phone);
		     ps.setString(3,mail);
		     ps.setString(4,branch);
		     ps.setString(5,city);
		     ps.setString(6,pass);
		     
	        int res=ps.executeUpdate(); // for dml query
	        System.out.println(res);
//	           while(rs.next()) {
//	        	   
//	        	   int id=rs.getInt("sid");
//	        	   System.out.println(id);
//	        	   String name= rs.getString("name");
//	        	   System.out.print(name);
//	        	   System.out.println();
//	           }
		}catch(ClassNotFoundException  | SQLException e) {
			e.printStackTrace();
		}
	}
}

