package fr.cytech.gestiontrisellectif.model;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.HashMap;

public class CentreTri {
    private int idCentreDeTri;
    private String nom;
    private String adresse;
    private List<Poubelle> poubelles;
    private Map<TypeDechet, Double> statistiquesDechets;

    public CentreTri(int idCentreDeTri, String nom, String adresse) {
        this.idCentreDeTri = idCentreDeTri;
        this.nom = nom;
        this.adresse = adresse;
        this.poubelles = new ArrayList<>();
        this.statistiquesDechets = new HashMap<>();
        initialiserStatistiques();
    }

    private void initialiserStatistiques() {
        for (TypeDechet type : TypeDechet.values()) {
            statistiquesDechets.put(type, 0.0);
        }
    }

    public void placerPoubelle(String quartier, Poubelle poubelle) {
        poubelles.add(poubelle);
    }

    public void retirerPoubelle(Poubelle poubelle) {
        poubelles.remove(poubelle);
    }

    public void collecterDechets() {
        for (Poubelle poubelle : poubelles) {
            if (poubelle.estPleine()) {
                for (Dechet dechet : poubelle.getDechets()) {
                    double quantiteActuelle = statistiquesDechets.get(dechet.getType());
                    statistiquesDechets.put(dechet.getType(), quantiteActuelle + dechet.getPoids());
                }
                // TODO: Vider la poubelle après collecte
            }
        }
    }

    public void statistiques() {
        // TODO: Implémenter les statistiques
    }

    public Map<TypeDechet, Double> genererStatistiques() {
        return statistiquesDechets;
    }

    // Getters et Setters
    public int getIdCentreDeTri() {
        return idCentreDeTri;
    }

    public String getNom() {
        return nom;
    }

    public String getAdresse() {
        return adresse;
    }

    public List<Poubelle> getPoubelles() {
        return poubelles;
    }
} 