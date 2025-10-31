package J2ee;

public class Student {
	public static void main(String[] args) {
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			System.out.println("class loaded succesfully");
		}catch(ClassNotFoundException e) {
			
			e.printStackTrace();
		}
	}

}
