package aula_03;

import java.util.Scanner;

public class Atividade01_while {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		
		int idade;
		
		int menoresQue21 = 0;
		int maioresQue50 = 0;
		
		System.out.println("Digite uma idade: ");
		idade = leia.nextInt();
		
		while(idade >= 0) {
			if (idade < 21) {
				menoresQue21++;
			}else if (idade > 50) {
				maioresQue50++;
			}
			System.out.println("Digite uma idade: ");
			idade = leia.nextInt();	
		}
		
		System.out.println("Total de pessoas menores de 21 anos: " + menoresQue21);
		
		System.out.println("Total de pessoas maiores de 50 anos: " + maioresQue50);
		
	}

}
