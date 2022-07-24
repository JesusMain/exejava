package aula01;

import java.util.Scanner;

public class ex04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner leia = new Scanner(System.in);

		System.out.println("Digite o Nome da mercadoria: ");
		String merc = leia.next();
		
		System.out.println("Digite o Valor da Mercadoria: ");
		double valor = leia.nextDouble();

		System.out.println("Digite a quantidade: ");
		int quant = leia.nextInt();
				
		double total = 0;
		total = valor*quant;

		System.out.println("O Valor total a pagar: "+total);
	}

}
