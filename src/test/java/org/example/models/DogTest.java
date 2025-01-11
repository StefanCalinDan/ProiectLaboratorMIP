package org.example.models;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DogTest {

    @Test
    void getBreed() {
        Dog dog = new Dog();
        dog.setBreed("Labrador");
        assertEquals("Labrador", dog.getBreed());
    }

    @Test
    void setBreed() {
        Dog dog = new Dog();
        dog.setBreed("Golden Retriever");
        assertEquals("Golden Retriever", dog.getBreed());
    }

    @Test
    void getTrainingLevel() {
        Dog dog = new Dog();
        dog.setTrainingLevel("Advanced");
        assertEquals("Advanced", dog.getTrainingLevel());
    }

    @Test
    void setTrainingLevel() {
        Dog dog = new Dog();
        dog.setTrainingLevel("Beginner");
        assertEquals("Beginner", dog.getTrainingLevel());
    }
}
