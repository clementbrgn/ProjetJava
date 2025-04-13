
public class déchet {
	private int idDéchets;
	private String nature;
	private int poids;
	
	public déchet(int idDéchets, String nature, int poids) {
		super();
		this.idDéchets = idDéchets;
		this.nature = nature;
		this.poids = poids;
	}

	public int getIdDéchets() {
		return idDéchets;
	}

	public void setIdDéchets(int idDéchets) {
		this.idDéchets = idDéchets;
	}

	public String getNature() {
		return nature;
	}

	public void setNature(String nature) {
		this.nature = nature;
	}

	public int getPoids() {
		return poids;
	}

	public void setPoids(int poids) {
		this.poids = poids;
	}
	
	
	

}
