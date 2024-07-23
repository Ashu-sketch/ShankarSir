package ExceptionHandling;

public class IllegalArguemnet {
	int age;

    public void setAge(int age) {
    	
        if (age < 0) {
        	throw new IllegalArgumentException("Age must be greater than zero"); //Throw IllegalArgumentException if age is negative
        	   
        } else {
            this.age = age;
            System.out.println("The person's age is: " + this.age);
        }
    }

    public static void main(String[] args) {
    	
    	IllegalArguemnet person = new IllegalArguemnet();
    	
    try {
    	person.setAge(-1);
	} catch( ArithmeticException  e  ) {
}
    	
    	
    }
}