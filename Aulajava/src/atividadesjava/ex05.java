package atividadesjava;

import java.util.Scanner;

public class ex05 {

	public static void main(String[] args) {
		Scanner it = new Scanner(System.in);
		int []vetor1 = new int[10];
		int []vetor2 = new int[10];
		int []vetor3 = new int[10];
		
		for (int i = 0; i < 10; i++) {
		System.out.println("Informe os numeros 1 vetor: ");
		vetor1[i] = it.nextInt();
		vetor3[i] = vetor1[i];
		System.out.println("Informe os numeros 2 vetor: ");
		vetor2[i] = it.nextInt();
		
		vetor1 [i] = vetor2[i];
		vetor2[i] = vetor3[i];
		}
		
		for (int i = 0; i < 10; i++) {
			System.out.println("vetor 1: " +vetor1[i]);
			System.out.println("vetor 2: " +vetor2[i]);
		}

	}

}
