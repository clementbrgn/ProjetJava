package fr.cytech.gestiontrisellectif.model;

public class Ville {
    private int idVille;
    private String nom;

    public Ville(int idVille, String nom) {
        this.idVille = idVille;
        this.nom = nom;
    }

    // Getters
    public int getIdVille() {
        return idVille;
    }

    public String getNom() {
        return nom;
    }
} 