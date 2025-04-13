package fr.cytech.gestiontrisellectif.model;

public enum CategorieProduit {
    ALIMENTAIRE("Produits alimentaires"),
    HYGIENE("Produits d'hygiène"),
    MENAGER("Produits ménagers"),
    LOISIRS("Loisirs et divertissement"),
    AUTRE("Autres produits");

    private final String description;

    CategorieProduit(String description) {
        this.description = description;
    }

    public String getDescription() {
        return description;
    }
} 