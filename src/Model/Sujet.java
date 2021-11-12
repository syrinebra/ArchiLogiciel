package Model;

import java.sql.Date;

//jules va boire du vin ce soir/////

public class Sujet {

	private int idSujet;
	private String nomSujet;
	private Date date;
	private String descriptif;
	private Ue ue;
	
	public Sujet(int idSujet, String nomSujet, Date date, String descriptif, Ue ue) {
		
		this.idSujet = idSujet;
		this.nomSujet = nomSujet;
		this.date = date;
		this.descriptif = descriptif;
		this.ue=ue;
		
	}


	public int getIdSujet() {
		return idSujet;
	}

	public void setIdSujet(int idSujet) {
		this.idSujet = idSujet;
	}

	public String getNomSujet() {
		return nomSujet;
	}

	public void setNomSujet(String nomSujet) {
		this.nomSujet = nomSujet;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public String getDescriptif() {
		return descriptif;
	}

	public void setDescriptif(String descriptif) {
		this.descriptif = descriptif;
	}
	
	public Ue getUe() {
		return ue;
	}

	public void setUe(Ue ue) {
		this.ue = ue;
	}
	
	public void creerSujet() {
			
	}
	
	public void suprimerSujet() {
		
	}
	
	

}