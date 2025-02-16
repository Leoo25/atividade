package primeiraaula;
import java.util.Scanner;
public class atividade7 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in); 

		int n1;  

	 	System.out.println("Digite sua Idade: " );  



	 		n1 = scan.nextInt();  

	 		if(n1 < 18) {  

	 			System.out.println("Você é uma Criança!");  

	 		}else if (n1 < 60){  

	 			System.out.println("Você é Adulta!");  

	 		}else {  

	 			System.out.println("Você é Idosa!");
	}
	}
}
