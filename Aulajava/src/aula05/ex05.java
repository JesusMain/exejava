package aula05;

import java.util.Scanner;

public class ex05 {

	public static void main(String[] args) {
		Scanner it = new Scanner(System.in);
		double[]posi = new double[5];
		
		for (int i = 0; i < 5; i++) {
		System.out.println("Informe o valor: ");
		posi[i] = it.nextDouble();
		
		}
		for (int i = 0; i < 5; i++) {
			System.out.println(posi[i]*posi[i]);
		}

	}

}
