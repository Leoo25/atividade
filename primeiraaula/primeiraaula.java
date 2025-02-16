package primeiraaula;
import java.util.Scanner;
public class primeiraaula {

	public static void main(String[] args) {
	
		Scanner scan = new Scanner(System.in); 
			int n1; 
			System.out.println("Digite um numero: "); 
			n1 = scan.nextInt(); 
			if(n1 > 0) { 
				System.out.println("O primeiro é Positivo!"); 
			}else { 
				System.out.println("O Segundo é Negativo!"); 
			}
		}
	}
	

