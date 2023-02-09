package aula_02;

import java.util.Scanner;

public class Atividade4_switch {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		
		int operacao;
		float saque;
		float deposito;
		float saldo = 1000;
		
		System.out.println("Operações\n");
		System.out.println("1\t-\tSaldo");
		System.out.println("2\t-\tSaque");
		System.out.println("3\t-\tDepósito\n");
		
		System.out.println("Qual operação você quer realizar? ");
		operacao = leia.nextInt();
		
		switch(operacao) {
		case 1:
			System.out.println("Seu saldo é: R$" + saldo);
			break;
		case 2:
			System.out.println("Digite o valor que deseja sacar: ");
			saque = leia.nextFloat();
			if(saldo < saque) {
				System.out.println("Saldo Insuficiente!");
			} else {
				System.out.println("Novo saldo: R$" + (saldo - saque));
			}
			break;
		case 3:
			System.out.println("Qual o valor que você quer depositar? ");
			deposito = leia.nextFloat();
			System.out.println("Novo saldo: R$" + (saldo + deposito));
			break;
		default:
			System.out.println("Operação Inválida!");
		}
		
		leia.close();
	}

}
