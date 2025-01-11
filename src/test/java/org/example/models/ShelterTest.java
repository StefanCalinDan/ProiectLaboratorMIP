package org.example.models;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class ShelterTest {

    private Shelter shelter;

    @BeforeEach
    void setUp() {
        shelter = new Shelter();
        shelter.addAnimal(new Dog(1, "Rex", LocalDate.of(2018, 6, 1), LocalDate.of(2022, 1, 15), "Healthy", false, "Labrador", "Advanced"));
        shelter.addAnimal(new Cat(2, "Kitty",  LocalDate.of(2020, 3, 5), LocalDate.of(2023, 5, 20), "Healthy", false, "Siamese", true));
        shelter.addAnimal(new Bird(3, "Tweety",  LocalDate.of(2019, 4, 12), LocalDate.of(2021, 6, 10), "Injured", false, "15cm", false));
    }

    @Test
    void addAnimal() {
        Animal bird = new Bird(4, "Robin", LocalDate.of(2021, 3, 5), LocalDate.of(2023, 4, 20), "Healthy", false, "20cm", true);
        shelter.addAnimal(bird);
        assertTrue(shelter.getAnimals().contains(bird), "Animal should be added to the shelter");
    }

    @Test
    void removeAnimalById() {
        shelter.removeAnimalById(1);
        assertNull(shelter.getAnimalById(1), "Animal with ID 1 should be removed");
    }

    @Test
    void getAnimalById() {
        Animal animal = shelter.getAnimalById(2);
        assertNotNull(animal, "Animal with ID 2 should exist");
        assertEquals("Kitty", animal.getName(), "Animal with ID 2 should be Kitty");
    }

    @Test
    void getAnimals() {
        List<Animal> animals = shelter.getAnimals();
        assertEquals(3, animals.size(), "Shelter should contain 3 animals");
    }

    @Test
    void sortAnimalsbyName() {
        shelter.sortAnimalsbyName();
        assertEquals("Kitty", shelter.getAnimals().getFirst().getName(), "First animal should be Kitty after sorting by name");
    }

    @Test
    void sortAnimalsbyAge() {
        shelter.sortAnimalsbyAge();
        assertEquals("Rex", shelter.getAnimals().getLast().getName(), "First animal should be Rex after sorting by age (oldest first)");
    }

    @Test
    void sortAnimalsbyAdmissionDate() {
        shelter.sortAnimalsbyAdmissionDate();
        assertEquals("Tweety", shelter.getAnimals().getFirst().getName(), "First animal should be Tweety after sorting by admission date");
    }

    @Test
    void sortAnimalsbyID() {
        shelter.sortAnimalsbyID();
        assertEquals(1, shelter.getAnimals().getFirst().getId(), "First animal should have ID 1 after sorting by ID");
    }

    @Test
    void saveToFile() {
        String filePath = "test_shelter.json";
        shelter.saveToFile(filePath);
        assertTrue(new java.io.File(filePath).exists(), "File should be created after saving");
    }

    @Test
    void loadFromFile() {
        String filePath = "test_shelter.json";
        shelter.saveToFile(filePath);

        Shelter loadedShelter = new Shelter();
        loadedShelter.loadFromFile(filePath);

        assertEquals(3, loadedShelter.getAnimals().size(), "Loaded shelter should contain 3 animals");
        assertEquals("Kitty", loadedShelter.getAnimalById(2).getName(), "Animal with ID 2 should be Kitty after loading from file");
    }
}
