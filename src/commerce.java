import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;



// Classe représentant un Commerce
public class commerce {
    private int id;
    private String nom;
    private List<String> listCatProd;


    public void Commerce(int id, String nom) {
        this.id = id;
        this.nom = nom;
    }

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public List<String> getListCatProd() {
		return listCatProd;
	}

	public void setListCatProd(List<String> listCatProd) {
		this.listCatProd = listCatProd;
	}
	
	

	public void defCondPartenariat(contratPartenariat contrat) {
	    try (Scanner scanner = new Scanner(System.in)) {
			System.out.print("Quelles sont les conditions du partenariat ? ");
			String conditions = scanner.nextLine();
			
			contrat.setReglePoint(conditions);
		}
	}
	


	public void defCatProd(commerce commerce) {
	    try (Scanner scanner = new Scanner(System.in)) {
	        List<String> categories = new ArrayList<>();

	        System.out.println("Entrez les catégories de produits utilisables avec les bons (tapez 'fin' pour terminer) :");

	        while (true) {
	            System.out.print("Catégorie : ");
	            String saisie = scanner.nextLine();
	            if (saisie.equalsIgnoreCase("fin")) {
	                break;
	            }
	            categories.add(saisie);
	        }

	        commerce.setListCatProd(categories);
	    }
	}
	
	

	
	
	



}
    
	