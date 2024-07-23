package ExceptionHandling;

public class CustomExceptionfourJuly  {

	public static void main(String[] args) throws InsufficiantBalance {
		if(2==2) {
			throw new InsufficiantBalance("shdui", new InsufficiantBalance() );
	
	}
		
		
	}
}



//Exception class
 class InsufficiantBalance extends Throwable {
	 
   
     InsufficiantBalance() {
        super("You have insufficient balance");
    }
     

    // Corrected parameterized constructor
     
     InsufficiantBalance(String errorMessage, Throwable err) {
        super(errorMessage, err );
    }
}

