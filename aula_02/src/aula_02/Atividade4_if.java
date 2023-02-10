package aula_02;

import java.util.Scanner;

public class Atividade4_if {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);

		String opcao1;
		String opcao2;
		String opcao3;

		System.out.println("1\t-\tVertebrado");
		System.out.println("2\t-\tInvertebrado");

		System.out.println("Qual das opção acima você escolhe: ");
		leia.skip("\\R?");
		opcao1 = leia.nextLine();

		if (opcao1.equalsIgnoreCase("Vertebrado")) {
			System.out.println("1\t-\tAve");
			System.out.println("2\t-\tMamífero");

			System.out.println("Qual das opção acima você escolhe: ");
			leia.skip("\\R?");
			opcao2 = leia.nextLine();

			if (opcao2.equalsIgnoreCase("Ave")) {
				System.out.println("1\t-\tCarnívoro");
				System.out.println("2\t-\tOnívero");

				System.out.println("Qual das opção acima você escolhe: ");
				leia.skip("\\R?");
				opcao3 = leia.nextLine();
				if (opcao3.equalsIgnoreCase("Carnívoro")) {
					System.out.println("Animal selecionado foi: Águia");
				} else if (opcao3.equalsIgnoreCase("Onívero")) {
					System.out.println("Animal selecionado foi: Pomba");
				} else {
					System.out.println("Opção inválida!");
				}

			} else if (opcao2.equalsIgnoreCase("Mamífero")) {
				System.out.println("1\t-\tOnívero");
				System.out.println("2\t-\tHerbívaro");

				System.out.println("Qual das opção acima você escolhe: ");
				leia.skip("\\R?");
				opcao3 = leia.nextLine();

				if (opcao3.equalsIgnoreCase("Herbívaro")) {
					System.out.println("Animal selecionado foi: Vaca");
				} else if (opcao3.equalsIgnoreCase("Onívero")) {
					System.out.println("Animal selecionado foi: Homem");
				} else {
					System.out.println("Opção inválida!");
				}

			} else {
				System.out.println("Opção inválida!");
			}

		} else if (opcao1.equalsIgnoreCase("Invertebrado")) {
			System.out.println("1\t-\tInseto");
			System.out.println("2\t-\tAnelídeo");

			System.out.println("Qual das opção acima você escolhe: ");
			leia.skip("\\R?");
			opcao2 = leia.nextLine();
			if (opcao2.equalsIgnoreCase("Inseto")) {
				System.out.println("1\t-\tHerbívaro");
				System.out.println("2\t-\tHematófago");

				System.out.println("Qual das opção acima você escolhe: ");
				leia.skip("\\R?");
				opcao3 = leia.nextLine();

				if (opcao3.equalsIgnoreCase("Herbívaro")) {
					System.out.println("Animal selecionado foi: Largata");
				} else if (opcao3.equalsIgnoreCase("Hematófago")) {
					System.out.println("Animal selecionado foi: Pulga");
				} else {
					System.out.println("Opção inválida!");
				}

			} else if (opcao2.equalsIgnoreCase("Anelídeo")) {
				System.out.println("1\t-\tHematófago");
				System.out.println("2\t-\tOnívero");

				System.out.println("Qual das opção acima você escolhe: ");
				leia.skip("\\R?");
				opcao3 = leia.nextLine();

				if (opcao3.equalsIgnoreCase("Hematófago")) {
					System.out.println("Animal selecionado foi: Sanguessuga");
				} else if (opcao3.equalsIgnoreCase("Onívero")) {
					System.out.println("Animal selecionado foi: Minhoca");
				} else {
					System.out.println("Opção inválida!");
				}

			} else {
				System.out.println("Opção inválida!");
			}

		} else {
			System.out.println("Opção inválida!");
		}
		leia.close();
	}

}
