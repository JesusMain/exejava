package Aula02;

import java.util.Scanner;

public class ex05 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		String nome = "";
		int contador = 0;
		
		while(!nome.equals("SAIR"))
		{
			System.out.println("Informe seu nome:");
			nome = entrada.next();
			nome = nome.toUpperCase();
			if(!nome.equals("SAIR"))
			{
			contador++;
			}
		}
		System.out.println("Voce informou: "+contador+" nomes ");

	}

}
