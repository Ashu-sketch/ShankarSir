package ExceptionHandling;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class FinallyDemo {
	public static void main(String[] args) throws Exception {
		
		
		
		Connection con=null;
		Class.forName("com.mysql.cj.jdbc.Driver");
		 con=DriverManager.getConnection("jdbc:mysql://localhost:3306/ashu","admin","root");
		
		try {
					
			//Connection creation  , resource 			
			System.out.println("success");
			
		} 
		
		finally {
			con.close();
			System.out.println("close the connection");
		}
		
		
		//statement create
		PreparedStatement pst= con.prepareStatement("insert into student (sName) value (?)");
		pst.setString(1, "Ram Laal");
		int i=pst.executeUpdate();
		
		if(i>0)
			System.out.println("insert success");
		else
			System.out.println("fail");				
			
		}
		
		
	

}
