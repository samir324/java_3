package exercice_2;

public class Chien2 {

	String nom;

	public Chien2(String nom) {
		this.nom = nom;
	}

	public void Aboyer(String sens) {
		if (sens.equalsIgnoreCase("Hungry")) {
			System.out.print("Je suis en col�re. Ghhhhhhhhhh !!! WWWWOARF !! WWWWOARF !!");
		} else if (sens.equalsIgnoreCase("Cool")) {
			System.out.print("Je ne suis pas du tout en col�re. Iwiw !! awaw !!");
		} else {
			System.out.print(nom + " dit wwaaaarf,");
		}
	}

	public void Manger(String food) {
		if (food.equalsIgnoreCase("Fish")) {
			System.out.print(" Je mange du poisson");
		} else {
			System.out.println(" Je mange de la viande");
		}

	}

}
