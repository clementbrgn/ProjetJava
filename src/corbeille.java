import java.util.List;

public class corbeille {
	private int idCorbeille;
	private List<déchet> listDéchets;
	
	
	
	public corbeille(int idCorbeille, List<déchet> listDéchets) {
		super();
		this.idCorbeille = idCorbeille;
		this.listDéchets = listDéchets;
	}



	public int getIdCorbeille() {
		return idCorbeille;
	}



	public void setIdCorbeille(int idCorbeille) {
		this.idCorbeille = idCorbeille;
	}



	public List<déchet> getListDéchets() {
	return listDéchets;}



	public void setListDéchets(List<déchet> listDéchets) {
	this.listDéchets = listDéchets;}
	
	
	

}
