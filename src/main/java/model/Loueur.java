package model;

import java.util.List;

import org.springframework.stereotype.Component;
import org.springframework.beans.factory.annotation.Autowired;

@Component
public class Loueur {
	
	@Autowired
	private List<BienImmobilier> biens;
	private int id;
	private String name;
	
	public List<BienImmobilier> getBiens() {
		return biens;
	}
	public int getId() {
		return id;
	}
	public String getName() {
		return name;
	}
	

}
