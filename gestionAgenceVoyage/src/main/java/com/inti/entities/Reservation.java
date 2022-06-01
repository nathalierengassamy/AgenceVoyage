package com.inti.entities;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class Reservation {

	private Long idVoyager;
	private Date dateReservation;
	private int nbJours;
	@ManyToOne
	@JoinColumn(name = "idHotel")
	private Hotel hotel;
	
	public Reservation() {
		
	}

	public Reservation(Long idVoyager, Date dateReservation, int nbJours, Hotel hotel) {
		this.idVoyager = idVoyager;
		this.dateReservation = dateReservation;
		this.nbJours = nbJours;
		this.hotel = hotel;
	}

	public Long getIdVoyager() {
		return idVoyager;
	}

	public void setIdVoyager(Long idVoyager) {
		this.idVoyager = idVoyager;
	}

	public Date getDateReservation() {
		return dateReservation;
	}

	public void setDateReservation(Date dateReservation) {
		this.dateReservation = dateReservation;
	}

	public int getNbJours() {
		return nbJours;
	}

	public void setNbJours(int nbJours) {
		this.nbJours = nbJours;
	}

	public Hotel getHotel() {
		return hotel;
	}

	public void setHotel(Hotel hotel) {
		this.hotel = hotel;
	}

	@Override
	public String toString() {
		return "Reservation [idVoyager=" + idVoyager + ", dateReservation=" + dateReservation + ", nbJours=" + nbJours
				+ "]";
	}
	
}
