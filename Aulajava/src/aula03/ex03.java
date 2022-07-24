package aula03;

import java.util.Scanner;

public class ex03 {

	public static void main(String[] args) {
		Scanner it = new Scanner(System.in);
		String nome = "";
		int numero = 0;
		int contador = 0;
		double salario = 0;
		double acumulador = 0;
		
		System.err.println("Quantos motoristas possuem na frota: ");
		numero = it.nextInt();
		
		for (int i = 0; i < numero; i++) {
			System.err.println("Nome do Motorista: ");
			nome = it.next();
			System.err.println("Qual o salario: ");
			salario = it.nextDouble();
		if (salario > 3000) {
			acumulador = acumulador+salario;
			contador = contador+1;
		}
		}
		
		System.out.println("Valor acumulado dos salarios maiores q 3k: "+acumulador);
		System.out.println("Quantidade de salarios maiores que 3k: "+contador);
	}

}
