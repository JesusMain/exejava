package aulamatriz;

import java.util.Scanner;

public class ex04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner it = new Scanner(System.in);
		double[][] valores = new double[3][3];
		double soma = 0;

		for (int lin = 0; lin < valores.length; lin++) {
			for (int col = 0; col < valores[lin].length; col++) {
				System.out.println("Valor: "+lin + col);
				valores[lin][col] = it.nextDouble();
			}
		}
		for (int lin = 0; lin < valores.length; lin++) {
			for (int col = 0; col < valores[lin].length; col++) {
				System.out.print(valores[lin][col]+" - ");
				soma += valores[lin][col];
			}
			System.out.println("");
		}
		System.out.println("Soma total: "+soma);
		System.out.println("Media Total: "+soma/9);
	}

}
