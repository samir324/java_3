package Test_EX4;

public class Etudiant extends Personne{

    private String diplome;


    public Etudiant(String nom, String prenom, int dateDeNaissance, String adresse, String ville, String diplome) {
        super(nom, prenom, dateDeNaissance, adresse, ville);
        this.diplome = diplome;
    }


    public String toString() {
        return super.toString() + '\'' + "Etudiant{" +
                "diplome='" + diplome + '\'' +
                '}';
    }
}