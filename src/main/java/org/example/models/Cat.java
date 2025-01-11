package org.example.models;
import java.time.LocalDate;
public class Cat extends Animal {

    private String breed;
    private boolean isSociable;

    public Cat() {}
    public Cat(int id, String name, LocalDate birthDate, LocalDate admissionDate, String healthStatus,
               boolean isAdopted, String breed, boolean isSociable) {
        super(id, name, birthDate, admissionDate, healthStatus, isAdopted);
        this.isSociable = isSociable;
        this.breed = breed;
    }

    public boolean getisSociable() {
        return isSociable;
    }

    public void setisSociable(boolean sociable) {
        isSociable = sociable;
    }

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }
}
