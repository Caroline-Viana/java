package aula_01;

import java.util.Scanner;

public class Atividade3 {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		
		float salarioBruto;
		float adicionalNoturno;
		float horasExtras;
		float descontos;
		float salarioLiquido;
		
		System.out.println("Digite o valor do Salário Bruto: ");
		salarioBruto = leia.nextFloat();
		
		System.out.println("Digite o valor do Adicional Noturno: ");
		adicionalNoturno = leia.nextFloat();
		
		System.out.println("Digite o valor das Horas Extras: ");
		horasExtras = leia.nextFloat();
		
		System.out.println("Digite o valor dos Descontos: ");
		descontos = leia.nextFloat();
		
		salarioLiquido = salarioBruto + adicionalNoturno + (horasExtras * 5) - descontos;
		
		System.out.println("Seu salário líquido é: " + salarioLiquido);

	}

}
