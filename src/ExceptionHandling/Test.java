package ExceptionHandling;

public class Test {

	public static void main(String[] args) {
		if(4>9) {
			System.out.println("uidsf");
			throw new MyRunClass("Kunal_03kg");
		}

	}
	class MyRunClass extends RuntimeException {

		MyRunClass(String msg){
			super(msg);
		}

	}}
