package Test_EX2;

public class ArticleEnSolde extends Article{
    private double remise;

    public double getRemise() {
        return remise;
    }

    public void setRemise(double newremise) {
        this.remise = newremise;
    }
    public void afficher(){
       
        System.out.println("new prix :"+ (getPrix()-(getPrix()*remise/100)));
    }

    public static void main(String[] args) {
        ArticleEnSolde newArticle = new ArticleEnSolde();
        newArticle.setNom("adidas");
        newArticle.setPrix(1000);
        newArticle.setRemise(10);
        newArticle.afficher();
    }


}