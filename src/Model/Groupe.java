package Model;

public class Groupe {

	private int idGroupe;
	private String nomGroupe;
	private Student student;
	private Ue ue;
	private Sujet sujet;
// lyns est énervé
	
	public Groupe (int idGroupe,String nomGroupe, Student student, Ue ue, Sujet sujet) {

		this.idGroupe= idGroupe;
		this.nomGroupe= nomGroupe;
		this.student=student;
		this.ue=ue;
		this.sujet=sujet;

}
	public int getIdGroupe() {
		return idGroupe;
	}
	public void setIdGroupe(int idGroupe) {
		this.idGroupe = idGroupe;
	}
	public String getNomGroupe() {
		return nomGroupe;
	}
	public void setNomGroupe(String nomGroupe) {
		this.nomGroupe = nomGroupe;
	}
	public Student getStudent() {
		return student;
	}

	public void setStudent(Student student) {
		this.student = student;
	}

	public Ue getUe() {
		return ue;
	}

	public void setUe(Ue ue) {
		this.ue = ue;
	}

	public Sujet getSujet() {
		return sujet;
	}

	public void setSujet(Sujet sujet) {
		this.sujet = sujet;
	}


	
	public void creer_Groupe() {
		
	}
	
	public void supprimer_Groupe() {
		
	}


	public void creer_Groupes_aleatoire(Student student) {
	
	}
	
	public void changer_student() {
	
	}
	

}