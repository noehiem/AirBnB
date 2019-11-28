package service;

import java.util.List;

import model.Locataire;

public interface LocataireService {
	
	List<Locataire> findAll();
	
	void saveAll(List<Locataire> locataires);

}
