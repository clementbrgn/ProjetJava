package fr.cytech.gestiontrisellectif.model;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class PoubelleIntelligenteTest {
    private PoubelleIntelligente poubelleVerte;
    private PoubelleIntelligente poubelleJaune;
    private Dechet dechetVerre;
    private Dechet dechetPlastique;

    @BeforeEach
    void setUp() {
        poubelleVerte = new PoubelleIntelligente("P1", 100.0, "Rue de la Paix", TypePoubelle.VERTE);
        poubelleJaune = new PoubelleIntelligente("P2", 100.0, "Rue de la Paix", TypePoubelle.JAUNE);
        dechetVerre = new Dechet("D1", TypeDechet.VERRE, 2.0);
        dechetPlastique = new Dechet("D2", TypeDechet.PLASTIQUE, 1.0);
    }

    @Test
    void testVerifierConformite() {
        assertTrue(poubelleVerte.verifierConformite(dechetVerre));
        assertFalse(poubelleVerte.verifierConformite(dechetPlastique));
        assertTrue(poubelleJaune.verifierConformite(dechetPlastique));
    }

    @Test
    void testAttribuerPoints() {
        int pointsVerte = poubelleVerte.attribuerPoints(dechetVerre);
        assertEquals(20, pointsVerte); // 2.0 kg * 10 points

        int pointsJaune = poubelleJaune.attribuerPoints(dechetPlastique);
        assertEquals(10, pointsJaune); // 1.0 kg * 10 points

        int pointsMauvaisType = poubelleVerte.attribuerPoints(dechetPlastique);
        assertEquals(-5, pointsMauvaisType); // 1.0 kg * -5 points
    }

    @Test
    void testEstPleine() {
        assertFalse(poubelleVerte.estPleine());
        
        // Ajouter des déchets jusqu'à la capacité maximale
        for (int i = 0; i < 50; i++) {
            poubelleVerte.ajouterDechet(new Dechet("D" + i, TypeDechet.VERRE, 2.0));
        }
        
        assertTrue(poubelleVerte.estPleine());
    }

    @Test
    void testAjouterDechet() {
        poubelleVerte.ajouterDechet(dechetVerre);
        assertEquals(1, poubelleVerte.getDechets().size());
        assertEquals(2.0, poubelleVerte.getNiveauActuel());
    }
} 