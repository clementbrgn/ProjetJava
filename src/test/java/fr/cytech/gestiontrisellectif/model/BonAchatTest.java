package fr.cytech.gestiontrisellectif.model;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class BonAchatTest {
    private BonAchat bonAchat;

    @BeforeEach
    void setUp() {
        bonAchat = new BonAchat(1, 10, CategorieProduit.ALIMENTAIRE);
    }

    @Test
    void testGetIdBonAchat() {
        assertEquals(1, bonAchat.getIdBonAchat());
    }

    @Test
    void testGetPourcentageReduction() {
        assertEquals(10, bonAchat.getPourcentageReduction());
    }

    @Test
    void testGetCategorieProduit() {
        assertEquals(CategorieProduit.ALIMENTAIRE, bonAchat.getCategorieProduit());
    }
} 