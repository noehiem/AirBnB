package model;

public abstract class BienImmobilier {
	
	private float prix;
	private String adresse;
	private int capacité;
	private float surface;
	private int nbPiece;
	
	
	public float getPrix() {
		return prix;
	}

	public String getAdresse() {
		return adresse;
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
