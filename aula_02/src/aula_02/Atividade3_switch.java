package aula_02;

import java.util.Scanner;

public class Atividade3_switch {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		
		float numero1;
		float numero2;
		int operacao;
		
		System.out.println("Digite o número 1: ");
		numero1 = leia.nextFloat();
		
		System.out.println("Digite o número 2: ");
		numero2 = leia.nextFloat();
		
		System.out.println("Operações\n");
		System.out.println("1\t-\tSoma");
		System.out.println("2\t-\tSubtração");
		System.out.println("3\t-\tMultiplicação");
		System.out.println("4\t-\tDivisão\n");
		
		System.out.println("Escolha a operação desejada: ");
		operacao = leia.nextInt();
		
		switch (operacao) {
		case 1:
			System.out.println(numero1 + " + " + numero2 + " = " + (numero1 + numero2));
			break;
		case 2:
			System.out.println(numero1 + " - " + numero2 + " = " + (numero1 - numero2));
			break;
		case 3:
			System.out.println(numero1 + " * " + numero2 + " = " + (numero1 * numero2));
			break;
		case 4:
			System.out.println(numero1 + " / " + numero2 + " = " + (numero1 / numero2));
			break;
		default:
			System.out.println("Operação inválida!");
		}
		
		leia.close();

	}

}
