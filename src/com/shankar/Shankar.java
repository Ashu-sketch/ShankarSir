package com.shankar;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;


public class Shankar {

	public static void main(String[] args) throws Exception {
		//load/register the driver
		Class.forName("com.mysql.cj.jdbc.Driver");
		
		//connection creation
		Connection conn=  DriverManager.getConnection("jdbc:mysql://localhost:3306/javaBatch", "admin", "root");
		
		System.out.println("succes");				
		
		
		PreparedStatement pst= conn.prepareStatement("select * from student");	
		
	ResultSet rs=	pst.executeQuery();
	
	System.out.println();
	
	while(rs.previous()) {
		System.out.print(rs.getInt(1)+" ");
		System.out.println(rs.getString(2	));
	}
        
						

	}
	
	

}
