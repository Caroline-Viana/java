package aula_02;

import java.util.Scanner;

public class Atividade2_switch {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);

		String nome;
		int cargo;
		float salario;

		System.out.println("Nome do colaborador: ");
		leia.skip("\\R?");
		nome = leia.nextLine();

		System.out.println("Cargos\n");
		System.out.println("1\t-\tGerente");
		System.out.println("2\t-\tVendedor");
		System.out.println("3\t-\tSupervisor");
		System.out.println("4\t-\tMotorista");
		System.out.println("5\t-\tEstoquista");
		System.out.println("6\t-\tTécnico de TI\n\n");

		System.out.println("Cargo: ");
		cargo = leia.nextInt();

		System.out.println("Salário sem o reajuste: ");
		salario = leia.nextFloat();

		switch (cargo) {
		case 1:
			System.out.println(
					"Nome: " + nome + "\nCargo: " + cargo + "\nSalério com reajuste: " + (salario + (0.10 * salario)));
			break;
		case 2:
			System.out.println(
					"Nome: " + nome + "\nCargo: " + cargo + "\nSalério com reajuste: " + (salario + (0.07 * salario)));
			break;
		case 3:
			System.out.println(
					"Nome: " + nome + "\nCargo: " + cargo + "\nSalério com reajuste: " + (salario + (0.09 * salario)));
			break;
		case 4:
			System.out.println(
					"Nome: " + nome + "\nCargo: " + cargo + "\nSalério com reajuste: " + (salario + (0.06 * salario)));
			break;
		case 5:
			System.out.println(
					"Nome: " + nome + "\nCargo: " + cargo + "\nSalério com reajuste: " + (salario + (0.05 * salario)));
			break;
		case 6:
			System.out.println(
					"Nome: " + nome + "\nCargo: " + cargo + "\nSalério com reajuste: " + (salario + (0.08 * salario)));
			break;
		}
		leia.close();

	}

}
