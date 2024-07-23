package com.shankar;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class MyClass {
	
	//method Connection
	public static Connection getConnectionMy()throws Exception {
		//register and load
		Class.forName("com.mysql.cj.jdbc.Driver");
		
		Connection con= DriverManager.getConnection("jdbc:mysql://localhost:3306/ashu","admin","root");
		System.out.println("success");
		
		return con;
	}
	
	public static void main(String[] args)throws Exception {
		MyClass obj= new MyClass();
		obj.insertdata();
	}
	
	public void insertdata()throws Exception {
		Connection db=getConnectionMy();
		//statement create 
		
		PreparedStatement pst=db.prepareStatement("insert into student (sname) value ('Ashu Shekhawat')");
		int i=pst.executeUpdate();
		
		if(i>0)
			System.out.println("insert Update");
		else 
			System.out.println("fail");
		
		
	}

}
