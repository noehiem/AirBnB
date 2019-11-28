package model;

public abstract class BienImmobilier {
	
	private long id;
	private float prix;
	private String adresse;
	private int capacité;
	private float surface;
	private int nbPiece;
	
	
	public long getId() {
		return id;
	}
	
	public void setId(long id) {
		this.id = id;
	}
	
	public float getPrix() {
		return prix;
	}
	
	public void setPrix(Float prix) {
		this.prix = prix;
	}

	public String getAdresse() {
		return adresse;
	}

	public void setAdresse(String adresse) {
		this.adresse = adresse;
	}
	
	public int getCapacité() {
		return capacité;
	}

	public float getSurface() {
		return surface;
	}

	public int getNbPiece() {
		return nbPiece;
	}

	public String toString() {
		return "";
	}

}
