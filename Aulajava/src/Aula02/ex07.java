package Aula02;

import java.util.Scanner;

public class ex07 {

	public static void main(String[] args) {
		Scanner it = new Scanner(System.in);
		String nome = "" ;
		double valor ;
		
		while (!nome.equals("SAIR"))
		{
			System.out.println("Informe seu nome: SAIR para sair ");
			nome = it.next();
			
			nome = nome.toUpperCase();
			if(!nome.equals("SAIR")) 
			{
				System.out.println("Informe Valor da venda: ");
				valor = it.nextDouble();
				System.out.println(nome+" vendeu: "+valor);
			}
		}
		

	}

}
