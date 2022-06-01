package com.inti.entities;

public class Voyageur {
	private Long idVoyageur;
	private String nom;
	private String prenom;
	private int age;
	
	public Voyageur() {
	}

	public Voyageur(String nom, String prenom, int age) {
		this.nom = nom;
		this.prenom = prenom;
		this.age = age;
	}

	public Long getIdVoyageur() {
		return idVoyageur;
	}

	public void setIdVoyageur(Long idVoyageur) {
		this.idVoyageur = idVoyageur;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getPrenom() {
		return prenom;
	}

	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	@Override
	public String toString() {
		return "Voyageur [idVoyageur=" + idVoyageur + ", nom=" + nom + ", prenom=" + prenom + ", age=" + age + "]";
	}
	
	
}
