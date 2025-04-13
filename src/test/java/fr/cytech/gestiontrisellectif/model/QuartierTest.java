package fr.cytech.gestiontrisellectif.model;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class QuartierTest {
    private Quartier quartier;
    private Ville ville;

    @BeforeEach
    void setUp() {
        ville = new Ville(1, "Paris");
        quartier = new Quartier(1, "Quartier Test", ville);
    }

    @Test
    void testGetIdQuartier() {
        assertEquals(1, quartier.getIdQuartier());
    }

    @Test
    void testGetNom() {
        assertEquals("Quartier Test", quartier.getNom());
    }

    @Test
    void testGetVille() {
        assertNotNull(quartier.getVille());
        assertEquals(ville, quartier.getVille());
        assertEquals("Paris", quartier.getVille().getNom());
    }
} 