package aula05;

import java.util.Scanner;

public class ex02 {

	public static void main(String[] args) {
		Scanner it = new Scanner(System.in);
		String vet[] = new String[5];
		for (int i = 0; i < vet.length; i++) {
			System.out.println("Informe o nome para a posição: "+i+" ");
			vet[i] = it.next();
		}
		for (int i = 0; i < vet.length; i++) {
			System.out.println("Nome: "+vet[i]);
		}

	}

}
