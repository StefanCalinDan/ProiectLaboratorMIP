package org.example.models;

public class AnimalPrinter <T extends Animal> {
    public static <T extends Animal> void printAnimalDetails(T animal) {
        System.out.println("ID: " + animal.getId());
        System.out.println("Name: " + animal.getName());
        System.out.println("Species: " + animal.getClass().getSimpleName());
        System.out.println("Birth Date: " + animal.getBirthDate());
        System.out.println("Admission Date: " + animal.getAdmissionDate());
        System.out.println("Health Status: " + animal.getHealthStatus());
        System.out.println("Is Adopted: " + animal.getisAdopted());

        if (animal instanceof Dog) {
            Dog dog = (Dog) animal;
            System.out.println("Breed: " + dog.getBreed());
            System.out.println("Training Level: " + dog.getTrainingLevel());
        } else if (animal instanceof Cat) {
            Cat cat = (Cat) animal;
            System.out.println("Breed: " + cat.getBreed());
            System.out.println("Is Sociable: " + cat.getisSociable());
        } else if (animal instanceof Bird) {
            Bird bird = (Bird) animal;
            System.out.println("Wing Span: " + bird.getWingSpan());
            System.out.println("Can Fly: " + bird.getCanFly());
        } else if (animal instanceof Other) {
            Other other = (Other) animal;
            System.out.println("Description: " + other.getDescription());
        }

        System.out.println("\n");
    }
}
