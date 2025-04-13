package fr.cytech.gestiontrisellectif.model;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import java.util.Map;

public class CentreTriTest {
    private CentreTri centreTri;
    private Poubelle poubelle;
    private Quartier quartier;
    private Ville ville;

    @BeforeEach
    void setUp() {
        ville = new Ville(1, "Paris");
        quartier = new Quartier(1, "Quartier Test", ville);
        centreTri = new CentreTri(1, "Centre Test", "123 rue Test");
        poubelle = new Poubelle(1, "VERTE", "100", "Vert");
    }

    @Test
    void testPlacerPoubelle() {
        centreTri.placerPoubelle("Quartier Test", poubelle);
        assertEquals(1, centreTri.getPoubelles().size());
        assertTrue(centreTri.getPoubelles().contains(poubelle));
    }

    @Test
    void testRetirerPoubelle() {
        centreTri.placerPoubelle("Quartier Test", poubelle);
        centreTri.retirerPoubelle(poubelle);
        assertEquals(0, centreTri.getPoubelles().size());
    }

    @Test
    void testCollecterDechets() {
        // Créer une poubelle et ajouter des déchets
        Poubelle poubelleVerte = new Poubelle(1, "VERTE", "10", "Vert");
        Dechet dechetVerre = new Dechet("D1", TypeDechet.VERRE, 5.0);
        poubelleVerte.ajouterDechet(dechetVerre);
        
        // Ajouter la poubelle au centre de tri
        centreTri.placerPoubelle("Quartier Test", poubelleVerte);
        
        // Collecter les déchets
        centreTri.collecterDechets();
        
        // Vérifier les statistiques
        Map<TypeDechet, Double> stats = centreTri.genererStatistiques();
        assertEquals(5.0, stats.get(TypeDechet.VERRE), 0.01);
    }

    @Test
    void testStatistiques() {
        // Ajouter plusieurs poubelles avec différents types de déchets
        Poubelle poubelleVerte = new Poubelle(1, "VERTE", "10", "Vert");
        Poubelle poubelleJaune = new Poubelle(2, "JAUNE", "10", "Jaune");
        
        poubelleVerte.ajouterDechet(new Dechet("D1", TypeDechet.VERRE, 5.0));
        poubelleJaune.ajouterDechet(new Dechet("D2", TypeDechet.PLASTIQUE, 3.0));
        poubelleJaune.ajouterDechet(new Dechet("D3", TypeDechet.METAL, 2.0));
        
        centreTri.placerPoubelle("Quartier Test", poubelleVerte);
        centreTri.placerPoubelle("Quartier Test", poubelleJaune);
        
        centreTri.collecterDechets();
        
        Map<TypeDechet, Double> stats = centreTri.genererStatistiques();
        assertEquals(5.0, stats.get(TypeDechet.VERRE), 0.01);
        assertEquals(3.0, stats.get(TypeDechet.PLASTIQUE), 0.01);
        assertEquals(2.0, stats.get(TypeDechet.METAL), 0.01);
        assertEquals(0.0, stats.get(TypeDechet.CARTON), 0.01);
    }

    @Test
    void testGetters() {
        assertEquals(1, centreTri.getIdCentreDeTri());
        assertEquals("Centre Test", centreTri.getNom());
        assertEquals("123 rue Test", centreTri.getAdresse());
        assertNotNull(centreTri.getPoubelles());
    }
} 