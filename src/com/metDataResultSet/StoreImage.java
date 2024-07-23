package com.metDataResultSet;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.sql.Blob;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;



import java.sql.DriverManager;

public class StoreImage {

	public static void main(String[] args) {  
		try{  
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con= DriverManager.getConnection("jdbc:mysql://localhost:3306/ashu","admin","root"); 
		              
		PreparedStatement ps=con.prepareStatement("insert into imgtable values(?, ?,?)");  
		ps.setInt(1, 8797);
		ps.setString(2,"sonoo");  
		  
		FileInputStream fin=new FileInputStream("C:\\Dhnaraj.jpg");  
		ps.setBinaryStream(3,fin,fin.available());  
//		int i=ps.executeUpdate();  
//		System.out.println(i+" records affected");  
		          
		
		
		
		
		
		///////////////fetch
		PreparedStatement pst=con.prepareStatement("select * from imgtable");  
		ResultSet rs=ps.executeQuery();  
		if(rs.next()){//now on 1st row  
		Blob b=rs.getBlob(2);//2 means 2nd column data  
		byte barr[]=b.getBytes(1,(int)b.length());//1 means first image  
		              
		FileOutputStream fout=new FileOutputStream("C:\\Dhnaraj.jpg");  
		fout.write(barr);  
		              
		fout.close();  
		}//end of if  
		System.out.println("ok");  
		              
		}catch (Exception e) {e.printStackTrace();}  
		}  
	
	
		}  