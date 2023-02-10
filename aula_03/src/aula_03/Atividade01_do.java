package aula_03;

import java.util.Scanner;

public class Atividade01_do {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);

		int numero = 0;
		int soma = 0;

		do {

			System.out.println("Digite um número: ");
			numero = leia.nextInt();

			soma += numero;

		} while (numero != 0);

		System.out.println("A soma dos números positivos é: " + soma);

	}

}
