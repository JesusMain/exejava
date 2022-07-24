package encerravetor;

import java.util.Scanner;

public class ex03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner it = new Scanner(System.in);
		double []valor1 = new double[6];
		double []valor2 = new double[6];
		
		for (int i = 0; i < valor2.length; i++) {
			System.out.println("Informe os valores da 1: ");
			valor1[i] = it.nextDouble();
			System.out.println("Informe os valores da 2: ");
			valor2[i] = it.nextDouble();
			
		}
		for (int i = 0; i < valor2.length; i++) {
		System.out.println(valor1[i]+" * "+valor2[i]+" = "+valor1[i]*valor2[i]);
		
		}
	}

}
