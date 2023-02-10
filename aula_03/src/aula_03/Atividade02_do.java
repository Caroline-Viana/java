package aula_03;

import java.util.Scanner;

public class Atividade02_do {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);

		int numero;
		float soma = 0;
		float quantidade = -1;
		float media;

		do {

			System.out.println("Digite um número: ");
			numero = leia.nextInt();

			if (numero % 3 == 0) {
				soma += numero;
				quantidade++;
			}

		} while (numero != 0);

		media = soma / quantidade;

		System.out.println("A média de todos os números múltiplos de 3 é: " + media);

		leia.close();

	}

}
