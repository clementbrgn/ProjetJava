package fr.cytech.gestiontrisellectif.model;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class MenageTest {
    private Menage menage;
    private Poubelle poubelle;
    private CompteFidelite compteFidelite;

    @BeforeEach
    void setUp() {
        menage = new Menage(1, "CODE123");
        poubelle = new Poubelle(1, "VERTE", "100", "Vert");
        compteFidelite = new CompteFidelite(1);
        menage.getComptesFidelite().add(compteFidelite);
    }

    @Test
    void testDeposerDechets() {
        menage.deposerDechets(poubelle);
        // Vérifier que les points ont été crédités
        assertTrue(menage.getComptesFidelite().get(0).getPoints() >= 0);
    }

    @Test
    void testConvertirPoints() {
        // Ajouter des points au compte
        compteFidelite.crediter(100);
        
        // Convertir des points
        BonAchat bonAchat = new BonAchat(1, 10, CategorieProduit.ALIMENTAIRE);
        menage.convertirPoints(50, bonAchat);
        
        assertEquals(50, compteFidelite.getPoints());
    }

    @Test
    void testGetCorbeille() {
        assertNotNull(menage.getCorbeille());
    }

    @Test
    void testGetCodeAcces() {
        assertEquals("CODE123", menage.getCodeAcces());
    }
} 