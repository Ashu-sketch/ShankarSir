package com.AllCrudOperations;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class AllCrudOperationClass {
	//connection method
	static Connection createConnectionWithDB() throws ClassNotFoundException ,SQLException{
		//load and registter the driver
		Class.forName("com.mysql.cj.jdbc.Driver");		
		//Connection creation
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/ashu","admin","root");
		
		System.out.println("success");
		
		return con;
	}
	
	//1. insertion C=create
	
	public void insert()throws Exception {
	Connection db =createConnectionWithDB();	
	
	//statement create
	PreparedStatement pst= db.prepareStatement("insert into student (sName) value (?)");
	pst.setString(1, "Ram Laal");
	int i=pst.executeUpdate();
	
	if(i>0)
		System.out.println("insert success");
	else
		System.out.println("fail");				
		
	}
	//U=update
	public void update() throws Exception{
		Connection db= createConnectionWithDB();
		//create statement
		PreparedStatement pst =db.prepareStatement("update student set sName=? where sRoll=4");
		pst.setString(1, "Dinesh");
		
		//execute the query
		if(pst.executeUpdate()>0)
			System.out.println("update success");
		else 
			System.out.println("fail");
		
		
	}
	
	//R=Read
	public void select()throws Exception {
		Connection db= createConnectionWithDB();
		//create statement
		PreparedStatement pst= db.prepareStatement("select* from student");
		
		ResultSet rs=pst.executeQuery();
		
		while(rs.next()) {
			System.out.println(rs.getInt(1));
			System.out.println(rs.getString(2));
			
		}
		
	}
	
	//D=Delete
	
	
	public void delete()throws Exception {
	Connection db=createConnectionWithDB();  //

	//create statement
	PreparedStatement pst=db.prepareStatement("delete from student where sName=?");
	pst.setString(1,"Anmol chawala" );
	//query execution
	if(pst.executeUpdate()>0) {
		System.out.println("delete success");
	}else{
		System.out.println("fail");
	}
				
	}
	
	
	//Driver method
	public static void main(String[] args)throws Exception {
	 AllCrudOperationClass obj= new AllCrudOperationClass();
	 obj.insert();
	 obj.update();
	 obj.select();
	 
	 obj.delete();
	 
	}

}
