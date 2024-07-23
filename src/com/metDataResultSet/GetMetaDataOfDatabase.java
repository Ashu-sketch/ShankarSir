package com.metDataResultSet;

import java.sql.Connection;
import java.sql.DatabaseMetaData;
import java.sql.DriverManager;
import java.sql.ResultSet;

public class GetMetaDataOfDatabase {

	
	
	static Connection  createConnection() throws Exception {
		
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con= DriverManager.getConnection("jdbc:mysql://localhost:3306/ashu","admin","root");
		return con; 						
		
	}	

	public static void main(String[] args) throws Exception{
		Connection con= createConnection();
		
		DatabaseMetaData dbmd=con.getMetaData();  
		  
		System.out.println("Driver Name: "+dbmd.getDriverName());  
		System.out.println("Driver Version: "+dbmd.getDriverVersion());  
		System.out.println("UserName: "+dbmd.getUserName());  
		System.out.println("Database Product Name: "+dbmd.getDatabaseProductName());  
		System.out.println("Database Product Version: "+dbmd.getDatabaseProductVersion());  
		
		
		
		//get Table details
		String table[]={"TABLE"};  
		ResultSet rs=dbmd.getTables(null,null,null,table);  
		  
		while(rs.next()){  
		System.out.println(rs.getString(3));  
		}  
	}
}
