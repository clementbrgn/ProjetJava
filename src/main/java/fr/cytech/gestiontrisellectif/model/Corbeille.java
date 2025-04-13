package fr.cytech.gestiontrisellectif.model;

import java.util.ArrayList;
import java.util.List;

public class Corbeille {
    private int idCorbeille;
    private List<Dechet> listDechets;

    public Corbeille() {
        this.listDechets = new ArrayList<>();
    }

    public double calculerPoids() {
        return listDechets.stream()
                .mapToDouble(Dechet::getPoids)
                .sum();
    }

    // Getters et Setters
    public int getIdCorbeille() {
        return idCorbeille;
    }

    public List<Dechet> getListDechets() {
        return listDechets;
    }

    public void ajouterDechet(Dechet dechet) {
        listDechets.add(dechet);
    }
} 