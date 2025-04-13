package fr.cytech.gestiontrisellectif.model;

import java.time.LocalDateTime;

public class HistoriqueDepot {
    private String idUtilisateur;
    private String idPoubelle;
    private Dechet dechet;
    private int pointsGagnes;
    private LocalDateTime dateDepot;

    public HistoriqueDepot(String idUtilisateur, String idPoubelle, Dechet dechet, int pointsGagnes) {
        this.idUtilisateur = idUtilisateur;
        this.idPoubelle = idPoubelle;
        this.dechet = dechet;
        this.pointsGagnes = pointsGagnes;
        this.dateDepot = LocalDateTime.now();
    }

    // Getters
    public String getIdUtilisateur() {
        return idUtilisateur;
    }

    public String getIdPoubelle() {
        return idPoubelle;
    }

    public Dechet getDechet() {
        return dechet;
    }

    public int getPointsGagnes() {
        return pointsGagnes;
    }

    public LocalDateTime getDateDepot() {
        return dateDepot;
    }

    @Override
    public String toString() {
        return "HistoriqueDepot{" +
                "idUtilisateur='" + idUtilisateur + '\'' +
                ", idPoubelle='" + idPoubelle + '\'' +
                ", dechet=" + dechet +
                ", pointsGagnes=" + pointsGagnes +
                ", dateDepot=" + dateDepot +
                '}';
    }
} 