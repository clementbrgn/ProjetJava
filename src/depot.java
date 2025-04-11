import java.util.Date;

public class depot {
    private Date date;
    private int quantite;
    private String typeDeDechet;
    private int pointsGagnes;

    public depot(Date date, int quantite, String typeDeDechet, int pointsGagnes) {
        this.date = date;
        this.quantite = quantite;
        this.typeDeDechet = typeDeDechet;
        this.pointsGagnes = pointsGagnes;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public int getQuantite() {
        return quantite;
    }

    public void setQuantite(int quantite) {
        this.quantite = quantite;
    }

    public String getTypeDeDechet() {
        return typeDeDechet;
    }

    public void setTypeDeDechet(String typeDeDechet) {
        this.typeDeDechet = typeDeDechet;
    }

    public int getPointsGagnes() {
        return pointsGagnes;
    }

    public void setPointsGagnes(int pointsGagnes) {
        this.pointsGagnes = pointsGagnes;
    }
    
}