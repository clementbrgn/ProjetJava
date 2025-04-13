package fr.cytech.gestiontrisellectif.model;

import java.util.ArrayList;
import java.util.List;

public class Poubelle {
    private int idPoubelle;
    private String typePoubelle;
    private String capaciteMax;
    private double quantiteActuelle;
    private String couleur;
    private List<Dechet> dechets;

    public Poubelle(int idPoubelle, String typePoubelle, String capaciteMax, String couleur) {
        this.idPoubelle = idPoubelle;
        this.typePoubelle = typePoubelle;
        this.capaciteMax = capaciteMax;
        this.couleur = couleur;
        this.quantiteActuelle = 0;
        this.dechets = new ArrayList<>();
    }

    public int attribuerPoints() {
        // TODO: Implémenter le calcul des points
        return 0;
    }

    public String alertePlein() {
        if (quantiteActuelle >= Double.parseDouble(capaciteMax)) {
            return "Poubelle pleine !";
        }
        return "";
    }

    public boolean identifierUtilisateur(String codeAcces) {
        // TODO: Implémenter la vérification du code d'accès
        return true;
    }

    public double calculerQuantite() {
        return quantiteActuelle;
    }

    public boolean verifierDechets() {
        // TODO: Implémenter la vérification des déchets
        return true;
    }

    public boolean estPleine() {
        return quantiteActuelle >= Double.parseDouble(capaciteMax);
    }

    public List<Dechet> getDechets() {
        return dechets;
    }

    public void ajouterDechet(Dechet dechet) {
        dechets.add(dechet);
        quantiteActuelle += dechet.getPoids();
    }

    // Getters et Setters
    public int getIdPoubelle() {
        return idPoubelle;
    }

    public String getTypePoubelle() {
        return typePoubelle;
    }

    public String getCapaciteMax() {
        return capaciteMax;
    }

    public double getQuantiteActuelle() {
        return quantiteActuelle;
    }

    public String getCouleur() {
        return couleur;
    }
} 