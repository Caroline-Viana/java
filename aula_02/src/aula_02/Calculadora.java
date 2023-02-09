package aula_02;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Calculadora {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		DecimalFormat df = new DecimalFormat("###.##");
		
		double n1, n2;
		
		System.out.println("Digite o 1° número: ");
		n1 = leia.nextDouble();
		System.out.println("Digite o 2° número: ");
		n2 = leia.nextDouble();
		
		System.out.println("O resultado é: " + (n1 + n2));
		System.out.println("O resultado é: " + (n1 - n2));
		System.out.println("O resultado é: " + (n1 * n2));
		if (n2 != 0)
			System.out.println("O resultado é: " + (n1 / n2));
		else
			System.out.println("Não é possivel dividir o número por zero");
		System.out.println("O resultado é: " + Math.pow(n1, n2));
		System.out.println("O resultado é: " + df.format(Math.sqrt(n1)));
		
		/*System.out.println("Pós incremento");
		System.out.println(n1);
		System.out.println(n1 ++);
		System.out.println(n1);
		
		System.out.println("Pré incremento");
		System.out.println(n2);
		System.out.println(++ n2);
		
		System.out.println("A somo de n1 + n2 é igual a: " + (n1 += n2));
		System.out.println("O novo valor de n1 é: " + n1);*/
	
		leia.close();

	}

}
