package aula_02;

import java.util.Scanner;

public class Atividade2_if {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);

		int numero;

		System.out.println("Digite um número: ");
		numero = leia.nextInt();

		if ((numero % 2) == 0)
			System.out.println("O número " + numero + " é par");
		else
			System.out.println("O número " + numero + " é ímpar");

		if (numero >= 0)
			System.out.println("O número " + numero + " é positivo");
		else
			System.out.println("O número " + numero + " é negativo");
	}

}
