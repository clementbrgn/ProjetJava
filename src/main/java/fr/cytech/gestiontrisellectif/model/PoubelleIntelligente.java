package fr.cytech.gestiontrisellectif.model;

import java.util.ArrayList;
import java.util.List;

public class PoubelleIntelligente {
    private String id;
    private double capaciteMax;
    private String emplacement;
    private TypePoubelle type;
    private double niveauActuel;
    private List<Dechet> dechets;

    public PoubelleIntelligente(String id, double capaciteMax, String emplacement, TypePoubelle type) {
        this.id = id;
        this.capaciteMax = capaciteMax;
        this.emplacement = emplacement;
        this.type = type;
        this.niveauActuel = 0;
        this.dechets = new ArrayList<>();
    }

    public boolean identifierUtilisateur(String identifiant) {
        // TODO: Implémenter la vérification de l'identifiant
        return true;
    }

    public double calculerQuantite(Dechet dechet) {
        return dechet.getPoids();
    }

    public boolean verifierConformite(Dechet dechet) {
        switch (type) {
            case VERTE:
                return dechet.getType() == TypeDechet.VERRE;
            case JAUNE:
                return dechet.getType() == TypeDechet.PLASTIQUE || 
                       dechet.getType() == TypeDechet.CARTON || 
                       dechet.getType() == TypeDechet.METAL;
            case BLEUE:
                return dechet.getType() == TypeDechet.CARTON;
            case CLASSIQUE:
                return true;
            default:
                return false;
        }
    }

    public int attribuerPoints(Dechet dechet) {
        if (verifierConformite(dechet)) {
            return (int) (dechet.getPoids() * 10); // 10 points par kg
        } else {
            return (int) (-dechet.getPoids() * 5); // Pénalité de 5 points par kg
        }
    }

    public boolean estPleine() {
        return niveauActuel >= capaciteMax;
    }

    public void ajouterDechet(Dechet dechet) {
        if (!estPleine()) {
            dechets.add(dechet);
            niveauActuel += dechet.getPoids();
        }
    }

    // Getters et Setters
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public double getCapaciteMax() {
        return capaciteMax;
    }

    public void setCapaciteMax(double capaciteMax) {
        this.capaciteMax = capaciteMax;
    }

    public String getEmplacement() {
        return emplacement;
    }

    public void setEmplacement(String emplacement) {
        this.emplacement = emplacement;
    }

    public TypePoubelle getType() {
        return type;
    }

    public void setType(TypePoubelle type) {
        this.type = type;
    }

    public double getNiveauActuel() {
        return niveauActuel;
    }

    public List<Dechet> getDechets() {
        return dechets;
    }
} 