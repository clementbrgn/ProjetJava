import java.util.ArrayList;
import java.util.List;

public class centreDeTri {
    private int idCentreDeTri;
    private String nom;
    private String adresse;
    private List<poubelle> listpoubelles;
    private List<contratPartenariat> listContrat;

    public centreDeTri(int idCentreDeTri, String nom, String adresse) {
        this.idCentreDeTri = idCentreDeTri;
        this.nom = nom;
        this.adresse = adresse;
        this.listpoubelles = new ArrayList<poubelle>(); // Initialisation de la liste
    }
    
    
    
    
    

    public centreDeTri(int idCentreDeTri, String nom, String adresse, List<poubelle> listpoubelles,
			List<contratPartenariat> listContrat) {
		super();
		this.idCentreDeTri = idCentreDeTri;
		this.nom = nom;
		this.adresse = adresse;
		this.listpoubelles = listpoubelles;
		this.listContrat = listContrat;
	}






	public List<contratPartenariat> getListContrat() {
		return listContrat;
	}






	public void setListContrat(List<contratPartenariat> listContrat) {
		this.listContrat = listContrat;
	}






	public int getIdCentreDeTri() {
        return idCentreDeTri;
    }

    public void setIdCentreDeTri(int idCentreDeTri) {
        this.idCentreDeTri = idCentreDeTri;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getAdresse() {
        return adresse;
    }

    public void setAdresse(String adresse) {
        this.adresse = adresse;
    }


	public List<poubelle> getListpoubelles() {
		return listpoubelles;
	}

	public void setListpoubelles(List<poubelle> listpoubelles) {
		this.listpoubelles = listpoubelles;
	}
	

    public void placerPoubelle(poubelle poubelle, quartier quartier) {
        quartier.getListpoubellequartier().add(poubelle);
    }
    
    public void retirerPoubelle(poubelle poubelle, quartier quartier) {
        quartier.getListpoubellequartier().remove(poubelle);
    }
    

    
    
    
    
    
    
}