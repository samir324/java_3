package Test_EX4;

public class Main {

    public static void main(String[] args) {
        Secretaire aaaaa = new Secretaire("aaaaa", "bbbbbb",2000,"zzzzz","yyyyyy","1");
        System.out.println(aaaaa.ecrirePersonne());
        aaaaa.modifiePersonne("ccccc","kkkkkkkkk");
        System.out.println(aaaaa.getAdresse());
        System.out.println(aaaaa.getVille());
        System.out.println(aaaaa.toString());
        System.out.println(aaaaa.ecrirePersonne());
    }
}