package com.shankar;

public class ShankarJiDefaultExceptionObjectPrint {

	public static void main(String[] args) throws Throwable{
	
		throw new MukeshJi("my constructor called", new  MukeshJi() );

	}
	
	class MukeshJi extends Throwable{
		
		MukeshJi(String msg, Throwable ex){
			super(msg);
			
			System.out.println("object thjrow of Exception class");
		}

		 MukeshJi() {
			// TODO Auto-generated constructor stub
		}
		
	}

}
