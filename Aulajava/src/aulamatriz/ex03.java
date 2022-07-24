package aulamatriz;

import java.util.Scanner;

public class ex03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner it = new Scanner(System.in);
		String[][] frutas = new String[3][3];

		for (int lin = 0; lin < frutas.length; lin++) {
			for (int col = 0; col < frutas[lin].length; col++) {
				System.out.println("Frutas: "+lin + col);
				frutas[lin][col] = it.next();
			}
		}
		for (int lin = 0; lin < frutas.length; lin++) {
			for (int col = 0; col < frutas[lin].length; col++) {
				System.out.print(frutas[lin][col]+" - ");
			}
			System.out.println("");
		}
	}

}
