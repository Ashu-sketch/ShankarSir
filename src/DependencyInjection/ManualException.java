package DependencyInjection;

public class ManualException {
	public static void main(String[] args)  {
		
	ManualException m= new ManualException();
	
	
	try {
		m.enterPin(458);
	} catch (IllegalPin e) {
	System.out.println("please enetr correct number");	
	}
		
		
		
	}
	
	void enterPin(int pin)throws IllegalPin {
		int rightPin=3459;
		if(pin==rightPin) {
			System.out.println("success");
		}else {
			throw new IllegalPin();
		}
		
	}

}


class IllegalPin extends Exception{
	
	  IllegalPin(){
		super("you have enterd an wrong pin number ");
	}
	
}