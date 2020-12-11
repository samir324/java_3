package PolymorEx1;

public class Employee extends Personne{

    int salaire;

    public Employee(String nom, String prenom, String ville, int dateDeNaissance, int salaire) {
        super(nom, prenom, ville, dateDeNaissance);
        this.salaire = salaire;
    }
    
    public void Afficher() {
        super.Afficher();
        System.out.println("Salaire: " + salaire + "DH");
    }
}
