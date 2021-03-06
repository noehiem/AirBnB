package model;

import org.springframework.stereotype.Component;

@Component
public class Client {
	
	private int id;
	private String userName;
	private String password;
	private String name;
	private Loueur loueur;
	private Locataire locataire;
	
	public int getId() {
		return id;
	}
	public String getUserName() {
		return userName;
	}
	public String getPassword() {
		return password;
	}
	public String getName() {
		return name;
	}
	public Loueur getLoueur() {
		return loueur;
	}
	public Locataire getLocataire() {
		return locataire;
	}
	

}
