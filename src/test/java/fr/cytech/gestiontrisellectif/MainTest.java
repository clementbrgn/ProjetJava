package fr.cytech.gestiontrisellectif;

import fr.cytech.gestiontrisellectif.model.*;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class MainTest {
    @Test
    void testScenarioComplet() {
        // Création du centre de tri
        CentreTri centreTri = new CentreTri(0, "Centre de Tri Paris", "123 Rue de Paris");
        
        // Création des poubelles
        PoubelleIntelligente poubelleVerte = new PoubelleIntelligente("P1", 100.0, "Rue de la Paix", TypePoubelle.VERTE);
        PoubelleIntelligente poubelleJaune = new PoubelleIntelligente("P2", 100.0, "Rue de la Paix", TypePoubelle.JAUNE);
        
        // Placement des poubelles
        centreTri.placerPoubelle(poubelleVerte);
        centreTri.retirerPoubelle(poubelleJaune);
        
        // Création d'un utilisateur
        Utilisateur utilisateur = new Utilisateur("U1", "Dupont", "Jean", "jean.dupont@email.com");
        
        // Création des déchets
        List<Dechet> dechets = new ArrayList<>();
        dechets.add(new Dechet("D1", TypeDechet.VERRE, 2.0));
        dechets.add(new Dechet("D2", TypeDechet.PLASTIQUE, 1.0));
        
        // Dépôt des déchets
        utilisateur.deposerDechets(poubelleVerte, dechets);
        
        // Vérification des points
        assertEquals(20, utilisateur.consulterPoints());
        
        // Création d'un commerce et d'un contrat
        Commerce commerce = new Commerce("C1", "SuperMarché");
        commerce.ajouterCategorie(CategorieProduit.ALIMENTAIRE);
        
        ContratPartenariat contrat = new ContratPartenariat(
            "CT1",
            LocalDate.now(),
            LocalDate.now().plusYears(1)
        );
        
        ReglePoints regle = new ReglePoints(500, 5.0, CategorieProduit.ALIMENTAIRE);
        contrat.ajouterRegle(regle);
        
        commerce.definirReglesPoints(contrat);
        
        // Vérification du contrat
        assertTrue(contrat.estValide());
        assertEquals(1, commerce.getContrats().size());
        
        // Collecte des déchets
        centreTri.collecterDechets();
        
        // Vérification des statistiques
        Map<TypeDechet, Double> statistiques = centreTri.genererStatistiques();
        assertEquals(2.0, statistiques.get(TypeDechet.VERRE));
    }
} 