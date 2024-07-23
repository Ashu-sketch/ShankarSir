package ExceptionHandling;

public class CustomException extends Throwable{
	
	public static void main(String[] args) {
		 if(4>20) {
			 System.out.println("4 is greater");
	}else{
		throw new MyyRunClass("4 is less than 20");
	}
		
	}
	
	

}
