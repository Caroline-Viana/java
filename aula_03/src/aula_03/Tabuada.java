package aula_03;

import java.util.Scanner;

public class Tabuada {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		int numero;
		boolean ok = false;
		String continua;

		do {
			do {
				System.out.println("\nDigite a Tabuada que você deseja calcular: ");
				numero = leia.nextInt();

				if (numero < 1 || numero > 10)
					System.out.println("\nDigite um número entre 1 e 10");
				else
					ok = true;
			} while (ok == false);

			for (int contador = 1; contador <= 10; contador++) {
				System.out.println("\n" + numero + " X " + contador + " = " + (numero * contador));
			}
			
			ok = false;

			System.out.println("\nQuar continuar: Digite S (sim) ou N (não)");
			leia.skip("\\R?");
			continua = leia.nextLine();

		} while (continua.equalsIgnoreCase("S"));
		leia.close();
	}

}
