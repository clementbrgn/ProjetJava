package fr.cytech.gestiontrisellectif.model;

import java.util.ArrayList;
import java.util.List;

public class Commerce {
    private int idCommerce;
    private String nom;
    private List<ContratPartenariat> contrats;
    private List<CategorieProduit> categories;

    public Commerce(int idCommerce, String nom) {
        this.idCommerce = idCommerce;
        this.nom = nom;
        this.contrats = new ArrayList<>();
        this.categories = new ArrayList<>();
    }

    public Commerce(String string, String nom2) {
		// TODO Auto-generated constructor stub
	}

	public void utiliserBonAchat(BonAchat bonAchat) {
        // Vérifier si le bon d'achat est valide pour ce commerce
        if (categories.contains(bonAchat.getCategorieProduit()) && !bonAchat.estUtilise()) {
            bonAchat.setUtilise(true);
        }
    }

    public void definirConditionsUtilisationPoints(String conditions) {
        ContratPartenariat nouveauContrat = new ContratPartenariat();
        nouveauContrat.setConditionsUtilisation(conditions);
        contrats.add(nouveauContrat);
    }

    public void definirCategoriesProduits(String categoriesStr) {
        categories.clear();
        String[] cats = categoriesStr.split(",");
        for (String cat : cats) {
            try {
                categories.add(CategorieProduit.valueOf(cat.trim()));
            } catch (IllegalArgumentException e) {
                // Ignorer les catégories invalides
            }
        }
    }

    // Getters et Setters
    public int getIdCommerce() {
        return idCommerce;
    }

    public String getNom() {
        return nom;
    }

    public List<ContratPartenariat> getContrats() {
        return contrats;
    }

    public List<CategorieProduit> getCategories() {
        return categories;
    }

    public void ajouterContrat(ContratPartenariat contrat) {
        contrats.add(contrat);
    }
} 