package org.example.models;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class OtherTest {

    @Test
    void getDescription() {
        Other other = new Other();
        other.setDescription("Exotic animal");
        assertEquals("Exotic animal", other.getDescription());
    }

    @Test
    void setDescription() {
        Other other = new Other();
        other.setDescription("Rare species");
        assertEquals("Rare species", other.getDescription());
    }
}
