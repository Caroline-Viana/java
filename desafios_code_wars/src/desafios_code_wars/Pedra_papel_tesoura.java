package desafios_code_wars;

import java.util.Scanner;

public class Pedra_papel_tesoura {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		
		String jogador1;
		String jogador2;
		
		System.out.println("É a vez do jogador 01: Escolha entre 'Pedra', 'Papel', 'Tesoura'.");
		leia.skip("\\R?");
		jogador1 = leia.nextLine();
		
		System.out.println("É a vez do jogador 02: Escolha entre 'Pedra', 'Papel', 'Tesoura'.");
		leia.skip("\\R?");
		jogador2 = leia.nextLine();
		
		if (jogador1.equalsIgnoreCase("Pedra") && jogador2.equalsIgnoreCase("Tesoura"))
			System.out.println("O jogador 01 GANHOU!");
		else if (jogador1.equalsIgnoreCase("Pedra") && jogador2.equalsIgnoreCase("Pedra"))
			System.out.println("EMPATE!");
		else if (jogador1.equalsIgnoreCase("Tesoura") && jogador2.equalsIgnoreCase("Papel"))
			System.out.println("O jogador 01 GANHOU!");
		else if (jogador1.equalsIgnoreCase("Tesoura") && jogador2.equalsIgnoreCase("Tesoura"))
			System.out.println("EMPATE!");
		else if (jogador1.equalsIgnoreCase("Papel") && jogador2.equalsIgnoreCase("Pedra"))
			System.out.println("O jogador 01 GANHOU!");
		else if (jogador1.equalsIgnoreCase("Papel") && jogador2.equalsIgnoreCase("Papel"))
			System.out.println("EMPATE!");
		else
			System.out.println("O jogador 02 GANHOU!");
		
		leia.close();

	}

}
