package exercice_4;

public class Account {

	
	String nom;
	String adress;
	double solde;
	final double tauxInteret = 0.07;
	
	
	public Account(String nom,String adress, double solde ) {
        this.nom = nom;
        this.adress = adress;
        this.solde = solde;
    }
	public  void afficherInfosSolde() {
		
		System.out.println(nom +" habite à "+ "(" + adress +")" + "infos solde " + solde + " DH" );

	}
	public  double calculerInterer()  {
		double preinter = solde*tauxInteret;
		return preinter;
		
	}

}
