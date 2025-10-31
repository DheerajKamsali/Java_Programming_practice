package practice;

public class Throws {
	
	static void age(int age) throws InvalidAgeException{ // create class and extends exception
		
		if(age>=18) {
			System.out.println("eligible for voting");
		}
		else {
			throw new InvalidAgeException("age less than 18"); // to print this generate construcor of exception and string messsage super(mesaage)
		}
	}
	public static void main(String[] args) {
		
		try {
			Throws.age(15);
		}
		catch(InvalidAgeException e) { // it will handle above exception
			System.out.println("handling code");
			System.out.println(e.getMessage());
		}
	}

}
