package org.example.interfaces;

import org.example.models.Animal;
import org.example.models.AnimalComparators;

import java.util.List;
public interface iShelter {
    void addAnimal(Animal animal);
    void removeAnimalById(int id);
    Animal getAnimalById(int id);
    List<Animal> getAnimals();
    void sortAnimalsbyName();
    void sortAnimalsbyAge();
    void sortAnimalsbyAdmissionDate();
    void sortAnimalsbyID();
    void saveToFile(String filePath);
    void loadFromFile(String filePath);
}
