package org.example.models;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CatTest {

    @Test
    void getisSociable() {
        Cat cat = new Cat();
        cat.setisSociable(true);
        assertTrue(cat.getisSociable());
    }

    @Test
    void setisSociable() {
        Cat cat = new Cat();
        cat.setisSociable(false);
        assertFalse(cat.getisSociable());
    }

    @Test
    void getBreed() {
        Cat cat = new Cat();
        cat.setBreed("Siamese");
        assertEquals("Siamese", cat.getBreed());
    }

    @Test
    void setBreed() {
        Cat cat = new Cat();
        cat.setBreed("Persian");
        assertEquals("Persian", cat.getBreed());
    }
}
