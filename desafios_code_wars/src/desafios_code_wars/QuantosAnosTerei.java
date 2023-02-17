package desafios_code_wars;

import java.util.Scanner;

public class QuantosAnosTerei {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		
		int anoDeNascimento;
		int anoDesejado;
		
		System.out.println("Qual o ano do seu nascimento?");
		anoDeNascimento = leia.nextInt();
		
		System.out.println("Qual o ano que deseja calcular?");
		anoDesejado = leia.nextInt();
		
		if (anoDeNascimento < anoDesejado) {
			System.out.println("Você tem " + (anoDesejado - anoDeNascimento) + " ano(s) de idade.");
		} else if (anoDeNascimento > anoDesejado) {
			System.out.println("Você nascerá em " + (anoDeNascimento - anoDesejado) + " ano(s).");
		} else
			System.out.println("Você nasceu neste mesmo ano!");
		
		leia.close();

	}

}
