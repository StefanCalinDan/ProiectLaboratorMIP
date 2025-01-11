package org.example.models;

import org.example.models.Animal;
import java.util.Comparator;

public class AnimalComparators {
    public static final Comparator<Animal> AGE_COMPARATOR = new AgeComparator();
    public static final Comparator<Animal> ADMISSION_DATE_COMPARATOR = new AdmissionDateComparator();
    public static final Comparator<Animal> NAME_COMPARATOR = new NameComparator();
    public static final Comparator<Animal> ID_COMPARATOR = new IDComparator();

    static class AgeComparator implements Comparator<Animal> {
        @Override
        public int compare(Animal a1, Animal a2) {
            return Integer.compare(a1.getAge(), a2.getAge());
        }
    }

    static class AdmissionDateComparator implements Comparator<Animal> {
        @Override
        public int compare(Animal a1, Animal a2) {
            return a1.getAdmissionDate().compareTo(a2.getAdmissionDate());
        }
    }

    static class NameComparator implements Comparator<Animal> {
        @Override
        public int compare(Animal a1, Animal a2) {
            return a1.getName().compareToIgnoreCase(a2.getName());
        }
    }
    static class IDComparator implements Comparator<Animal> {
        @Override
        public int compare(Animal a1, Animal a2) {return Integer.compare(a1.getId(),a2.getId());}
    }
}
