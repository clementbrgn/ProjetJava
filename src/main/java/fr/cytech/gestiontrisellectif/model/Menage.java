package fr.cytech.gestiontrisellectif.model;

import java.util.ArrayList;
import java.util.List;

public class Menage {
    private int idMenage;
    private String codeAcces;
    private Corbeille corbeille;
    private List<CompteFidelite> comptesFidelite;

    public Menage(int idMenage, String codeAcces) {
        this.idMenage = idMenage;
        this.codeAcces = codeAcces;
        this.corbeille = new Corbeille();
        this.comptesFidelite = new ArrayList<>();
    }

    public void consulterPoints() {
        for (CompteFidelite compte : comptesFidelite) {
            System.out.println("Points disponibles : " + compte.getPoints());
        }
    }

    public void convertirPoints(int points, BonAchat bonAchat) {
        for (CompteFidelite compte : comptesFidelite) {
            compte.debiter(points);
        }
    }

    public void deposerDechets(Poubelle poubelle) {
        if (poubelle.identifierUtilisateur(this.codeAcces)) {
            if (poubelle.verifierDechets()) {
                // Transférer les déchets de la corbeille à la poubelle
                for (Dechet dechet : corbeille.getDechets()) {
                    poubelle.ajouterDechet(dechet);
                }
                // Attribuer les points
                int points = poubelle.attribuerPoints();
                for (CompteFidelite compte : comptesFidelite) {
                    compte.crediter(points);
                }
                // Vider la corbeille
                corbeille.viderCorbeille();
            }
        }
    }

    public void consulterHistorique() {
        // TODO: Implémenter la consultation de l'historique
    }

    // Getters et Setters
    public int getIdMenage() {
        return idMenage;
    }

    public String getCodeAcces() {
        return codeAcces;
    }

    public Corbeille getCorbeille() {
        return corbeille;
    }

    public List<CompteFidelite> getComptesFidelite() {
        return comptesFidelite;
    }
} 