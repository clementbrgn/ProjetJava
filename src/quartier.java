import java.util.List;

public class quartier {
    private int idQuartier;
    private String nom;
    private List<poubelle> listpoubellequartier;
	
    
    public quartier(int idQuartier, String nom) {
		this.idQuartier= idQuartier;
		this.nom= nom;
	}


	public int getIdQuartier() {
		return idQuartier;
	}


	public void setIdQuartier(int idQuartier) {
		this.idQuartier= idQuartier;
	}


	public String getNom() {
		return nom;
	}


	public void setNom(String nom) {
		this.nom = nom;
	}


	public List<poubelle> getListpoubellequartier() {
		return listpoubellequartier;
	}


	public void setListpoubellequartier(List<poubelle> listpoubellequartier) {
		this.listpoubellequartier = listpoubellequartier;
	}

}
