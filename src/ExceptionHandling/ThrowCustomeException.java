package ExceptionHandling;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

import com.mysql.cj.jdbc.Driver;

public class ThrowCustomeException {

	public static void main(String[] args) {
		
		if(2==2) {
			throw new InsufficiantBalance();
		}
		
	}
	
	
}


class InsufficiantBalance extends RuntimeException {
	
	  InsufficiantBalance() {
		System.out.println("insufficiant");
		
	}
}

