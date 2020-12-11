package Test_EX4;

public class Enseignant extends Personne{

    private String specialite;



    public Enseignant(String nom, String prenom, int dateDeNaissance, String adresse, String ville, String specialite) {
        super(nom, prenom, dateDeNaissance, adresse, ville);
        this.specialite = specialite;
    }




    public String toString() {
        return super.toString() + '\'' + "Enseignant{" +
                "spécialité='" + specialite + '\'' +
                '}';
    }
}
