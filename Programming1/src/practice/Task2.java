package practice;

import java.util.Scanner;

public class Task2 extends Thread{

	public Task2() {
		start();
	}

	@Override
	public void run() {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the username: ");
		String name=sc.next();
		System.out.println("enter the pin: ");
		int pin=sc.nextInt();
	}	
}

