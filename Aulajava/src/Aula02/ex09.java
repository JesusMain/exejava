package Aula02;

import java.util.Scanner;

public class ex09 {

	public static void main(String[] args) {
		Scanner it = new Scanner(System.in);
		String nome = "";
		String nome2 = "";
		int idade2,idade1;
		
		while (!nome.equals("SAIR"))
		{
			System.out.println("Informe o 1 Nome: SAIR para sair ");
			nome = it.next();		
			nome = nome.toUpperCase();
			
			if(!nome.equals("SAIR")) 
			{
				System.out.println("Informe a idade: ");
				idade1 = it.nextInt();
				System.out.println("Informe o 2 Nome: ");
				nome2 = it.next();
				System.out.println("Digite a idade: " );
				idade2 = it.nextInt();
				if(idade1>idade2) 
				{
				System.out.println("A mais velha é a "+nome);
				}else
				{
				System.out.println("A mais velha é a "+nome2);	
				}
			} 
		}

	}

}
