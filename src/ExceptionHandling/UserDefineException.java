package ExceptionHandling;

class MyyRunClass extends RuntimeException {

	MyyRunClass(String msg){
		super(msg);
		
	}

	

	
	
	
	 public class UserDefineException 
	 {
		public static void main(String[] args) {
			
			throw new MyyRunClass("hii");
			
		} 
	 }
}
