package org.example.models;
import org.example.interfaces.iOther;
import java.time.LocalDate;
public class Other extends Animal implements iOther {

    private String description;

    public Other() {}
    public Other(int id, String name, LocalDate birthDate, LocalDate admissionDate, String healthStatus, boolean isAdopted, String description) {
        super(id, name, birthDate, admissionDate, healthStatus, isAdopted);
        this.description = description;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}

