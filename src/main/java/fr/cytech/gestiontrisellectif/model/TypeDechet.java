package fr.cytech.gestiontrisellectif.model;

public enum TypeDechet {
    PLASTIQUE(0.1),  // poids en kg par unité
    VERRE(0.5),
    CARTON(0.2),
    METAL(0.3);

    private final double poidsUnitaire;

    TypeDechet(double poidsUnitaire) {
        this.poidsUnitaire = poidsUnitaire;
    }

    public double getPoidsUnitaire() {
        return poidsUnitaire;
    }
} 