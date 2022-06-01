package com.inti.entities;

public class Avis {
	private Long idAvis;
	private String commentaire;
	
	public Avis() {
	}

	public Avis(String commentaire) {
		this.commentaire = commentaire;
	}

	public Long getIdAvis() {
		return idAvis;
	}

	public void setIdAvis(Long idAvis) {
		this.idAvis = idAvis;
	}

	public String getCommentaire() {
		return commentaire;
	}

	public void setCommentaire(String commentaire) {
		this.commentaire = commentaire;
	}

	@Override
	public String toString() {
		return "Avis [idAvis=" + idAvis + ", commentaire=" + commentaire + "]";
	}
	
	
}
