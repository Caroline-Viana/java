package aula_01;

import java.util.Scanner;

public class Atividade1 {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		
		float salario;
		float abono;
		float salarioFinal;
		
		System.out.println("Digite o salério: ");
		salario = leia.nextFloat();
		
		System.out.println("Digite o abono: ");
		abono = leia.nextFloat();
		
		salarioFinal = salario + abono;
		
		System.out.println("Seu saerio final é: " + salarioFinal);

	}

}
