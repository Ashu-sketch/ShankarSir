package com.shankar;

public class ShankarJiJava {

	public static void main(String[] args) {
		
//		int amount =1100;
//		
//		if(amount<1000) {
//	System.out.println("withdraw");
//		}else {
//			throw new InsufficiantBalancee("please check your eneterd amount");
//		}
//		

		ShankarJiJava cash= new ShankarJiJava();
		cash.withdrawCash(120);
	

	}
	
	void withdrawCash(int amount) {
		if(amount<100) {
			throw new InsufficiantBalancee("not valid amountt to withdraw, please enter more than 100");	
		}else {
			System.out.println("withdraw");
		}
		
	}
	
	
}




class InsufficiantBalancee extends RuntimeException {
    // Corrected default constructor
     InsufficiantBalancee() {
    	 
        super("You have insufficient balance");        
    }
     
     InsufficiantBalancee(String msg){
    	 super(msg);
    	 
     }
     
     
}
