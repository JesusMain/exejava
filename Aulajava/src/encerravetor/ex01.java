package encerravetor;

import java.util.Scanner;

public class ex01 {

	public static void main(String[] args) {
		Scanner it = new Scanner(System.in);
		int []numero = new int[10];
		int acumulador=0;
		double numN = 0;
		double numP = 0;
		
		for (int i = 0; i < numero.length; i++) {
			System.out.println("Digite os numros: ");
			numero[i] = it.nextInt();
			
			acumulador = acumulador+numero[i];
			if(numero[i]<0) {
				numN=numN+numero[i];
			}else if(numero[i]>=0) {
				numP=numP+numero[i];
			}
			
		}
		System.out.println("Soma total: "+acumulador);
		System.out.println("Numeros negativos: "+numN);
		System.out.println("A soma dos numeros positivos: " +numP);
	}

}
