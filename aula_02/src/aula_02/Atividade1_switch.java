package aula_02;

import java.util.Scanner;

public class Atividade1_switch {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		
		int produto;
		int quantidade;
		
		System.out.println("Produtos\n");
		System.out.println("1\t-\tCachorro Quente");
		System.out.println("2\t-\tX-Salada");
		System.out.println("3\t-\tX-Bacon");
		System.out.println("4\t-\tBauru");
		System.out.println("5\t-\tRefrigerante");
		System.out.println("6\t-\tSuco de laranja\n\n");

		
		System.out.println("Qual produto você deseja comprar?");
		produto = leia.nextInt();
		
		System.out.println("Qual a quantidade do produto que você quer comprar?");
		quantidade = leia.nextInt();
		
		switch(produto) {
		case 1:
			System.out.println("O valor total da compra é R$" + (quantidade * 10)); 
			break;
		case 2:
			System.out.println("O valor total da compra é R$" + (quantidade * 15));
			break;
		case 3:
			System.out.println("O valor total da compra é R$" + (quantidade * 18));
			break;
		case 4:
			System.out.println("O valor total da compra é R$" + (quantidade * 12));
			break;
		case 5:
			System.out.println("O valor total da compra é R$" + (quantidade * 8));
			break;
		case 6:
			System.out.println("O valor total da compra é R$" + (quantidade * 13));
			break;
		}
		
		leia.close();
	}

}
