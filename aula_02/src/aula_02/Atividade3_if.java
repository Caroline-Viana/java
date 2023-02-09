package aula_02;

import java.util.Scanner;

public class Atividade3_if {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		
		String nome;
		int idade;
		boolean primeiraDoacao;
		
		System.out.println("Digite o nome do doador: ");
		leia.skip("\\R?");
		nome = leia.nextLine();
		
		System.out.println("Digite a idade do doador: ");
		idade = leia.nextInt();
		
		System.out.println("Digite true se essa não é a primeira doação do doador ou digite false se essa é a primeira doação do doador:");
		primeiraDoacao = leia.nextBoolean();
		
		if (idade >=18 && idade <= 69 && primeiraDoacao == true) {
			System.out.println(nome + " está apta para doar sangue!");
		} else {
			System.out.println(nome + " não está apto para doar sangue!");
		}
		leia.close();

	}

}
