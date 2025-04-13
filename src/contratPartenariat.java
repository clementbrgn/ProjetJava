import java.time.LocalDate;
import java.util.Scanner;
public class contratPartenariat {
	private int idContratPartenariat;
    private LocalDate dateDebut;
    private String reglePoint;
    private LocalDate dateFin;

    
    public contratPartenariat(int idContratPartenariat, LocalDate dateDebut, String reglePoint, LocalDate dateFin) {
        this.idContratPartenariat = idContratPartenariat;
        this.dateDebut = dateDebut;
        this.reglePoint = reglePoint;
        this.dateFin = dateFin;
    }


	public int getIdContratPartenariat() {
		return idContratPartenariat;
	}


	public void setIdContratPartenariat(int idContratPartenariat) {
		this.idContratPartenariat = idContratPartenariat;
	}


	public LocalDate getDateDebut() {
		return dateDebut;
	}


	public void setDateDebut(LocalDate dateDebut) {
		this.dateDebut = dateDebut;
	}


	public String getReglePoint() {
		return reglePoint;
	}


	public void setReglePoint(String reglePoint) {
		this.reglePoint = reglePoint;
	}


	public LocalDate getDateFin() {
		return dateFin;
	}


	public void setDateFin(LocalDate dateFin) {
		this.dateFin = dateFin;
	}
	
	
	

	public void renouveler(contratPartenariat contrat, centreDeTri centretri) {
	    LocalDate aujourdHui = LocalDate.now();

	    if (contrat.getDateFin().isEqual(aujourdHui)) {
	        try (Scanner scanner = new Scanner(System.in)) {
				System.out.print("Voulez-vous renouveler le contrat ? (oui/non) : ");
				String reponse = scanner.nextLine();

				if (reponse.equalsIgnoreCase("oui")) {
				    LocalDate nouvelleDateFin = contrat.getDateFin().plusYears(1);
				    contrat.setDateFin(nouvelleDateFin);
				    System.out.println("Contrat renouvelé jusqu'au " + nouvelleDateFin);
				} else {
					centretri.getListContrat().remove(contrat);
				
				}
			}
	        System.out.println("Contrat terminé.");
	        }
	    }
	}

    


