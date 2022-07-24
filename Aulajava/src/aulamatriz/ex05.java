package aulamatriz;

import java.util.Scanner;

public class ex05 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner it = new Scanner(System.in);
		int[][] valores = new int[6][3];
		double soma = 0;

		for (int lin = 0; lin < valores.length; lin++) {
			for (int col = 0; col < valores[lin].length; col++) {
				System.out.println("Valor: "+lin + col);
				valores[lin][col] = it.nextInt();
			}
		}
		for (int lin = 0; lin < valores.length; lin+=2) {
			
			for (int col = 0; col < valores[lin].length; col++) {
				System.out.print(valores[lin][col]+" - ");
				soma += valores[lin][col];
			//if (lin %2==0) {
			// soma+=valores[lin][col];	
			//}
			}
			System.out.println("linha:"+lin+" ");
		}
		System.out.println("Soma total: "+soma);
		
	}
}
