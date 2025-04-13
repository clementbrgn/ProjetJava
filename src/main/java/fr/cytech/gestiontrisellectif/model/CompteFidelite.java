package fr.cytech.gestiontrisellectif.model;

public class CompteFidelite {
    private int idCompteFidelite;
    private int points;

    public CompteFidelite(int idCompteFidelite) {
        this.idCompteFidelite = idCompteFidelite;
        this.points = 0;
    }

    public void crediter(int points) {
        this.points += points;
    }

    public void debiter(int points) {
        if (this.points >= points) {
            this.points -= points;
        }
    }

    public void creerCompte() {
        // TODO: Implémenter la création du compte
    }

    // Getters et Setters
    public int getIdCompteFidelite() {
        return idCompteFidelite;
    }

    public int getPoints() {
        return points;
    }
} 