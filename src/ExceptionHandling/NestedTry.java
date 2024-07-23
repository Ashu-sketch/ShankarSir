package ExceptionHandling;

public class NestedTry {
	public static void main(String[] args) {
		try {
			 int []arr=new int[3];
             arr[0]=1;
             arr[1]=1;
             arr[2]=1;
             
             
			
			try {
				
				arr[3]=4;
				
			} catch(ArithmeticException  | NullPointerException e ) {
				System.out.println("exception");
			}
			System.out.println("ustdyu");
			
		
	}
		catch(Exception e) {
			System.out.println("exception 2");
		}
		
		System.out.println("good morning,  have a good day");

}
}