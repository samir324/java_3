package Test_EX2;

public class Article {
    private String nom;
    private double prix;

    public void afficher(){
        System.out.println("Article name : "+nom + " Prix : "+prix);
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public double getPrix() {
        return prix;
    }

    public void setPrix(double prix) {
        this.prix = prix;
    }

    /*
    public static void main(String[] args) {

        Article newArticle1 =new Article();
        newArticle1.nom="sport";
        newArticle1.prix=200;
        newArticle1.afficher();
    }*/
}



