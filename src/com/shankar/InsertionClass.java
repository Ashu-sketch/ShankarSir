package com.shankar;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;


public class InsertionClass {
	
	
	
	static Connection  createConnection() throws Exception {
		
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con= DriverManager.getConnection("jdbc:mysql://localhost:3306/ashu","admin","root");
		return con; 						
		
	}
		
		
	public void fetchList()throws Exception  {
		
		Connection con=createConnection();
		
		//statement creation 
		Statement st=con.createStatement();
		
		//process the query 
		ResultSet rs=st.executeQuery("select * from student");
		System.out.println(rs);
		
		int i=0;
		while(rs.next()) {
			System.out.print(rs.getInt(1)+" ");
			System.out.println(rs.getString(2));
			i++;
		}
		
	}
	
		
	
	public void insertQuery() throws Exception {
		//load and register the driver
				
				
				//Connection creation
				Connection con=createConnection();
		 
				System.out.println("success connection");
				//create Statement
				PreparedStatement pst=con.prepareStatement("insert into student (sName) value('?')");
				pst.setString(1, "Dinesh chawala");
				
				int i=pst.executeUpdate();
				
				if(i>0)
					System.out.println("insert success");
				else
					System.out.println("fail");
	}
	
	
	
	
}
