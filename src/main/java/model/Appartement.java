package model;

import org.springframework.stereotype.Component;

@Component
public class Appartement extends BienImmobilier{
	
	private int numEtage;
	private boolean parking;
	private boolean ascenseur;
	
	
	public int getNumEtage() {
		return numEtage;
	}
	
	public void setNumEtage(int numEtage) {
		this.numEtage = numEtage;
	}
	
	public boolean isParking() {
		return parking;
	}
	
	public void setParking(boolean parking) {
		this.parking = parking;
	}
	
	public boolean isAscenseur() {
		return ascenseur;
	}
	
	

}
