package PolymorEx1;

public class Main {
    public static void main(String[] args) {


        Employee Employee1 = new Employee("Employee1", "Employee1", "youssoufia", 2000, 5000);
        Employee Employee2 = new Employee("Employee2", "Employee2", "youssoufia", 2001, 6000);
        Employee Employee3 = new Employee("Employee3", "Employee3", "youssoufia", 2002, 7000);
        Employee Employee4 = new Employee("Employee1", "Employee4", "youssoufia", 2003, 6000);
        Employee Employee5 = new Employee("Employee1", "Employee5", "youssoufia", 2004, 5000);

        Chef Chef1 = new Chef("karim","karim", "marrakech", 2000, 9000, "equipe1");
        Chef Chef2 = new Chef("ahmed","ahmed", "marrakech", 1997, 9500, "equipe2");

        Directeur Directeur1 = new Directeur("amine","amine", "youssoufia", 1992, 20000, "Generale", "RRR");

        Directeur1.Afficher();

    }
}
