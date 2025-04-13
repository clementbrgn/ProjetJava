package fr.cytech.gestiontrisellectif.model;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class PoubelleTest {
    private Poubelle poubelle;

    @BeforeEach
    void setUp() {
        poubelle = new Poubelle(1, "VERTE", "100", "Vert");
    }

    @Test
    void testIdentifierUtilisateur() {
        assertTrue(poubelle.identifierUtilisateur("CODE123"));
    }

    @Test
    void testCalculerQuantite() {
        assertEquals(0, poubelle.calculerQuantite(), 0.01);
    }

    @Test
    void testVerifierDechets() {
        assertTrue(poubelle.verifierDechets());
    }

    @Test
    void testAlertePlein() {
        assertEquals("", poubelle.alertePlein());
    }

    @Test
    void testGetters() {
        assertEquals(1, poubelle.getIdPoubelle());
        assertEquals("VERTE", poubelle.getTypePoubelle());
        assertEquals("100", poubelle.getCapaciteMax());
        assertEquals("Vert", poubelle.getCouleur());
        assertEquals(0, poubelle.getQuantiteActuelle(), 0.01);
    }
} 