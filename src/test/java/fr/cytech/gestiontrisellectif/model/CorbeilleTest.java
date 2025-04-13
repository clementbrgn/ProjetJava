package fr.cytech.gestiontrisellectif.model;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class CorbeilleTest {
    private Corbeille corbeille;
    private Dechet dechet1;
    private Dechet dechet2;

    @BeforeEach
    void setUp() {
        corbeille = new Corbeille();
        dechet1 = new Dechet("D1", TypeDechet.VERRE, 2.0);
        dechet2 = new Dechet("D2", TypeDechet.PLASTIQUE, 1.0);
    }

    @Test
    void testCalculerPoids() {
        corbeille.ajouterDechet(dechet1);
        corbeille.ajouterDechet(dechet2);
        
        assertEquals(3.0, corbeille.calculerPoids(), 0.01);
    }

    @Test
    void testAjouterDechet() {
        corbeille.ajouterDechet(dechet1);
        assertEquals(1, corbeille.getListDechets().size());
        assertEquals(dechet1, corbeille.getListDechets().get(0));
    }

    @Test
    void testGetListDechets() {
        assertTrue(corbeille.getListDechets().isEmpty());
        corbeille.ajouterDechet(dechet1);
        assertFalse(corbeille.getListDechets().isEmpty());
    }
} 