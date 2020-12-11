package Test;
public class Employe {
	private String nom;
	private String prenom; 
	private String adress; 
	private int anneeNaissance; 
	private int anneeEncours;
	
	public int calculerAge() {
		int age	= anneeEncours- anneeNaissance;
		return age;
	}
	public void afficherInfosClient() {
		
		System.out.println(nom +" "+ prenom +","+" "+ " né le " + anneeNaissance  + " habitant  à "+ adress  );

	}
	
	public Employe(String Enom, String Eprenom, String Eadress, int EanneeNaissance ,int EanneeEncours) {
		nom = Enom ;
		prenom = Eprenom;
		adress = Eadress;
		anneeNaissance = EanneeNaissance;
		anneeEncours = EanneeEncours;
		
		
	}
	
}
