package model;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Locataire {
	
	@Autowired
	private List<BienImmobilier> biens;
	private long id;
	private String name;
	
	public Locataire() {
		this.biens = new ArrayList<>();
	}
	
	public Locataire(List<BienImmobilier> biens) {
		this.biens = biens;
	}
	
	public void addBien(BienImmobilier bien) {
		this.biens.add(bien);
	}
	
	public void setBiens(List<BienImmobilier> biens) {
		this.biens = biens;
	}
	
	public List<BienImmobilier> getBiens() {
		return biens;
	}
	public long getId() {
		return id;
	}
	public String getName() {
		return name;
	}
	
	public void setId(long id) {
		this.id = id;
	}
	
	public void setName(String name) {
		this.name = name;
	}

	
}
