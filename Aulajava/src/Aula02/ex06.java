package Aula02;

import java.util.Scanner;

public class ex06 {

	public static void main(String[] args) {
		Scanner it = new Scanner(System.in);
		String nome = "" ;
		String sexo = "" ;
		int contador = 0;
		
		while (!nome.equals("SAIR"))
		{
			System.out.println("Informe seu nome: SAIR para sair ");
			nome = it.next();
			nome = nome.toUpperCase();
			if(!nome.equals("SAIR")) 
			{
				System.out.println("Informe o sexo: ");
				sexo = it.next();
				contador++;
			}
		}
		System.out.println("Voce informou "+contador+" nomes");
	}

}
