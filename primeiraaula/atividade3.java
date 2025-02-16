package primeiraaula;
import java.util.Scanner;
public class atividade3 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in); 

		int n1; 

		System.out.println("1 - Calcular a Área do Quadrado"); 

		System.out.println("2 - Calcular a Área do Circulo"); 

		n1 = scan.nextInt(); 

		switch(n1) { 

		case 1: 

		System.out.println("Digite a Altura: "); 

		double altura = scan.nextDouble(); 

		System.out.println("Digite o Comprimento: "); 

		double comp = scan.nextDouble(); 

		double resul = altura * comp; 

		System.out.println("A área do seu Quadrado é: " + resul); 

		break; 

		 

		case 2:{ 

		System.out.println("Digite o Raio: "); 

		double raio = scan.nextDouble(); 

		double result = (Math.pow(raio, 2)) * Math.PI; 

		result = Math.round(result); 

		System.out.println("A área do seu Circulo é: " + result); 

		} 

		break; 

		default:  

		System.out.println("Erro"); 

		break; 

		 
	}
	}
}
