package controller;

import java.util.ArrayList;
import java.util.List;

import model.Locataire;

public class LocatairesCreationDto {
	
	private List<Locataire> locataires;
	
	public LocatairesCreationDto() {
		this.locataires = new ArrayList<>();
	}
	
	public LocatairesCreationDto(List<Locataire> locataires) {
		this.locataires = locataires;
	}
	
	public void addLocataire(Locataire locataire) {
		this.locataires.add(locataire);
	}

	public void setLocataires(List<Locataire> locataires) {
		this.locataires = locataires;
	}

	public List<Locataire> getLocataires() {
		return locataires;
	}
	
	

}
