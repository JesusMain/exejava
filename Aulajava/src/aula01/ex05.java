package aula01;

import java.util.Scanner;

public class ex05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner leia = new Scanner(System.in);

		System.out.println("Digite O Nome: ");
		String nome = leia.next();
		System.out.println("Digite a idade: ");
		int idade = leia.nextInt();
		if(idade>=18) {
		System.out.println(nome+"Maior de idade ");
		}
		else {
		System.out.println(nome+"Menor de Idade: ");
		}
	}

}
