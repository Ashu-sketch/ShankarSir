package com.metDataResultSet;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;



public class MetaDataResultSetDemo {
	
	static Connection  createConnection() throws Exception {
		
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con= DriverManager.getConnection("jdbc:mysql://localhost:3306/ashu","admin","root");
		return con; 						
		
		
	}
	
	
	public static void main(String[] args) throws 	Exception{
		Connection con = createConnection();
		
		PreparedStatement ps=con.prepareStatement("select * from employee");  
		
		ResultSet rs=ps.executeQuery();  
		ResultSetMetaData rsmd=rs.getMetaData();  
		  
		System.out.println("Total columns: "+rsmd.getColumnCount()); 
		
		
		System.out.println("Column Name of 1st column: "+rsmd.getColumnName(2)+", "+ rsmd.getColumnName(3));  
		System.out.println("Column Type Name of 1st column: "+rsmd.getColumnTypeName(2)); 
		System.out.println(rsmd.getTableName(8));
	}
}
