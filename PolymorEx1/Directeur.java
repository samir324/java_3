package PolymorEx1;

public class Directeur extends Chef{

    String societe;

    public Directeur(String nom, String prenom, String ville, int dateDeNaissance, int salaire, String service, String societe) {
        super(nom, prenom, ville, dateDeNaissance, salaire, service);
        this.societe = societe;
    }

    
    public void Afficher() {
        super.Afficher();
        System.out.println("Societe: " + societe);

    }
}
