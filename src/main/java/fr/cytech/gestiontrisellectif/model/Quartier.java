package fr.cytech.gestiontrisellectif.model;

public class Quartier {
    private int idQuartier;
    private String nom;
    private Ville ville;

    public Quartier(int idQuartier, String nom, Ville ville) {
        this.idQuartier = idQuartier;
        this.nom = nom;
        this.ville = ville;
    }

    // Getters
    public int getIdQuartier() {
        return idQuartier;
    }

    public String getNom() {
        return nom;
    }

    public Ville getVille() {
        return ville;
    }
} 