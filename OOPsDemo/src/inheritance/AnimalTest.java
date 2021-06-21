package inheritance;

import java.util.Scanner;

import javax.swing.JOptionPane;

public class AnimalTest {

	public static void main(String[] args) throws ClassNotFoundException, InstantiationException, IllegalAccessException {
//		Dog dog; // Ref creation - Rule 1: We can call features of Reference type, this decides on Compilation : Compiler Rule
//	
//		dog =  new Dog("Tommy"); // Object Instantiation :  Rule 2: Your method call will be redirected to object type : JVM Rule
//		dog.eat();
//		dog.run();
//		dog.bark();
		
		Scanner sc= new Scanner(System.in);
		String animalType = JOptionPane.showInputDialog("Enter Animal Type");
		String animalName =  JOptionPane.showInputDialog("Give Animal Name");
		Animal animal;
		Class c = Class.forName("inheritance."+animalType);
		animal = (Animal) c.newInstance(); //downcasting
		animal.setName(animalName);
		
		animal.eat();
		animal.run();
		if(animal instanceof Dog) {
			((Dog)animal).bark();
		}
		if(animal instanceof Cat) {
			((Cat)animal).bite();
		}
		
		
		
	
		
		

	}

}
