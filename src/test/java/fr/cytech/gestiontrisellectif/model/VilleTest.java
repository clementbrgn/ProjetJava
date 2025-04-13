package fr.cytech.gestiontrisellectif.model;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class VilleTest {
    private Ville ville;

    @BeforeEach
    void setUp() {
        ville = new Ville(1, "Paris");
    }

    @Test
    void testGetIdVille() {
        assertEquals(1, ville.getIdVille());
    }

    @Test
    void testGetNom() {
        assertEquals("Paris", ville.getNom());
    }
} 