package controleur;

import vue.VuePrincipale;

public class Controleur {
	
	private VuePrincipale vuep;
	
   

	public static void main(String[] args) {
		
		new Controleur();
		
	}
	
	
	
	public Controleur() {
		
		vuep =new VuePrincipale(this);
		vuep.setVisible(true);
	}

}
