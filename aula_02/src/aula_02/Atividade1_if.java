package aula_02;

import java.util.Scanner;

public class Atividade1_if {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		int numeroA;
		int numeroB;
		int numeroC;
		
		System.out.println("Digite o número A: ");
		numeroA = leia.nextInt();
		
		System.out.println("Digite o número B: ");
		numeroB = leia.nextInt();
		
		System.out.println("Digite o número C: ");
		numeroC = leia.nextInt();
		
		if ((numeroA += numeroB) > numeroC) {
			System.out.println(numeroA + " + " + numeroB + " > " + numeroC);
			System.out.println("A soma do número " + numeroA + "e do número " + numeroB + "é maior que o número " + numeroC);
		}else if ((numeroA += numeroB) < numeroC) {
			System.out.println(numeroA + " + " + numeroB + " < " + numeroC);
			System.out.println("A soma do número " + numeroA + "e do número " + numeroB + "é menor que o número " + numeroC);
		}else{
			System.out.println(numeroA + " + " + numeroB + " = " + numeroC);
			System.out.println("A soma do número " + numeroA + "e do número " + numeroB + "é igual que o número " + numeroC);
		}	
		leia.close();

	}

}
