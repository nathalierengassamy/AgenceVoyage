package com.inti.entities;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.OneToMany;

@Entity
public class Destination {

	private Long idDestination;
	private Long longitude;
	private Long latitude;
	private String pays;
	@OneToMany(mappedBy = "dest")
	private List<Hotel> hotels = new ArrayList<>();
	
	public Destination() {
		
	}

	public Destination(Long longitude, Long latitude, List<Hotel> hotels) {
		this.longitude = longitude;
		this.latitude = latitude;
		this.hotels = hotels;
	}
	
	public Destination(Long longitude, Long latitude, String pays, List<Hotel> hotels) {
		super();
		this.longitude = longitude;
		this.latitude = latitude;
		this.pays = pays;
		this.hotels = hotels;
	}

	public Long getIdDestination() {
		return idDestination;
	}

	public void setIdDestination(Long idDestination) {
		this.idDestination = idDestination;
	}

	public Long getLongitude() {
		return longitude;
	}

	public void setLongitude(Long longitude) {
		this.longitude = longitude;
	}

	public Long getLatitude() {
		return latitude;
	}

	public void setLatitude(Long latitude) {
		this.latitude = latitude;
	}

	public List<Hotel> getHotels() {
		return hotels;
	}

	public void setHotels(List<Hotel> hotels) {
		this.hotels = hotels;
	}
	
	public String getPays() {
		return pays;
	}

	public void setPays(String pays) {
		this.pays = pays;
	}

	@Override
	public String toString() {
		return "Destination [idDestination=" + idDestination + ", longitude=" + longitude + ", latitude=" + latitude
				+ ", pays=" + pays + "]";
	}
	
}
