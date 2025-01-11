package org.example.models;

import java.time.LocalDate;

public class Bird extends Animal {

    private String wingSpan;
    private boolean canFly;

    public Bird(int id, String name, LocalDate birthDate, LocalDate admissionDate, String healthStatus, boolean isAdopted, String wingSpan, boolean canFly) {
        super(id, name, birthDate, admissionDate, healthStatus, isAdopted);
        this.wingSpan = wingSpan;
        this.canFly = canFly;
    }

    public Bird() {}

    public String getWingSpan() {
        return wingSpan;
    }

    public void setWingSpan(String wingSpan) {
        this.wingSpan = wingSpan;
    }

    public boolean isCanFly() {
        return canFly;
    }

    public void setCanFly(boolean canFly) {
        this.canFly = canFly;
    }
}
