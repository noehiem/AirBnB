package model;

import org.springframework.stereotype.Component;

@Component
public class Appartement extends BienImmobilier{
	
	private int numEtage;
	private boolean parking;
	private boolean ascenseur;
	
	public Appartement() {
		
	}
	
	public int getNumEtage() {
		return numEtage;
	}
	public boolean isParking() {
		return parking;
	}
	public boolean isAscenseur() {
		return ascenseur;
	}
	
	

}
