package Test_EX3;
import java.util.Scanner;

public class compteBancaire {
	    private long numcompte;
	    private double solde;
	    
		public long getnumcompte() {
	        return numcompte;
	    }
		public double getsolde() {
	        return solde;
	    }

	    public void setnumcompte(long numcompt) {
	        this.numcompte = numcompt;
	    }

	    public void setsolde(double newsolde) {
	        this.solde = newsolde;
	    }

	    public compteBancaire(long numeroCompt, double solde) {
	    	 this.numcompte = numeroCompt;
	         this.solde = solde;
		}
	
	    public void afficher(){
	        System.out.println( "Votre nouveau Solde est : " +  " Solde : "+solde);
	    }
	    public void Ajouter(){
	    	  try (Scanner soldeDeterminer = new Scanner(System.in)) {
				System.out.println("Enter la somme qui vous ajouter: ");
		        double soldeAjouter = soldeDeterminer.nextDouble();
		        solde = solde + soldeAjouter;
			}
	    }
	  
	    public void Retirer(){
	        try (Scanner soldeRetire1 = new Scanner(System.in)) {
				System.out.println("Determiner la somme qui vous retirer");
				double soldeRetire = soldeRetire1.nextDouble();
				if (soldeRetire <= solde){
				    solde = solde - soldeRetire;
				   
				}else {
				    System.out.println("Voter solde est inférieure à cette somme!!!");
				}
			}
	    }

}
