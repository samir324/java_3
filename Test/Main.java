package Test;
public class Main {

	public static void main(String[] args) {
		Employe client1 = new Employe("El alami "," Mohammad","Casablanca",1963, 2020);  
		client1.afficherInfosClient();
		System.out.println(" et sont age est:"+ " "+  client1.calculerAge());
	
		
		Employe client2 = new Employe("El wahabi "," Khalid","Casablanca",1990, 2020);   
		client2.afficherInfosClient();
		
		System.out.println(" et sont age est:"+ " "+ client2.calculerAge());
	
		
		Employe client3 =new Employe("Sbai "," Fouad","Casablanca",2006, 2020);   
		client3.afficherInfosClient();
		System.out.println(" et sont age est:"+ " "+  client3.calculerAge());
		
	}

}


