package ExceptionHandling;

import java.io.*;

public class IOExceptionExample {
    public static void main(String[] args) {
    	
    	
        
        
        
        try {
        	
        	// Specify the path of the file to be created and written to
     	   // creating an instance of the FileReader class  
         FileReader fileReader = new FileReader("Test.txt");  
         // create an instance of the BufferedReader and pass the FileReader instance to it.  
         BufferedReader bufferReader = new BufferedReader(fileReader);  
         // declaring an empty string by passing null value  
         String fileData = null;  
         // use while loop to read and print data from buffered reader   
         while ((fileData = bufferReader.readLine()) != null)   
         {  
             System.out.println(fileData);  
         }  
			
		} catch (IOException e) {
			System.out.println("it is a example of IO Exception");
			
		}
        
        
    }
    }

