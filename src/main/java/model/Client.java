package model;

import java.util.List;

public class Client {
	
	private int id;
	private String userName;
	private String password;
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
	public Loueur getLoueur() {
		return loueur;
	}
	public Locataire getLocataire() {
		return locataire;
	}
	

}
