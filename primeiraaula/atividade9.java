package primeiraaula;
import java.util.Scanner;
public class atividade9 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in); 

		String[] nomes = new String[5]; 

		System.out.println("Digite os 5 nomes: "); 

		for (int i = 0; i < 5; i++) { 

			System.out.println("Nome " + (i + 1)); 

			nomes[i] = scan.nextLine();			 

		} 

		 

	System.out.println("Digitar o nome para Verificar se esta na lista: "); 

	String veri = scan.nextLine(); 

	 

	boolean nom = false; 

	for (String nome : nomes) { 

		 if (nome.equalsIgnoreCase(veri)) { 

			 nom = true; 

 break;  

		 } 

		 if (nom) { 

			 System.out.println("O nome " + veri + "esta na Lista!"); 

		 }else{ 

			 System.out.println("O nome " + veri + "não esta na Lista!"); 

	}

}
	}}
