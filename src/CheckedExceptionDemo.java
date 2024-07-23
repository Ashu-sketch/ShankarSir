
// Java Program to Illustrate Checked Exceptions
// Where FileNotFoundException does not occur

// Importing I/O classes
import java.io.*;

// Main class
class CheckedExceptionDemo {

	// Main driver method
	public static void main(String[] args) 
		throws IOException
	{

		// Creating a file and reading from local repository
//		FileReader file = new FileReader("C:\\Users\\a.txt");
//
//		// Reading content inside a file
//		BufferedReader fileInput = new BufferedReader(file);
//
//		// Printing first 3 lines of file "C:\test\a.txt"
//		for (int counter = 0; counter < 3; counter++)
//			System.out.println(fileInput.readLine());
//
//		// Closing all file connections
//		// using close() method
//		// Good practice to avoid any memory leakage
//		fileInput.close();
//		
//		System.out.println(1/0);
		int p=4;
		p=p-- + ++p - p++;
		System.out.println(p);
		
		try {
			System.out.println(80/0);
			System.out.println("error solve");
		} catch (Exception e) {
		System.out.println("handle");
		}
		
		
		
	}
}

