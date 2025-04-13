import java.util.Random;

public class compteFidélité {
	private int idCompteFidelite;
	private int points;

	
	public compteFidélité(int idCompteFidelite) {
		this.idCompteFidelite = idCompteFidelite;
		this.points = 0; // Initialisation du compte avec 0 points
	}

	public int getIdCompteFidelite() {
		return idCompteFidelite;
	}

	public void setIdCompteFidelite(int idCompteFidelite) {
		this.idCompteFidelite = idCompteFidelite;
	}

	public int getPoints() {
		return points;
	}

	public void setPoints(int points) {
		this.points = points;
	}
	
//Méthode
	public void Créditer() {
	}
		
    public void creerCompte(Ménage menage) {
        Random random = new Random();
        menage.setCodeAcces(1000 + random.nextInt(9000)); // Génère un nombre entre 1000 et 9999
    }
    
	public void Déditer(int pointperdu,compteFidélité comptefid) {
		comptefid.setPoints(points-pointperdu);
	}
	
}

