package org.example.models;

import org.example.interfaces.iShelter;
import java.util.*;
import java.time.LocalDate;
import java.time.Period;

import static org.example.models.AnimalPrinter.printAnimalDetails;
import static org.example.models.AnimalReader.readAnimalFromInput;

public class ShelterService{

    public void Run(){
        iShelter shelter = new Shelter();
        shelter.loadFromFile("src/main/resources/Animals.json");
        int id = 0;
        for(Animal animal:shelter.getAnimals())
        {
            if(animal.getId() > id)
                id = animal.getId();
        }
        id++;
        int option;
        //AnimalReader reader = new AnimalReader();
        System.out.println("Welcome!");
        do {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Please choose an option: ");
            System.out.println("1. Add animal (keyboard input)");
            System.out.println("2. Show animal by id");
            System.out.println("3. Show oldest animal");
            System.out.println("4. Show animal that has been in the shelter for the longest amount of time");
            System.out.println("5. Print all animals");
            System.out.println("6. Remove animal by id");
            System.out.println("7. Exit \n");
            option = scanner.nextInt();
            scanner.nextLine();
            switch (option) {
                case 1:
                    try{
                        readAnimalFromInput(id,scanner,shelter); id++;
                    }
                    catch(Exception e)
                    {
                        System.out.println(e.getMessage());
                    }

                    break;
                case 2:
                    System.out.println("Enter animal id:");
                    int desiredID = scanner.nextInt(); scanner.nextLine();
                    for (Animal animal : shelter.getAnimals()) {
                        if(animal.getId() == desiredID) {
                            printAnimalDetails(animal);
                            break;
                        }
                    } break;

                case 3: shelter.sortAnimalsbyAge();
                    var animalOld = shelter.getAnimals().getLast();
                    System.out.println(animalOld.getName() + " Age: " + animalOld.getAge());
                    break;
                case 4: shelter.sortAnimalsbyAdmissionDate();
                    var animalLongestTime = shelter.getAnimals().getFirst();
                    LocalDate currentDate = LocalDate.now();
                    Period timeSpent = Period.between(animalLongestTime.getAdmissionDate(), currentDate);
                    System.out.println(animalLongestTime.getName() + " Time spent here: " +
                            timeSpent.getYears() + " years, " +
                            timeSpent.getMonths() + " months, and " +
                            timeSpent.getDays() + " days.");
                    break;
                case 5: for (Animal animal : shelter.getAnimals()) {
                    printAnimalDetails(animal);
                }
                    break;
                case 6: System.out.println("Enter the id of the animal you want to remove:");
                    int idToRemove = scanner.nextInt(); scanner.nextLine();
                    shelter.removeAnimalById(idToRemove);
                    break;
                case 7: System.out.println("Goodbye!"); break;
                default: System.out.println("Invalid option, try again.");
            }
        }while(option != 7);

        shelter.sortAnimalsbyID();
        shelter.saveToFile("src/main/resources/Animals.json");

    }
}
