package aula_01;

import java.util.Scanner;

public class Atividade4 {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		
		int numero1;
		int numero2;
		int numero3;
		int numero4;
		int produto;
		
		System.out.println("Digite o número 1: ");
		numero1 = leia.nextInt();
		
		System.out.println("Digite o número 2: ");
		numero2 = leia.nextInt();
		
		System.out.println("Digite o número 3: ");
		numero3 = leia.nextInt();
		
		System.out.println("Digite o número 4: ");
		numero4 = leia.nextInt();
		
		produto = (numero1 * numero2) - (numero3 * numero4);
		
		System.out.println("O resultado do produto é: " + produto);

	}

}
