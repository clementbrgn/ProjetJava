import java.util.ArrayList;
import java.util.Scanner;
import java.util.List;

public class poubelle {
    private int idPoubelle;
    private String typeDeDechet;
    private int capaciteMax;
    private int quantiteActuelle;
    private List<depot> listDepot;

    public poubelle(int idPoubelle, String typeDeDechet, int capaciteMax, int quantiteActuelle) {
        this.idPoubelle = idPoubelle;
        this.typeDeDechet = typeDeDechet;
        this.capaciteMax = capaciteMax;
        this.quantiteActuelle = quantiteActuelle;
        this.listDepot = new ArrayList<>();
    }

    public int getIdPoubelle() {
        return idPoubelle;
    }

    public void setIdPoubelle(int idPoubelle) {
        this.idPoubelle = idPoubelle;
    }

    public String getTypeDeDechet() {
        return typeDeDechet;
    }

    public void setTypeDeDechet(String typeDeDechet) {
        this.typeDeDechet = typeDeDechet;
    }

    public int getCapaciteMax() {
        return capaciteMax;
    }

    public void setCapaciteMax(int capaciteMax) {
        this.capaciteMax = capaciteMax;
    }

    public int getQuantiteActuelle() {
        return quantiteActuelle;
    }

    public void setQuantiteActuelle(int quantiteActuelle) {
        this.quantiteActuelle = quantiteActuelle;
    }

 

	public List<depot> getListDepot() {
		return listDepot;
	}

	public void setListDepot(List<depot> listDepot) {
		this.listDepot = listDepot;
	}
    


	public void alertePlein(poubelle Poubelle) {
	    if (Poubelle.getQuantiteActuelle() >= Poubelle.getCapaciteMax() - 10) {
	        System.out.println("⚠️ Attention : la poubelle est presque pleine !");
	    }
	}
	
	
	
	public boolean verifierDechet(déchet dechet, poubelle Poubelle, compteFidélité compteFidelite) {
	    if (dechet.getNature().equals(Poubelle.getTypeDeDechet())) {
	        return true;
	    } else {
	    	compteFidelite.Déditer(5,compteFidelite);
	        return false;
	    }
	}
	
	
	public boolean identifierUser(Ménage menage) {
	    try (Scanner scanner = new Scanner(System.in)) {
			System.out.print("Entrez l'ID de connexion : ");
			int c = scanner.nextInt();

			System.out.print("Entrez le code d'accès : ");
			int d = scanner.nextInt();

			if (c == menage.getIdMenage() && d == menage.getCodeAcces()) {
			    return true;
			} else {
			    return false;
			}
		}
	}
	public int calculerQuantite(corbeille Corbeille) {
	    int quantite = Corbeille.getListDéchets().size();
	    return quantite;
	}
	public void attribuerPoint(corbeille Corbeille, compteFidélité compteFidelite) {
	    int poids = calculerQuantite(Corbeille);
	    compteFidelite.setPoints(compteFidelite.getPoints() + poids);
	}

	
	
	
	
	

	}
	
	
	
	
	
	
	
	
	











    