package fr.cytech.gestiontrisellectif.model;

public class ReglePoints {
    private int pointsNecessaires;
    private double pourcentageReduction;
    private CategorieProduit categorie;

    public ReglePoints(int pointsNecessaires, double pourcentageReduction, CategorieProduit categorie) {
        this.pointsNecessaires = pointsNecessaires;
        this.pourcentageReduction = pourcentageReduction;
        this.categorie = categorie;
    }

    public ReglePoints(int i, String string) {
		// TODO Auto-generated constructor stub
	}

	// Getters
    public int getPointsNecessaires() {
        return pointsNecessaires;
    }

    public double getPourcentageReduction() {
        return pourcentageReduction;
    }

    public CategorieProduit getCategorie() {
        return categorie;
    }

    @Override
    public String toString() {
        return "ReglePoints{" +
                "pointsNecessaires=" + pointsNecessaires +
                ", pourcentageReduction=" + pourcentageReduction +
                ", categorie=" + categorie +
                '}';
    }
} 