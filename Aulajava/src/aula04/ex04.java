package aula04;

import java.util.Scanner;

public class ex04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner it = new Scanner(System.in);
		String nome;

		for (int i = 0; i < 10; i++) {
	
			System.out.println("Informar um nome: ");
			nome = it.next();
			nome = nome.toUpperCase();
			if(nome.equals("SAIR")) {
				break;
			}
}
		System.out.println("Termino do código");
	}

}
