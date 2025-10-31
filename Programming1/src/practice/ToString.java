package practice;

public class ToString {
	
	String name;
	int a;
	String age;
	
//	public ToString(String name, int a, String age) {
//		this.name = name;
//		this.a = a;
//		this.age = age;
//	}

	public void setName(String name) {
		this.name = name;
	}

	public void setA(int a) {
		this.a = a;
	}

	public void setAge(String age) {
		this.age = age;
	}
	
	@Override
	public String toString() {
		return "ToString [name=" + name + ", a=" + a + ", age=" + age + "]";
	}
}
