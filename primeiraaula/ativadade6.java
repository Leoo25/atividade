package primeiraaula;
import java.util.Scanner;
public class ativadade6 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in); 

		int n1;  

		System.out.println("Digite um Número: "); 

		n1 = scan.nextInt(); 

		int n2 = n1; 

		while(n1 > 1) { 

		 

		n2 = n2*(n1-1); n1--; 

			 

			System.out.println("O calculo fatorial é: " + n2 ); 

		} 

	}

}
