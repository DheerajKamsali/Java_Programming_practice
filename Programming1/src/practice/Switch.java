package practice;

public interface Switch {
	
	void on(int a);
	void off();
}
class Light implements Switch{

		@Override
		public void on(int a) {
			System.out.println(a+"switch on");
		}
		@Override
		public void off() {
			System.out.println("switch off");
		}
	}
	
   class Fan implements Switch{
		
//		void main() {
//			System.out.println("hii im normal method");
//		}

		public void on(int a) {

			System.out.println("im on");
		}

		@Override
		public void off() {

			System.out.println("im off");
		}
	}
