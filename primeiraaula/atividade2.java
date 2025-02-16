package primeiraaula;
import java.util.Scanner;
public class atividade2 {

	public static void main(String[] args) {
	
		Scanner scan = new Scanner(System.in); 

		int n1, n2; 

		 System.out.println("Digite um Numero Inteiro: " ); 

		 n1 = scan.nextInt(); 

		 System.out.println("Digite outro Numero Inteiro: " ); 

		 n2 = scan.nextInt(); 

		 if(n1 > n2) { 

		 	System.out.println("O primeiro numero é maior!"); 

		 	System.out.println("Os Numeros são diferentes!"); 

		 }else if (n1 < n2){ 

		 	System.out.println("O segundo numero é maior!"); 

		 	System.out.println("Os Numeros são diferentes!"); 

		  

		}else { 

		System.out.println("Seus numeros são iguais!"); 

	}
	}
}
