package ExceptionHandling;

import java.lang.reflect.Field;

public class NoSuchFieldExceptionExample {
    public static void main(String[] args) {
        // Create an instance of the TestClass
        TestClass testObject = new TestClass();

        try {
            // Attempt to get a field that does not exist
            Field field = TestClass.class.getField("existingField");
            System.out.println(field);
            
            System.out.println("hii");
        } catch (NoSuchFieldException e) {
            // Handle the NoSuchFieldException
            System.out.println("Field not found: " + e.getMessage());
        }
    }
}

class TestClass {
    public String existingField="jaipur";
}

