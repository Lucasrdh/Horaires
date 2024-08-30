package org.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import java.time.LocalDateTime;

class WelcomeTest {

    @Test
    void bonjourTest() {
        Idate fakeDate = new FakeDate(LocalDateTime.of(2024, 8, 26, 10, 0)); // Lundi à 10h
        Welcome welcome = new Welcome(fakeDate);
        assertEquals("Bonjour", welcome.getMessage());
    }

    @Test
    void bonApresMidiTest(){
        Idate fakeDate = new FakeDate(LocalDateTime.of(2024, 8, 26, 14, 0)); // Lundi à 14h
        Welcome welcome = new Welcome(fakeDate);
        assertEquals("Bon après-midi", welcome.getMessage());
    }

    @Test
    void bonsoirTest(){
        Idate fakeDate = new FakeDate(LocalDateTime.of(2024, 8, 26, 20, 0)); // Lundi à 20h
        Welcome welcome = new Welcome(fakeDate);
        assertEquals("Bonsoir", welcome.getMessage());
    }

    @Test
    void bonWeekEndTest(){
        Idate fakeDate = new FakeDate(LocalDateTime.of(2024, 8, 30, 19, 0)); // Vendredi à 19h
        Welcome welcome = new Welcome(fakeDate);
        assertEquals("Bon week-end", welcome.getMessage());
    }
}
