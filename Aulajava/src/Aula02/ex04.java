package Aula02;

import java.util.Scanner;

public class ex04 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner("System.in");
		String nome = "";
		
		while(!nome.equals("SAIR"))
		// ! não é igual
		{
			System.out.println("Informe seu nome: ");
			nome = entrada.next();
			nome = nome.toUpperCase();
		}

											}

					}
