package org.example.models;

import java.time.LocalDate;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;

import org.example.interfaces.iAnimal;

@JsonTypeInfo(
        use = JsonTypeInfo.Id.NAME,
        include = JsonTypeInfo.As.PROPERTY,
        property = "species"
)
@JsonSubTypes({
        @JsonSubTypes.Type(value = Dog.class, name = "Dog"),
        @JsonSubTypes.Type(value = Cat.class, name = "Cat"),
        @JsonSubTypes.Type(value = Bird.class, name = "Bird"),
        @JsonSubTypes.Type(value = Other.class, name = "Other")
})

public abstract class Animal implements iAnimal {

    private int id;
    private String name;
    private LocalDate birthDate;
    private LocalDate admissionDate;
    private String healthStatus;
    private boolean isAdopted;

    public Animal() {}
    public Animal(int id, String name, LocalDate birthDate,
                  LocalDate admissionDate, String healthStatus, boolean isAdopted) {
        this.id = id;
        this.name = name;
        this.birthDate = birthDate;
        this.admissionDate = admissionDate;
        this.healthStatus = healthStatus;
        this.isAdopted = isAdopted;
    }

    public LocalDate getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(LocalDate birthDate) {
        this.birthDate = birthDate;
    }

    public LocalDate getAdmissionDate() {
        return admissionDate;
    }

    public void setAdmissionDate(LocalDate admissionDate) {
        this.admissionDate = admissionDate;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getHealthStatus() {
        return healthStatus;
    }

    public void setHealthStatus(String healthStatus) {
        this.healthStatus = healthStatus;
    }

    public boolean getisAdopted() {
        return isAdopted;
    }

    public void setisAdopted(boolean isAdopted) {
        this.isAdopted = isAdopted;
    }

    @JsonIgnore
    public int getAge() {
        return LocalDate.now().getYear() - birthDate.getYear();
    }

    @JsonProperty("species")
    public String getSpecies() {
        return getClass().getSimpleName();
    }
}
