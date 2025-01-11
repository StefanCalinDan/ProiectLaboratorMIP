package org.example.models;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.datatype.jsr310.JavaTimeModule;

import java.io.File;
import java.io.IOException;
import java.util.List;
import java.util.ArrayList;

import org.example.interfaces.iShelter;

public class Shelter implements iShelter {

    private List<Animal> animals;

    public Shelter() {
        this.animals = new ArrayList<>();
    }

    public void addAnimal(Animal animal) {
        animals.add(animal);
    }

    public void removeAnimalById(int id) {
        animals.removeIf(animal -> animal.getId() == id);
    }

    public Animal getAnimalById(int id) {
        return animals.stream().filter(animal -> animal.getId() == id).findFirst().orElse(null);
    }

    public List<Animal> getAnimals() {
        return animals;
    }

    public void sortAnimalsbyName() {
        this.animals.sort(AnimalComparators.NAME_COMPARATOR);
    }
    public void sortAnimalsbyAge() {
        this.animals.sort(AnimalComparators.AGE_COMPARATOR);
    }
    public void sortAnimalsbyAdmissionDate() {
        this.animals.sort(AnimalComparators.ADMISSION_DATE_COMPARATOR);
    }
    public void sortAnimalsbyID() {
        this.animals.sort(AnimalComparators.ID_COMPARATOR);
    }

   public void saveToFile(String filePath) {
       ObjectMapper mapper = new ObjectMapper();
       mapper.registerModule(new JavaTimeModule());

       try {
           mapper.writeValue(new File(filePath), animals);
       } catch (IOException e) {
           e.printStackTrace();
       }
   }

    public void loadFromFile(String filePath) {
        ObjectMapper mapper = new ObjectMapper();
        mapper.registerModule(new JavaTimeModule());

        try {
            animals = mapper.readValue(new File(filePath), new TypeReference<List<Animal>>() {});
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
