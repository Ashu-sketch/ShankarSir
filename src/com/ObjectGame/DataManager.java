package com.ObjectGame;

//DataManager.java
public class DataManager {
 private Person person;

// public DataManager() {
//     person = new Person();
////     DataSetter dataSetter = new DataSetter();
////     dataSetter.setData(person, "Alice", 30);
//     person.setAge(24);
//     person.setName("Ashu");
// }
 
 public Person acess() {
     person = new Person();
//     DataSetter dataSetter = new DataSetter();
//     dataSetter.setData(person, "Alice", 30);
     person.setAge(24);
     person.setName("Ashu");
     return person;
 }
 public Person getPerson() {
	 DataManager data= new DataManager();
	person= data.acess();
     return person;
 }
}

