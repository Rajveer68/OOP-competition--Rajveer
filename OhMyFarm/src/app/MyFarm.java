package app;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;



public class MyFarm {
	public static void main(String[] args) {
		// Run me
		displayTask();

	}
	
	public static void displayTask() {
	    try (BufferedReader reader = new BufferedReader(new FileReader("OhMyFarm\\animals.txt"))) {
	        String line;
	        while ((line = reader.readLine()) != null) {
	            System.out.println(line);
	        }
	    } catch (IOException e) {
	        System.out.println("Error reading file: " + e.getMessage());
	    }
	}

	
}
