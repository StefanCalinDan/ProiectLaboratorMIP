package org.example.models;

import org.junit.jupiter.api.Test;

import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.*;

class AnimalTest {

    @Test
    void getBirthDate() {
        Animal animal = new Cat();
        animal.setBirthDate(LocalDate.of(2022, 5, 31));
        assertEquals(LocalDate.of(2022, 5, 31), animal.getBirthDate());
    }

    @Test
    void setBirthDate() {
        Animal animal = new Dog();
        animal.setBirthDate(LocalDate.of(2019, 5, 15));
        assertEquals(LocalDate.of(2019, 5, 15), animal.getBirthDate());
    }

    @Test
    void getAdmissionDate() {
        Animal animal = new Cat();
        animal.setAdmissionDate(LocalDate.of(2023, 7, 10));
        assertEquals(LocalDate.of(2023, 7, 10), animal.getAdmissionDate());
    }

    @Test
    void setAdmissionDate() {
        Animal animal = new Bird();
        animal.setAdmissionDate(LocalDate.of(2021, 6, 10));
        assertEquals(LocalDate.of(2021, 6, 10), animal.getAdmissionDate());
    }

    @Test
    void getId() {
        Animal animal = new Other();
        animal.setId(123);
        assertEquals(123, animal.getId());
    }

    @Test
    void setId() {
        Animal animal = new Dog();
        animal.setId(456);
        assertEquals(456, animal.getId());
    }

    @Test
    void getName() {
        Animal animal = new Cat();
        animal.setName("Whiskers");
        assertEquals("Whiskers", animal.getName());
    }

    @Test
    void setName() {
        Animal animal = new Bird();
        animal.setName("Tweety");
        assertEquals("Tweety", animal.getName());
    }

    @Test
    void getHealthStatus() {
        Animal animal = new Dog();
        animal.setHealthStatus("Injured");
        assertEquals("Injured", animal.getHealthStatus());
    }

    @Test
    void setHealthStatus() {
        Animal animal = new Cat();
        animal.setHealthStatus("Healthy");
        assertEquals("Healthy", animal.getHealthStatus());
    }

    @Test
    void getisAdopted() {
        Animal animal = new Bird();
        animal.setisAdopted(true);
        assertTrue(animal.getisAdopted());
    }

    @Test
    void setisAdopted() {
        Animal animal = new Other();
        animal.setisAdopted(false);
        assertFalse(animal.getisAdopted());
    }

    @Test
    void getAge() {
        Animal animal = new Dog();
        animal.setBirthDate(LocalDate.of(2015, 1, 1));
        assertEquals(LocalDate.now().getYear() - 2015, animal.getAge());
    }

    @Test
    void getSpecies() {
        Animal animal = new Dog();
        assertEquals("Dog", animal.getSpecies());
    }
}
