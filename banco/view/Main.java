package br.edu.fatecpg.banco.view;
import br.edu.fatecpg.banco.model.Conta;

public class Main {

	public static void main(String[] args) {
		Conta contaFla = new Conta(1000,777, "Flavio");
		Conta contaRoger = new Conta(1000,111, "Roger");
		
		contaFla.depositar(100);
		contaFla.depositar(58);
		System.out.println("Nome do Cliente: " +contaFla.getNome());
		System.out.println("Saldo Atual: " +contaFla.getSaldo());
		contaRoger.sacar(400);
	
		contaFla.setNome("Flavio");
		
		contaRoger.depositar(180);
		contaRoger.depositar(245.5);
		System.out.println("Nome do Cliente: " +contaRoger.getNome());
		System.out.println("Saldo Atual: " +contaRoger.getSaldo());
		contaRoger.sacar(500);
		
		contaRoger.setNome("Roger");

		
		
		

	}

}
