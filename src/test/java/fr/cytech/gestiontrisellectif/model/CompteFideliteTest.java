package fr.cytech.gestiontrisellectif.model;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class CompteFideliteTest {
    private CompteFidelite compteFidelite;

    @BeforeEach
    void setUp() {
        compteFidelite = new CompteFidelite(1);
    }

    @Test
    void testCrediter() {
        compteFidelite.crediter(100);
        assertEquals(100, compteFidelite.getPoints());
        
        compteFidelite.crediter(50);
        assertEquals(150, compteFidelite.getPoints());
    }

    @Test
    void testDebiter() {
        compteFidelite.crediter(100);
        compteFidelite.debiter(30);
        assertEquals(70, compteFidelite.getPoints());
        
        // Test qu'on ne peut pas débiter plus que le solde
        compteFidelite.debiter(100);
        assertEquals(70, compteFidelite.getPoints());
    }

    @Test
    void testGetIdCompteFidelite() {
        assertEquals(1, compteFidelite.getIdCompteFidelite());
    }

    @Test
    void testGetPoints() {
        assertEquals(0, compteFidelite.getPoints());
    }
} 