package Test_EX4;

public class Personne {
    private String nom;
    private String prenom;
    private int dateDeNaissance;
    private String adresse;
    private String ville;


    public Personne(String nom, String prenom, int dateDeNaissance, String adresse, String ville) {
        this.nom = nom;
        this.prenom = prenom;
        this.dateDeNaissance = dateDeNaissance;
        this.adresse = adresse;
        this.ville = ville;
    }


    public String getNom() {
        return nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public int getDateDeNaissance() {
        return dateDeNaissance;
    }

    public String getAdresse() {
        return adresse;
    }

    public String getVille() {
        return ville;
    }


    public void setAdresse(String adresse) {
        this.adresse = adresse;
    }

    public void setVille(String ville) {
        this.ville = ville;
    }


    public String toString() {
        return "Personne{" +
                "nom='" + nom + '\'' +
                ", prenom='" + prenom + '\'' +
                ", dateDeNaissance=" + dateDeNaissance +
                ", adresse='" + adresse + '\'' +
                ", ville='" + ville + '\'' +
                '}';
    }


    public void modifiePersonne(String adresse, String ville){
        setAdresse(adresse);
        setVille(ville);
        
    }


    public String ecrirePersonne(){
        return toString();
    }

}