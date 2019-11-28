package service;

import java.util.List;

import model.BienImmobilier;

public interface BienService {
	
	List<BienImmobilier> findAll();
	
	void saveAll(List<BienImmobilier> biens);

}
