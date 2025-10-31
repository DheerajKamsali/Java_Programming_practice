package practice;

import java.util.Scanner;

public class Con2 {
	
    String name;
    int sal;
	 Con2(String eName, int sal) {
		 this.name=eName;
		 this.sal=sal;
	}
	 public static void main(String[] args) {
		
		 Scanner sc=new Scanner(System.in);
		 System.out.println("enter the name: ");
		 String eName=sc.next();
		 System.out.println("enter sal : ");
		 int sal=sc.nextInt();
		
		 Con2 c1=new Con2(eName,sal);
		 System.out.println(c1.name);
		 System.out.println(c1.sal);
	}
	
	

}
