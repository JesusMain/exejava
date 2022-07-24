package aula10;

import java.util.Scanner;

public class ex03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner it = new Scanner(System.in);
		int[][] valores = new int[3][3];
		int valor = 0;

		for (int lin = 0; lin < valores.length; lin++) {
			for (int col = 0; col < valores[lin].length; col++) {
				System.out.println("Digite os Valores do array: ");
				valores[lin][col] = it.nextInt();
				}
			}
			System.out.println("Digite o valor de busca: ");
			valor = it.nextInt();
		
		for (int lin = 0; lin < valores.length; lin++) {
			for (int col = 0; col < valores[lin].length; col++) {
				if(valor==valores[lin][col]) {
					System.out.println("Array: "+valores[lin][col]+" Linha: "+lin+" Coluna: "+col);
				}
			}
		}
	}
}
