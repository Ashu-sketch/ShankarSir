package com.ObjectGame;

//Main.java
public class Main {
 public static void main(String[] args) {
     // Create an instance of DataManager
     DataManager dataManager = new DataManager();
     
     // Access the Person object through DataManager
     Person person = dataManager.getPerson();
     
     // Display the fetched data
     System.out.println("Name: " + person.getName());
     System.out.println("Age: " + person.getAge());
 }
}

