

public class NestedTry {
	
	
	public static void main(String[] args) {
		System.out.println("1");
		try {
			System.out.println("1");
			System.out.println(70/0);
			System.out.println("8");
			
			
		}
		
		catch(Exception e) {
			System.out.println("handle the exception first");
		}
		
		finally {
			System.out.println("5");
		}
		
		System.out.println("6");
	}

}
