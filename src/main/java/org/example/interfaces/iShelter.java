package org.example.interfaces;

import org.example.models.Animal;
import org.example.models.AnimalComparators;

import java.util.List;
public interface iShelter {
    void addAnimal(Animal animal);
    void removeAnimalById(int id);
    Animal getAnimalById(int id);
    public List<Animal> getAnimals();
    public void sortAnimalsbyName();
    public void sortAnimalsbyAge();
    public void sortAnimalsbyAdmissionDate();
    public void sortAnimalsbyID();
    void saveToFile(String filePath);
    void loadFromFile(String filePath);
}
