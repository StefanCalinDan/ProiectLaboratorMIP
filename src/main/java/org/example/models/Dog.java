package org.example.models;

import org.example.interfaces.iDog;

import java.time.LocalDate;

public class Dog extends Animal implements iDog {

    private String breed;
    private String trainingLevel;

    public Dog() {}
    public Dog(int id, String name, LocalDate birthDate, LocalDate admissionDate, String healthStatus, boolean isAdopted, String breed, String trainingLevel) {
        super(id, name, birthDate, admissionDate, healthStatus, isAdopted);
        this.breed = breed;
        this.trainingLevel = trainingLevel;
    }

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    public String getTrainingLevel() {
        return trainingLevel;
    }

    public void setTrainingLevel(String trainingLevel) {
        this.trainingLevel = trainingLevel;
    }
}

