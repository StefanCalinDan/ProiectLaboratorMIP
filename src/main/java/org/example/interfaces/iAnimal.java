package org.example.interfaces;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.time.LocalDate;

public interface iAnimal {

    public LocalDate getBirthDate();

    public void setBirthDate(LocalDate birthDate);

    public LocalDate getAdmissionDate();

    public void setAdmissionDate(LocalDate admissionDate);

    public int getId();

    public void setId(int id);

    public String getName();

    public void setName(String name);

    public String getHealthStatus();

    public void setHealthStatus(String healthStatus);

    public boolean getisAdopted();

    public void setisAdopted(boolean isAdopted);

    public int getAge();

    public String getSpecies();
}
