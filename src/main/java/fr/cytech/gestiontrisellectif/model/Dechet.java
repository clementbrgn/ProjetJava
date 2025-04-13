package fr.cytech.gestiontrisellectif.model;

public class Dechet {
    private String id;
    private TypeDechet type;
    private double poids;

    public Dechet(String id, TypeDechet type, double poids) {
        this.id = id;
        this.type = type;
        this.poids = poids;
    }

    // Getters et Setters
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public TypeDechet getType() {
        return type;
    }

    public void setType(TypeDechet type) {
        this.type = type;
    }

    public double getPoids() {
        return poids;
    }

    public void setPoids(double poids) {
        this.poids = poids;
    }

    @Override
    public String toString() {
        return "Dechet{" +
                "id='" + id + '\'' +
                ", type=" + type +
                ", poids=" + poids +
                '}';
    }
} 