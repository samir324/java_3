package Test_EX3;
import java.util.Scanner;

public class epargne extends compteBancaire{
	
    public epargne(long numeroCompt, double solde) {
        super(numeroCompt, solde);
        if (solde < 200){
            setsolde(200);
        }
    }
    public void tauxInteretAnnuel(){
        try (Scanner tauxInteret = new Scanner(System.in)) {
			System.out.println("taux d'intérêt annuel: ");
			double tauxAnnuel = tauxInteret.nextDouble();
			tauxAnnuel = tauxAnnuel/100;
			System.out.println("Votre nouveau Solde est: " + (getsolde() - (getsolde()*tauxAnnuel)) + "DH");
		}
    }


}
