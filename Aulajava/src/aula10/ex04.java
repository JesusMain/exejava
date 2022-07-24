package aula10;

import java.util.Scanner;

public class ex04 {

	public static void main(String[] args) {
		Scanner it = new Scanner(System.in);
		int[][] valores = new int[3][3];
		double soma = 0;

		for (int lin = 0; lin < valores.length; lin++) {
			for (int col = 0; col < valores[lin].length; col++) {
				System.out.println("Digite os Valores: ");
				valores[lin][col] = it.nextInt();
				if(lin==col) {
					soma+=valores[lin][col];	
				}
			}
		}
			System.out.println("Valor: "+soma);
	}
}
