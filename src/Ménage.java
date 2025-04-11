import java.util.List;
import java.util.UUID;
import java.util.ArrayList;

public class Ménage {
    private int idMenage;
    private int codeAcces;
    private List<corbeille> listCorbeille;
    private List<bonAchat> listBon;

    public Ménage(int idMenage, int codeAcces, List<corbeille> historiqueDepot, List<bonAchat> listBon) {
        this.idMenage = idMenage;
        this.codeAcces = codeAcces;
        this.listCorbeille = new ArrayList<>();
        this.listBon = new ArrayList<>();
        
    }

    public int getIdMenage() {
        return idMenage;
    }

    public void setIdMenage(int idMenage) {
        this.idMenage = idMenage;
    }

    public int getCodeAcces() {
        return codeAcces;
    }

    public void setCodeAcces(int codeAcces) {
        this.codeAcces = codeAcces;
    }

    public List<corbeille> getListCorbeille() {
        return listCorbeille;
    }

    public void ajouterCorbeille(corbeille corbeille) {
        this.listCorbeille.add(corbeille);
    }
    
   //Methode
    public void ConsulterPoint(compteFidélité compte) {
    	System.out.println(compte.getPoints());
	}
    
    public void ConsulterHistorique(poubelle Poubelle) {
    	System.out.println(Poubelle.getListDepot());
	}
    
    public void deposerDechet(déchet déchet,corbeille Corbeille) {
    	Corbeille.getListDéchets().add(déchet);
        System.out.println("Déchet ajouté avec succès !");
    	
	}
    public void deposerCorbeille(corbeille Corbeille , déchet Dechet) {
    	Corbeille.getListDéchets().add(Dechet);
        System.out.println("Déchet ajouté avec succès !");
    	
	}

	public List<bonAchat> getListBon() {
		return listBon;
	}

	public void setListBon(List<bonAchat> listBon) {
		this.listBon = listBon;
	}
    
    public void convertirPoint(Ménage menage, compteFidélité compteFidelite, int pointAConvertir) {
        // Créditer les points
    	compteFidelite.Déditer(pointAConvertir,compteFidelite);
        

        // Calcul du pourcentage de réduction
        int pourcentage = pointAConvertir / 20;
        if (pourcentage > 30) {
            pourcentage = 30;
        }

        // Création du bon d'achat
        bonAchat bon = new bonAchat();
        
        UUID uuid = UUID.randomUUID();
        int intuuid = uuid.hashCode();
        
        bon.setIdBonAchat(intuuid);
        bon.setPourcentageReduction(pourcentage);

        // Ajout dans la liste du ménage
        menage.getListBon().add(bon);

        System.out.println("Bon d'achat créé : " + bon.getIdBonAchat() + " (" + pourcentage + "% de réduction)");
    }
    
    
}
