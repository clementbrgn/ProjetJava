package fr.cytech.gestiontrisellectif.model;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import java.util.List;

public class UtilisateurTest {
    private Utilisateur utilisateur;
    private PoubelleIntelligente poubelleVerte;
    private PoubelleIntelligente poubelleJaune;
    private List<Dechet> dechets;

    @BeforeEach
    void setUp() {
        utilisateur = new Utilisateur("U1", "Dupont", "Jean", "jean.dupont@email.com");
        poubelleVerte = new PoubelleIntelligente("P1", 100.0, "Rue de la Paix", TypePoubelle.VERTE);
        setPoubelleJaune(new PoubelleIntelligente("P2", 100.0, "Rue de la Paix", TypePoubelle.JAUNE));
        
        dechets = new ArrayList<>();
        dechets.add(new Dechet("D1", TypeDechet.VERRE, 2.0));
        dechets.add(new Dechet("D2", TypeDechet.PLASTIQUE, 1.0));
    }

    @Test
    void testDeposerDechets() {
        utilisateur.deposerDechets(poubelleVerte, dechets);
        
        // Vérifier les points (seul le verre devrait compter)
        assertEquals(20, utilisateur.consulterPoints());
        
        // Vérifier l'historique
        List<HistoriqueDepot> historique = utilisateur.consulterHistorique();
        assertEquals(1, historique.size());
        assertEquals(20, historique.get(0).getPointsGagnes());
    }

    @Test
    void testConvertirPoints() {
        // Ajouter des points
        utilisateur.deposerDechets(poubelleVerte, dechets);
        assertEquals(20, utilisateur.consulterPoints());
        
        // Convertir des points
        Commerce commerce = new Commerce("C1", "SuperMarché");
        utilisateur.convertirPoints(15, commerce);
        assertEquals(5, utilisateur.consulterPoints());
    }

    @Test
    void testConsulterHistorique() {
        utilisateur.deposerDechets(poubelleVerte, dechets);
        List<HistoriqueDepot> historique = utilisateur.consulterHistorique();
        
        assertNotNull(historique);
        assertEquals(1, historique.size());
        assertEquals("U1", historique.get(0).getIdUtilisateur());
        assertEquals("P1", historique.get(0).getIdPoubelle());
    }

	public PoubelleIntelligente getPoubelleJaune() {
		return poubelleJaune;
	}

	public void setPoubelleJaune(PoubelleIntelligente poubelleJaune) {
		this.poubelleJaune = poubelleJaune;
	}
} 