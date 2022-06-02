package com.inti.entities;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

@Entity
public class Hotel {

	private Long idHotel;
	private String nom;
	private int nbEtoile;
	private String elementAjoute;
	private String elementAjoute2bis;
	@ManyToOne
	@JoinColumn(name = "idDestination")
	private Destination destination;
	@OneToMany(mappedBy = "hot")
	private List<Reservation> reservations = new ArrayList<>();
	
	public Hotel() {
		
	}
	
	public Hotel(String nom, int nbEtoile, String elementAjoute, String elementAjoute2, Destination destination,
			List<Reservation> reservations) {
		this.nom = nom;
		this.nbEtoile = nbEtoile;
		this.elementAjoute = elementAjoute;
		this.elementAjoute2bis = elementAjoute2bis;
		this.destination = destination;
		this.reservations = reservations;
	}

	public Long getIdHotel() {
		return idHotel;
	}

	public void setIdHotel(Long idHotel) {
		this.idHotel = idHotel;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public int getNbEtoile() {
		return nbEtoile;
	}

	public void setNbEtoile(int nbEtoile) {
		this.nbEtoile = nbEtoile;
	}

	public Destination getDestination() {
		return destination;
	}

	public void setDestination(Destination destination) {
		this.destination = destination;
	}

	public List<Reservation> getReservations() {
		return reservations;
	}

	public void setReservations(List<Reservation> reservations) {
		this.reservations = reservations;
	}

	public String getElementAjoute() {
		return elementAjoute;
	}

	public void setElementAjoute(String elementAjoute) {
		this.elementAjoute = elementAjoute;
	}

	public String getElementAjoute2bis() {
		return elementAjoute2bis;
	}

	public void setElementAjoute2bis(String elementAjoute2) {
		this.elementAjoute2bis = elementAjoute2;
	}

	@Override
	public String toString() {
		return "Hotel [idHotel=" + idHotel + ", nom=" + nom + ", nbEtoile=" + nbEtoile + ", elementAjoute="
				+ elementAjoute + ", elementAjoute2bis=" + elementAjoute2bis + ", destination=" + destination
				+ ", reservations=" + reservations + "]";
	}

	
}
