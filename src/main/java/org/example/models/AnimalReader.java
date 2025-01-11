package org.example.models;

import org.example.interfaces.iShelter;

import java.time.LocalDate;
import java.util.Scanner;

public class AnimalReader {

    public static Animal readAnimalFromInput(int id, Scanner scanner, iShelter shelter) {
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

                return new Dog(id, name, birthDate, admissionDate, healthStatus, isAdopted, dogBreed, trainingLevel);

            case "cat":
                System.out.println("Enter breed:");
                String catBreed = scanner.nextLine();
                System.out.println("Is the cat sociable? (true/false):");
                boolean isSociable = scanner.nextBoolean();
                scanner.nextLine();

                return new Cat(id, name, birthDate, admissionDate, healthStatus, isAdopted, catBreed, isSociable);

            case "bird":
                System.out.println("Enter wing span:");
                String wingSpan = scanner.nextLine();

                System.out.println("Can the bird fly? (true/false):");
                boolean canFly = scanner.nextBoolean();
                scanner.nextLine();

                return new Bird(id, name, birthDate, admissionDate, healthStatus, isAdopted, wingSpan, canFly);


            case "other":
                System.out.println("Enter description:");
                String description = scanner.nextLine();

                return new Other(id, name, birthDate, admissionDate, healthStatus, isAdopted, description);


            default:
                throw new RuntimeException("Invalid animal type.");
        }
    }
}
