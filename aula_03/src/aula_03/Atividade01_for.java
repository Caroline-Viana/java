package aula_03;

import java.util.Scanner;

public class Atividade01_for {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);

		int numero1;
		int numero2;

		System.out.println("Digite o primeiro número do intervalo: ");
		numero1 = leia.nextInt();

		System.out.println("Digite o segundo número do intervalo: ");
		numero2 = leia.nextInt();

		if (numero1 < numero2) {
			System.out.println("No Intervalo entre " + numero1 + " e " + numero2 + " : ");
			for (int contador = numero1; contador <= numero2; contador++) {
				if (contador % 3 == 0 && contador % 5 == 0) {
					System.out.println(contador + " é múltiplo de 3 e 5");
				}
			}
		} else
			System.out.println("Intervalo inválido!");

		leia.close();
	}

}
