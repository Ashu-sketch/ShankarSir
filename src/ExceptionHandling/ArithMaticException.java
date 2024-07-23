package ExceptionHandling;

public class ArithMaticException {
	 public static void main(String args[]) 
	    { 
		
		  
      
	       try {
	    	   System.out.println (30/15);
	    	   System.out.println("Arithmatic");
	        	  String obj = "text";
				    // Using object with null value
		             if (obj.equals("text")) 
				    	System.out.println("I am part of if");
		             System.out.println("null pointer");
		             
		             System.exit(678);
		             
		             
		             
		             int []arr=new int[3];
		             arr[0]=1;
		             arr[1]=1;
		             arr[2]=1;
		             arr[3]=1;
		             arr[4]=1;
		             
		             System.out.println("Array");
		             
		           
		            
		             
		             
		             
			
	} catch (ArithmeticException | NullPointerException | ArrayIndexOutOfBoundsException e) {
			System.out.println("handle the Exception");
			 
			
		}
	       
	      
	       finally {
	    	 
			System.out.println("hey");
		}
	    }
	 }
