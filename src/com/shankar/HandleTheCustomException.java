package com.shankar;

public class HandleTheCustomException {

	public static void main(String[] args) {
		
		HandleTheCustomException obj= new HandleTheCustomException();
		obj.voting(15);
		obj.regiterTheNameWhoJustUsedTheEVMMachine(783453275);
	}


	
	void voting(int age) {
		if(age<18) {
//			System.out.println("not applicable");
			throw new NotValidAge();
		}
		else {
			System.out.println("applicable");
		}
	}
	
	
	
	void regiterTheNameWhoJustUsedTheEVMMachine(int addharnum) {
	System.out.println("save");	
	}
	
	
}

class NotValidAge extends RuntimeException{
	
	NotValidAge(){
		super("NotValid Age");
	}

}
