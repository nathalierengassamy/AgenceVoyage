package com.inti.entities;

public class Avis {
	private Long idAvis;
	
	public Avis() {
	}

	public Long getIdAvis() {
		return idAvis;
	}

	public void setIdAvis(Long idAvis) {
		this.idAvis = idAvis;
	}

	@Override
	public String toString() {
		return "Avis [idAvis=" + idAvis + "]";
	}
	
}
