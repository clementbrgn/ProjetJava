package fr.cytech.gestiontrisellectif.model;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class ContratPartenariat {
    private int idContratPartenariat;
    private LocalDate dateDebut;
    private LocalDate dateFin;
    private List<ReglePoints> regles;
    private String conditionsUtilisation;

    public ContratPartenariat(int idContratPartenariat, String dateDebut, String dateFin) {
        this.idContratPartenariat = idContratPartenariat;
        this.dateDebut = LocalDate.parse(dateDebut);
        this.dateFin = LocalDate.parse(dateFin);
        this.regles = new ArrayList<>();
        this.conditionsUtilisation = "";
    }

    public ContratPartenariat() {
        this.regles = new ArrayList<>();
        this.conditionsUtilisation = "";
    }

    public void ajouterRegle(ReglePoints regle) {
        regles.add(regle);
    }

    public boolean estValide() {
        LocalDate aujourdhui = LocalDate.now();
        return !aujourdhui.isBefore(dateDebut) && !aujourdhui.isAfter(dateFin);
    }

    // Getters et Setters
    public int getIdContratPartenariat() {
        return idContratPartenariat;
    }

    public LocalDate getDateDebut() {
        return dateDebut;
    }

    public void setDateDebut(LocalDate dateDebut) {
        this.dateDebut = dateDebut;
    }

    public LocalDate getDateFin() {
        return dateFin;
    }

    public void setDateFin(LocalDate dateFin) {
        this.dateFin = dateFin;
    }

    public List<ReglePoints> getRegles() {
        return regles;
    }

    public String getConditionsUtilisation() {
        return conditionsUtilisation;
    }

    public void setConditionsUtilisation(String conditionsUtilisation) {
        this.conditionsUtilisation = conditionsUtilisation;
    }
} 