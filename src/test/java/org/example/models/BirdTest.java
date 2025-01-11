package org.example.models;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BirdTest {

    @Test
    void getWingSpan() {
        Bird bird = new Bird();
        bird.setWingSpan("15cm");
        assertEquals("15cm", bird.getWingSpan());
    }

    @Test
    void setWingSpan() {
        Bird bird = new Bird();
        bird.setWingSpan("20cm");
        assertEquals("20cm", bird.getWingSpan());
    }

    @Test
    void getCanFly() {
        Bird bird = new Bird();
        bird.setCanFly(true);
        assertTrue(bird.getCanFly());
    }

    @Test
    void setCanFly() {
        Bird bird = new Bird();
        bird.setCanFly(false);
        assertFalse(bird.getCanFly());
    }
}
