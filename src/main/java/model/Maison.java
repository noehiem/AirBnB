package model;

import org.springframework.stereotype.Component;

@Component
public class Maison extends BienImmobilier {
	
	private boolean garage;
	private boolean piscine;
	private boolean plainPied;
	
	
	public boolean isGarage() {
		return garage;
	}
	public boolean isPiscine() {
		return piscine;
	}
	public boolean isPlainPied() {
		return plainPied;
	}
	
	

}
