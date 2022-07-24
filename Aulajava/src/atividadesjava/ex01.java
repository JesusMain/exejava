package atividadesjava;

import java.util.Scanner;

public class ex01 {

	public static void main(String[] args) {
		Scanner it = new Scanner(System.in);
		int []numero = new int[5];
		
		
		for (int i = 0; i < 5; i++) {
		System.out.println("Informe os numeros: ");
		numero[i] = it.nextInt();
		
		}
		System.out.println("Qual numero deseja buscar: ");
		int busca = it.nextInt();
		for (int i = 0; i < 5; i++) {
			while(numero[i]==(busca)) {
				System.out.println("A posiçao é: "+i);
				break;
			}
		}

	}

}
