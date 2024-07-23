package ExceptionHandling;

public class FiveJulyCompileExceptionUser {

	public static void main(String[] args) {
	int age=15;
	if(age <18) {
		throw new UserDefineCompileException();
	}

	}
	
	class UserDefineCompileException extends Exception{
		
		public UserDefineCompileException() {
			System.out.println("exception");
		}
	}

}
