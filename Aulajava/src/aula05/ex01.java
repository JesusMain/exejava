package aula05;

import java.util.Scanner;

public class ex01 {

	public static void main(String[] args) {
		Scanner it = new Scanner(System.in);
		int vetor[] = new int[5];//declara��o e aloca��o de espa�o para o vetor "vetor"
		int i; //indice ou posi��o
		
		for (i = 0; i < vetor.length; i++) {
			System.out.println("Digite n�mero: ");
			vetor[i] = it.nextInt();
		}
		for (i = 0; i < vetor.length; i++) {
			System.out.println(vetor[i]);
		}
	}

}
