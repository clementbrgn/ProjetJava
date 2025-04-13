package fr.cytech.gestiontrisellectif.model;

import java.util.ArrayList;
import java.util.List;

public class Utilisateur {
    private String id;
    private String nom;
    private String prenom;
    private String email;
    private int pointsFidelite;
    private List<HistoriqueDepot> historiqueDepots;

    public Utilisateur(String id, String nom, String prenom, String email) {
        this.id = id;
        this.nom = nom;
        this.prenom = prenom;
        this.email = email;
        this.pointsFidelite = 0;
        this.historiqueDepots = new ArrayList<>();
    }

    public void deposerDechets(PoubelleIntelligente poubelle, List<Dechet> dechets) {
        for (Dechet dechet : dechets) {
            if (poubelle.verifierConformite(dechet)) {
                int points = poubelle.attribuerPoints(dechet);
                this.pointsFidelite += points;
                
                HistoriqueDepot depot = new HistoriqueDepot(
                    this.id,
                    poubelle.getId(),
                    dechet,
                    points
                );
                historiqueDepots.add(depot);
                
                poubelle.ajouterDechet(dechet);
            }
        }
    }

    public int consulterPoints() {
        return pointsFidelite;
    }

    public void convertirPoints(int points, Commerce commerce) {
        if (points <= pointsFidelite) {
            pointsFidelite -= points;
            // TODO: Implémenter la conversion en bon de réduction
        }
    }

    public List<HistoriqueDepot> consulterHistorique() {
        return historiqueDepots;
    }

    // Getters et Setters
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getPointsFidelite() {
        return pointsFidelite;
    }

    public void setPointsFidelite(int pointsFidelite) {
        this.pointsFidelite = pointsFidelite;
    }
} 