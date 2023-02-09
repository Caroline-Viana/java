package aula_02;

import java.util.Scanner;

public class PlanoSaudeV2 {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		int faixa;
		
		System.out.println("Faixas etárias\n");
		System.out.println("1\t-\taté 10 anos");
		System.out.println("2\t-\tde 11 a 29 anos");
		System.out.println("3\t-\tde 30 a 45 anos");
		System.out.println("4\t-\tde 46 a 59 anos");
		System.out.println("5\t-\tde 60 a 65 anos");
		System.out.println("6\t-\tacima de 65 anos\n\n");

		System.out.println("Digite a sua faixa etária: ");
		faixa = leia.nextInt();
		
		switch(faixa) {
		
		case 1:
			System.out.println("O valor do plano é R$100,00");
			break;
		case 2:
			System.out.println("O valor do plano é R$200,00");
			break;
		case 3:
			System.out.println("O valor do plano é R$300,00");
			break;
		case 4:
			System.out.println("O valor do plano é R$500,00");
			break;
		case 5:
			System.out.println("O valor do plano é R$600,00");
			break;
		case 6:
			System.out.println("O valor do plano é R$1000,00");
			break;
		default:
			System.out.println("Faiza etária inválida");
		}

		leia.close();
	}

}
