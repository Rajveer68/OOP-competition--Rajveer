package app;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import model.*;

public class MyFarm {
    public static void main(String[] args) {
        // Load animals from file
        List<Animal> animals = loadAnimals("OhMyFarm\\animals.txt");
        
        if (animals != null && !animals.isEmpty()) {
            // Initial introductions
            System.out.println("=== Initial Introductions ===\n");
            for (Animal animal : animals) {
                animal.introduce();
                System.out.println();
            }
            
            // Age by 3 months and introduce again
            System.out.println("=== After 3 months ===\n");
            for (Animal animal : animals) {
                animal.growOlder(3);
                animal.introduce();
                System.out.println();
            }
            
            // Age by another 3 months (total 6 months) and introduce again
            System.out.println("=== After 6 months (total) ===\n");
            for (Animal animal : animals) {
                animal.growOlder(3);
                animal.introduce();
                System.out.println();
            }
        }
    }
    
    public static List<Animal> loadAnimals(String filePath) {
        List<Animal> animals = new ArrayList<>();
        try (BufferedReader reader = new BufferedReader(new FileReader(filePath))) {
            String line;
            while ((line = reader.readLine()) != null) {
                line = line.trim();
                if (!line.isEmpty()) {
                    String[] parts = line.split(",");
                    if (parts.length == 3) {
                        String type = parts[0].trim();
                        String name = parts[1].trim();
                        int age = Integer.parseInt(parts[2].trim());
                        
                        Animal animal = createAnimal(type, name, age);
                        if (animal != null) {
                            animals.add(animal);
                        }
                    }
                }
            }
        } catch (IOException e) {
            System.out.println("Error reading file: " + e.getMessage());
            return null;
        }
        return animals;
    }
    
    public static Animal createAnimal(String type, String name, int age) {
        switch (type.toUpperCase()) {
            case "MOUSE":
                return new Mouse(name, age);
            case "DUCK":
                return new Duck(name, age);
            case "PIG":
                return new Pig(name, age);
            default:
                System.out.println("Unknown animal type: " + type);
                return null;
        }
    }
}
