package overriding;

import java.util.Scanner;

import javax.swing.JOptionPane;

public class AnimalTest {

	public static void main(String[] args) throws ClassNotFoundException, InstantiationException, IllegalAccessException {
		Animal animal;
		Scanner sc= new Scanner(System.in);
		String animalType = JOptionPane.showInputDialog("Enter Animal Type");
		String animalName =  JOptionPane.showInputDialog("Give Animal Name");
		
		Class c = Class.forName("overriding."+animalType); // this will load the specified class in the class loader.
		animal = (Animal) c.newInstance(); //downcasting ------ This newInstace will create the object in heap memory, for the loaded class
		animal.setName(animalName);

		animal.eat();
	}

}
