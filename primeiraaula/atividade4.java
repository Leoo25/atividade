package primeiraaula;
import java.util.Scanner;
public class atividade4 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in); 

		int n1; 

		System.out.println("Digite um Número: "); 

		n1 = scan.nextInt(); 

		int n2 = 0; 

		while(n2 <= 10)	 

		{ 

			int resul = n1 * n2; 

			System.out.println(resul); 

			n2++; 

	}

}
}