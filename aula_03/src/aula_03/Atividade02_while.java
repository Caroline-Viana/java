package aula_03;

import java.util.Scanner;

public class Atividade02_while {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);

		int idade;
		int sexo;
		int categoria;
		int backend = 0;
		int frontend = 0;
		int mobile = 0;
		int fullStack = 0;
		String continua = "S";

		while (continua.equalsIgnoreCase("S")) {
			System.out.println("Digite a idade: ");
			idade = leia.nextInt();

			System.out.println("Digite o sexo: ");
			sexo = leia.nextInt();

			System.out.println("Digite a categoria: ");
			categoria = leia.nextInt();

			if (categoria == 1)
				backend++;
			if (categoria == 2 && sexo == 2)
				frontend++;
			if (categoria == 3 && sexo == 1 && idade > 40)
				mobile++;
			if (categoria == 4 && sexo == 2 && idade < 30)
				fullStack++;

			System.out.println("Deseja continuar (s/n): ");
			leia.skip("\\R?");
			continua = leia.nextLine();

		}

		System.out.println("Total de pessoas desenvolvedoras Backend: " + backend);
		System.out.println("Total de mulheres desenvolvedoras Frontend: " + frontend);
		System.out.println("Total de homens desenvolvedores Mobile maiores de 40 anos: " + mobile);
		System.out.println("Total de mulheres desenvolvedoras FullStack menores de 30 anos: " + fullStack);

	}

}
