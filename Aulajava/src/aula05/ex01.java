package aula05;

import java.util.Scanner;

public class ex01 {

	public static void main(String[] args) {
		Scanner it = new Scanner(System.in);
		int vetor[] = new int[5];//declaração e alocação de espaço para o vetor "vetor"
		int i; //indice ou posição
		
		for (i = 0; i < vetor.length; i++) {
			System.out.println("Digite número: ");
			vetor[i] = it.nextInt();
		}
		for (i = 0; i < vetor.length; i++) {
			System.out.println(vetor[i]);
		}
	}

}
