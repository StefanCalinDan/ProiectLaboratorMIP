package org.example.models;

import org.example.interfaces.iShelter;

import java.time.LocalDate;
import java.util.Scanner;

public class AnimalReader {

    public static void readAnimalFromInput(int id, Scanner scanner, iShelter shelter) {
        System.out.println("Enter species(Dog, Cat, Bird, Other):");
        String species = scanner.nextLine();

        System.out.println("Enter name:");
        String name = scanner.nextLine();

        System.out.println("Enter birth date (yyyy-mm-dd):");
        LocalDate birthDate = LocalDate.parse(scanner.nextLine());

        System.out.println("Enter admission date (yyyy-mm-dd):");
        LocalDate admissionDate = LocalDate.parse(scanner.nextLine());

        System.out.println("Enter health status:");
        String healthStatus = scanner.nextLine();

        System.out.println("Is the animal adopted? (true/false):");
        boolean isAdopted = scanner.nextBoolean();
        scanner.nextLine();

        switch (species.toLowerCase()) {
            case "dog":
                System.out.println("Enter breed:");
                String dogBreed = scanner.nextLine();

                System.out.println("Enter training level:");
                String trainingLevel = scanner.nextLine();

                shelter.addAnimal(new Dog(id, name, birthDate, admissionDate, healthStatus, isAdopted, dogBreed, trainingLevel));
                break;
            case "cat":
                System.out.println("Enter breed:");
                String catBreed = scanner.nextLine();
                System.out.println("Is the cat sociable? (true/false):");
                boolean isSociable = scanner.nextBoolean();
                scanner.nextLine();

                shelter.addAnimal(new Cat(id, name, birthDate, admissionDate, healthStatus, isAdopted, catBreed, isSociable));
                break;
            case "bird":
                System.out.println("Enter wing span:");
                String wingSpan = scanner.nextLine();

                System.out.println("Can the bird fly? (true/false):");
                boolean canFly = scanner.nextBoolean();
                scanner.nextLine();

                shelter.addAnimal(new Bird(id, name, birthDate, admissionDate, healthStatus, isAdopted, wingSpan, canFly));
                break;

            case "other":
                System.out.println("Enter description:");
                String description = scanner.nextLine();

                shelter.addAnimal(new Other(id, name, birthDate, admissionDate, healthStatus, isAdopted, description));
                break;

            default:
                throw new RuntimeException("Invalid animal type.");
        }
    }
}
