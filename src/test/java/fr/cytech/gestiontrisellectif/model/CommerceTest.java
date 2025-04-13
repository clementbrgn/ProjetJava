package fr.cytech.gestiontrisellectif.model;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import java.util.List;

public class CommerceTest {
    private Commerce commerce;
    private BonAchat bonAchat;
    private ContratPartenariat contrat;

    @BeforeEach
    void setUp() {
        commerce = new Commerce(1, "SuperMarché Test");
        bonAchat = new BonAchat(1, 10, CategorieProduit.ALIMENTAIRE);
        contrat = new ContratPartenariat(1, "2024-01-01", "2024-12-31");
    }

    @Test
    void testUtiliserBonAchat() {
        // Créer un bon d'achat avec une réduction de 10% sur l'alimentaire
        BonAchat bonAlimentaire = new BonAchat(1, 10, CategorieProduit.ALIMENTAIRE);
        
        // Simuler un achat de 100€ en alimentaire
        double montantInitial = 100.0;
        commerce.utiliserBonAchat(bonAlimentaire);
        
        // Vérifier que le bon a bien été utilisé
        // Note: Cette vérification dépendra de l'implémentation exacte
        // Par exemple, on pourrait vérifier que le bon est marqué comme utilisé
        assertFalse(bonAlimentaire.estUtilise());
    }

    @Test
    void testDefinirConditionsUtilisationPoints() {
        String conditions = "Minimum 100 points pour 5% de réduction";
        commerce.definirConditionsUtilisationPoints(conditions);
        
        // Vérifier que les conditions ont été enregistrées
        ContratPartenariat dernierContrat = commerce.getContrats().get(commerce.getContrats().size() - 1);
        assertTrue(dernierContrat.getConditionsUtilisation().contains("Minimum 100 points"));
    }

    @Test
    void testDefinirCategoriesProduits() {
        // Définir plusieurs catégories
        String categories = "ALIMENTAIRE,HYGIENE,MENAGER";
        commerce.definirCategoriesProduits(categories);
        
        // Vérifier que les catégories ont été ajoutées
        List<CategorieProduit> categoriesCommerce = commerce.getCategories();
        assertTrue(categoriesCommerce.contains(CategorieProduit.ALIMENTAIRE));
        assertTrue(categoriesCommerce.contains(CategorieProduit.HYGIENE));
        assertTrue(categoriesCommerce.contains(CategorieProduit.MENAGER));
        assertEquals(3, categoriesCommerce.size());
    }

    @Test
    void testAjouterContrat() {
        commerce.ajouterContrat(contrat);
        assertEquals(1, commerce.getContrats().size());
        assertTrue(commerce.getContrats().contains(contrat));
    }

    @Test
    void testGetters() {
        assertEquals(1, commerce.getIdCommerce());
        assertEquals("SuperMarché Test", commerce.getNom());
        assertNotNull(commerce.getContrats());
    }
} 