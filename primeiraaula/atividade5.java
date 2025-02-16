package primeiraaula;
import java.util.Scanner;
public class atividade5 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in); 

		int n1; 

		System.out.println("Digite um Número: "); 

		n1 = scan.nextInt(); 

		if(n1 % 2 == 0) { 

			System.out.println("Seu numero é par!"); 

		}else { 

			System.out.println("Seu numéro é impar!"); 

		} 
	}

}
