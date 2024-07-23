package ExceptionHandling;

import java.lang.reflect.Method;

public class Example {
    public void sayHello() {
        System.out.println("Hello, World!");
    }

    public static void main(String[] args) {
        try {
            // Correct method name
            Class<?> clazz = Example.class;
            Method method = clazz.getMethod("sayHello");
            method.invoke(new Example());

            // Incorrect method name - this will throw NoSuchMethodException
            Method wrongMethod = clazz.getMethod("sayGoodbye");
            wrongMethod.invoke(new Example());
        } catch (NoSuchMethodException e) {
            System.out.println("Caught NoSuchMethodException: " + e.getMessage());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
