package Test_EX3;

public class Main {
    public static void main(String[] args) {

        System.out.println("Cree nouveau CompteBancaire");
        compteBancaire nouveauCompte = new compteBancaire(667779900, 12000);
        nouveauCompte.Ajouter();
        nouveauCompte.Retirer();
        nouveauCompte.afficher();

        System.out.println("Cree nouveau CompteEpargne ");
        epargne nouveauCompte2 = new epargne(99552288, 14000);
        nouveauCompte2.afficher();
        nouveauCompte2.tauxInteretAnnuel();


    }
}
