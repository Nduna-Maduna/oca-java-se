package packagingcompilinginterpretingjavacode; // Package statement
/* Imports class ArrayList from the java.util package */
import java.util.ArrayList;
/* Imports all classes from the java.io package */
import java.io.*;

public class MainClass {

	public static void main(String[] args) {
		/* Creates console from the java.io package - run outside of your IDE */
		Console console = System.console();
		String planet = console.readLine(" \nEnter your favorite planet: ");
		/* Creates list for planets */
		ArrayList planetList = new ArrayList();
		planetList.add(planet);
		planetList.add("Gliese 581 c");// Adds a string to the list
		System.out.println(" \nTwo cool planets: " + planetList);
		
	}

}
