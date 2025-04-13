package fr.cytech.gestiontrisellectif.model;

public class BonAchat {
    private int idBonAchat;
    private int pourcentageReduction;
    private CategorieProduit categorieProduit;
    private boolean utilise;

    public BonAchat(int idBonAchat, int pourcentageReduction, CategorieProduit categorieProduit) {
        this.idBonAchat = idBonAchat;
        this.pourcentageReduction = pourcentageReduction;
        this.categorieProduit = categorieProduit;
        this.utilise = false;
    }

    public boolean estUtilise() {
        return utilise;
    }

    public void setUtilise(boolean utilise) {
        this.utilise = utilise;
    }

    // Getters
    public int getIdBonAchat() {
        return idBonAchat;
    }

    public int getPourcentageReduction() {
        return pourcentageReduction;
    }

    public CategorieProduit getCategorieProduit() {
        return categorieProduit;
    }
} 