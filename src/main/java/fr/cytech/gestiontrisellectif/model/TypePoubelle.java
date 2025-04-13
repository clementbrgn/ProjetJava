package fr.cytech.gestiontrisellectif.model;

public enum TypePoubelle {
    VERTE("Verre"),
    JAUNE("Emballages, cartons, plastiques, canettes"),
    BLEUE("Papiers"),
    CLASSIQUE("Déchets non recyclables");

    private final String description;

    TypePoubelle(String description) {
        this.description = description;
    }

    public String getDescription() {
        return description;
    }
} 